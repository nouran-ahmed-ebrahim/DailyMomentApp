
package daily.moment.app;

import frams.PremiumHome;
import frams.WelcomPage;
import usersData.Database;


public class DailyMomentApp {
    public static void main(String[] args) {
       
         try{
         Database.readOldData();
         new WelcomPage().setVisible(true);
         new PremiumHome(0).setVisible(true);
         }
         catch(Exception ex)
         {
             Database.saveData();
             throw ex;
         }
    }
    
}
