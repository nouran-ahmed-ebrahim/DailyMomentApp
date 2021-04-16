
package daily.moment.app;

/**
 *
 * @author PC
 */

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import user.User;
import usersData.UsersData;

public class Validation {
   
   private static Pattern add;
   private static  Matcher match;
    
     public static void ValidateActualYears(String year) throws Exception{
        int sisYear = Calendar.getInstance().get(Calendar.YEAR);
      
        if(sisYear < Integer.parseInt(year) )
        {
           throw new Exception("Please, Enter Correct Year");
        }
     }
     
     public static void ValidateYear(String year) throws Exception{
         add=Pattern.compile("^[0-9]{4}$");               
         match =add.matcher(year);
        if(!match.find() )
        {
           throw new Exception("Please, Enter Correct Year");
        }
     }
     
     public static void validationNicknameUniquness(String text) throws Exception{
               
           
           for(int index=0;index<User.getNumberOfUser();index++)
           {
               if(UsersData.getUsersData().getUser(index).getNickName().equals(text))
               {
                   throw new Exception("This Nick name is currently in use");
               }
           }
      }
     
     
      public static void validationPoints(String point) throws Exception{
       
          add=Pattern.compile("^[1-5]$");               
          match =add.matcher(point);
        if(!match.find())
         {
             throw new Exception("Please, Enter Number From 1 To 5");
         }
      }
      
    
      
      public static void validationSpace(String text) throws Exception{
        
          if(text.matches("\\s*"))
         {
             throw new Exception("This Field Can Not Be Empty");
         }
      }
      
      
       public static void validationOnlyLetters(String text) throws Exception{
        
          add=Pattern.compile("^[a-zA-Z\\s]+$");               
          match =add.matcher(text);
          if(!match.find())
          {
                throw new Exception("Please, Enter Letters Only");
          }
      }
       
       
       public static void validationPassowrd(String text) throws Exception{
          add=Pattern.compile("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])");               
          match =add.matcher(text);
          if(!match.find())
          {
                throw new Exception("Your password must contain at least one uppercase letter,lowercase letter,one digit");
          }
      }
  
       public static void validationPassowrdConfirmation(String password , String confimation) throws Exception{
          if(password.compareTo(confimation) !=0)
          {
                throw new Exception("Your password must contain at least one uppercase letter,lowercase letter,one digit");
          }
      }
       
       public static void UsersLimitExceededi() throws Exception
       {
           
           if(User.getNumberOfUser() > 10)
           {
                throw new Exception("Sorry ,you can't sign up now");
           }
       }
       
       public static void onlyNumber(String credit) throws Exception
       {
         add=Pattern.compile("^[0-9]{12}$");               
         match =add.matcher(credit);
            if(!match.find() )
            {
               throw new Exception("Please, Enter Correct credit number");
            }
       }
        public static void validationUpdateNickname(String nickName ,int currentUserIndex) throws Exception
        {
               
           for(int index=0;index<User.getNumberOfUser();index++)
           {
               if(currentUserIndex != index && UsersData.getUsersData().getUser(index).getNickName().equals(nickName))
               {
                   throw new Exception("This Nick name is currently in use");
               }
           }
        }        
}
