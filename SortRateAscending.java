
package TimeLine;
import java.util.*;
import moment.Moment;


public class SortRateAscending implements Comparator <Moment> {

  @Override
    public int compare(Moment moment1, Moment moment2) {
        
         if (moment1 !=null && moment2 !=null)
         {
             if(moment1.getImportanceRate() < moment2.getImportanceRate())

                return -1;

            else if (moment1.getImportanceRate() > moment2.getImportanceRate())

                return 1;

            else
                return 0;
             }
         return 1;
    }
    
}
