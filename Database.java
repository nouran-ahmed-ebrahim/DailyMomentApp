
package usersData;


import moment.Achievement;
import moment.Memory;
import moment.Moment;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import moment.MomentFactory;
import user.*;
import user.userFactory.UsersFactory;


public class Database {
    
    
        private static final String url = "jdbc:oracle:thin:@localhost:1521:orcl";
        private static final String ConnetionUsername = "scott";
        private static final String ConnetionPassword = "tiger";
        
        private static UsersData usersData = UsersData.getUsersData();
        private static User [] users = usersData.getUsers();

         public static void saveData() 
        {
            try 
            {
                Connection connection ;
                connection = DriverManager.getConnection(url, ConnetionUsername, ConnetionPassword);
                System.out.println("connection succesed");
                deleteOldData(connection);
                saveUsersData(connection);
                connection.setAutoCommit(false);
                connection.commit();
                connection.close();
                
            } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         
}
  
       private static void saveUsersData(Connection connection ) throws SQLException
         {
              for (int currentUserIndex = 0 ; currentUserIndex < User.getNumberOfUser() ;currentUserIndex++)
                  {
                      String userType ="ordinary";
                      if (users[currentUserIndex] instanceof PremiumUser){
                          userType =  "prime";
                      }
                     
                      String insertUser = "insert into users values ( " + users[currentUserIndex].getId()+" , '"+
                                  users[currentUserIndex].getUserName()+"' , '" + users[currentUserIndex].getPassword()+"' , '" +
                                  users[currentUserIndex].getNickName()+"' , '" +userType+"')";
                          try (Statement statement2 = connection.createStatement()) {
                              statement2.executeUpdate(insertUser);
                          }
                      
                   
                      saveUserTimeline(connection ,currentUserIndex);
            
                  }
         }
         
       
         private static void deleteOldData(Connection connection) throws SQLException
         {
                  String deleteOldTimelines = "delete from timelines";
                  String deleteOldUsersData = "delete from users";
                  Statement statement1 = connection.createStatement();
                  statement1.executeUpdate(deleteOldTimelines);
                  statement1.executeUpdate(deleteOldUsersData);
         }
         
         
         private static void saveUserTimeline( Connection connection , int currentUserIndex ) throws SQLException{
             
            try (Statement statement3 = connection.createStatement()) {
                
                int numOfMomnets =users[currentUserIndex].getUserTimeLine().getNumOfMoments();
                for ( int currentMomentIdx = 0 ; currentMomentIdx < numOfMomnets ;currentMomentIdx++ )
                {
          
                    String inserMoment ;
                    Moment currentMoment = users[currentUserIndex].getUserTimeLine().getTimelineMoments()[currentMomentIdx];
                     if (currentMoment != null)
                     { 
                    if ( currentMoment instanceof Memory){
                        
                        Memory currentMemory = (Memory)currentMoment;
                        
                        inserMoment="INSERT into timelines values ( "+ users[currentUserIndex].getId()+" , '"+
                                currentMemory.getMomentName()+ "' ,"+ currentMemory.getActualYear()+ " , "+
                                currentMemory.getImportanceRate() + ", '"+currentMemory.getDescription()+"' , 'Memory' , '"+
                                currentMemory.getLocation()+"' , " + currentMemory.getHappinessPoints() +" , "+
                                currentMemory.getSadnessPoints() +", null ,null ,"+currentMemory.getIndex() +" , " + currentMemory.getCalcHappiness()+ ")";
                        
                        statement3.executeUpdate(inserMoment);
                    }
                    else{
                        
                        Achievement currentAchieve = (Achievement)currentMoment;
                        
                        inserMoment="INSERT into timelines values ( "+ users[currentUserIndex].getId()+" , '"+
                                currentAchieve.getMomentName()+ "' ,"+ currentAchieve.getActualYear()+ " , "+
                                currentAchieve.getImportanceRate() + ", '"+currentAchieve.getDescription()+"' , 'Achievement' ,"
                                + " null ,null ,null , "+currentAchieve.getProudPoints()+", "+ currentAchieve.getPlannedYear()
                                +","+currentAchieve.getIndex()+" , "  + currentAchieve.CalculateHappiness() + ")";
                        statement3.executeUpdate(inserMoment);
                    }
                   }
                }
            }
                      
}

   public static void readOldData() 
    {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url, ConnetionUsername, ConnetionPassword);
        } catch (SQLException ex) {
            Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
        }
                System.out.println("connection succesed"); // delettt
                readUsersData( connection);
    }
       
       
       private static void readUsersData ( Connection connection ) 
       {
            User currentUser ;  
            
             String selectUsers = "select * from users order by 1  ";
                    try (Statement statment1 = connection.createStatement()) {
                        ResultSet user =  statment1.executeQuery(selectUsers);
                        String userType ;
                        while (user.next()) {
                            
                             userType = user.getString(5);
                              
                             int userID = user.getInt(1);
                             String userName = user.getString(2) ,
                                    userPassword = user.getString(3),
                                    userNickname = user.getString(4);
                             
                             //fillusersdata
                             currentUser = new UsersFactory().getUser(userType);
                             currentUser.fillUserData(userName, userPassword, userNickname);
                            
                             readUserTimeline(currentUser , connection);
                             usersData.addUser(currentUser);  
                        }
                    } catch (SQLException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
            }
       }
       
       
        private static void readUserTimeline(User currentUser ,Connection connection) throws SQLException
       {
           Moment newMoment;
           Object [] MomentData;
           MomentFactory momentFactory= new MomentFactory();
            String selectTimeline = "select * from  timelines where user_id =  "+ currentUser.getId()+ " order by 12 ";
                            try (Statement statment2 = connection.createStatement()) {
                                ResultSet  Moments=  statment2.executeQuery(selectTimeline);
                                
                                while (Moments.next()) {
                                     String momentType =Moments.getString(6);  
                                     String momentName = Moments.getString(2), 
                                            discription = Moments.getString(5) ;
                                     
                                     int actualYear =  Moments.getInt(3) ,
                                            rate =  Moments.getInt(4),
                                          calcHappiness = Moments.getInt(13);
                                   
                                    if (momentType.equals("Memory"))
                                    {
                                       String location = Moments.getString(7);
                                    
                                        int hapPoints = Moments.getInt(8),
                                            sadPoints = Moments.getInt(9);
                                        
                                      MomentData = new Object[]{momentType,momentName,discription,actualYear,rate, hapPoints ,sadPoints, location, calcHappiness};  
                                     
                                    }
                                    else
                                    {
                                        int proudPoint =  Moments.getInt(10) ,
                                            plannedYear = Moments.getInt(11);
                                        
                                     MomentData = new Object[]{momentType,momentName,discription,actualYear,rate , proudPoint , plannedYear};  
                                       
                                    }
                                    
                                     newMoment = momentFactory.getMoment(MomentData);
                                   currentUser.getUserTimeLine().addMoment(newMoment);
                                }   
                              } 
       }
        
                      
}
    

