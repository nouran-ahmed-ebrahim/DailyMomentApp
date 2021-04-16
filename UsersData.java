
package usersData;


import user.*;

 
public class UsersData {
    
     private User []usersdata =new User[10];

     private static UsersData Users = new UsersData();
     
     private UsersData(){};
     
     public static UsersData getUsersData()
     {
         return Users;
     }
     
     public void addUser(User newUser)
       {
           int numOfUsers = User.getNumberOfUser()-1;
           usersdata[numOfUsers] = newUser;
       }
       
       public int findUser(String userNickName , String password)
       {
              int numOfUsers = User.getNumberOfUser();
          for(int userIndex =0 ; userIndex < numOfUsers ; userIndex++)
          {
              if(usersdata[userIndex].getNickName().compareTo(userNickName) ==0 && usersdata[userIndex].getPassword().compareTo(password) == 0)
              {
               return userIndex;
              } 
          }
          return -1;
       }
       public User getUser(int userIndex)
       {
          return usersdata[userIndex];
       }
       

    public User[] getUsers() {
        return usersdata;
    }
    
     
}
