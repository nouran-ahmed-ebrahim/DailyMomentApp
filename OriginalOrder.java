
package TimeLine;


import java.util.Comparator;
import moment.Moment;


public class OriginalOrder implements Comparator <Moment> {

    @Override
    public int compare(Moment moment1, Moment moment2) 
    {
         if (moment1 !=null && moment2 !=null)
         {
             if(moment1.getIndex() < moment2.getIndex())

                return -1;

             else if (moment1.getIndex() > moment2.getIndex())

               return 1;

             else
               return 0;
        }
       return 1;
    }
}
