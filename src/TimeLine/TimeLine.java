
package TimeLine;
import java.util.*;
import moment.Moment;


public class TimeLine  {
   
    private int numOfMoments;
    private Moment[] timelineMoments = new Moment[30];

    
    public int getNumOfMoments() {
        return numOfMoments;
    }

    public Moment[] getTimelineMoments() {
        return timelineMoments;
    }
    
     public void addMoment (Moment newMoment) {

        newMoment.setIndex(numOfMoments+1);
        timelineMoments[numOfMoments] = newMoment;
        numOfMoments++;
    }

   public void deleteMoment(String momentName )
   {
        for(int index=0;index<numOfMoments;index++)
        {
            if(timelineMoments[index].getMomentName().equals(momentName))
            {
                decreaseMomentsIndex( index+1);
               int maxIndex =timelineMoments[numOfMoments-1].getIndex()+1; 
               timelineMoments[index].setIndex(maxIndex);
                sortWithOriginalOrder();
               timelineMoments[numOfMoments-1]= null;
                numOfMoments--;
                break;
            }
        }
    }


   private void decreaseMomentsIndex(int index)
   {
       for  ( ;index <numOfMoments; index++)
       {
            timelineMoments[index].setIndex(index-1);
       }
   }
       
       
    public int search(String name) {
        
        for (int index = 0; index < numOfMoments; index++) {
            
            if (timelineMoments[index].getMomentName().equals(name)) {
                return index;
            }
        }
        return -1;

    }

   
    public void sortMomentAscending(){
     SortRateAscending cmp = new SortRateAscending();
     Arrays.sort(timelineMoments,cmp);
    }
    
    public void sortMomentDescending()
    {
        SortRateDescending cmp = new SortRateDescending();
        Arrays.sort(timelineMoments,cmp);
        
    }

    public void sortWithOriginalOrder()
    {
        OriginalOrder cmp = new OriginalOrder();
        Arrays.sort(timelineMoments,cmp);
         
    }    
 
    public  int countNumOfMomentWithSameName(String momentName)
    {
        int count = 0;
        for( int index =0 ;index < numOfMoments; index++)
        {
            if(timelineMoments[index].getMomentName().equals(momentName))
            {
               count++;
            }
        }
        return count;
    }   
}
    

