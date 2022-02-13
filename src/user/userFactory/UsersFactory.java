
package user.userFactory;

import user.*;



public class UsersFactory implements IUserFactory{

  @Override
  public User getUser( String userType ){
     
       switch(userType )
       {
           case "prime" : return new PremiumUser();
                            
           case "ordinary" :  return new OrdinaryUsers();
         
           default: return null;
       }
       
  }

  
    
}
