
package TimeLine;

import moment.Moment;

public class PremiumTimeLine extends TimeLine {
    

    public double getAverageByRateForAllMoments( )
   {
       int  sumOfRate=0;
       for(int index = 0; index < super.getNumOfMoments();index++)
       {
             sumOfRate += super.getTimelineMoments()[index].getImportanceRate();
           
       }
       return (double)sumOfRate/super.getNumOfMoments();
   }
  
    
    public double getAverageByYear(int year)
   {
       int numMomentInYear=0,sumOfRate=0;
       for(int index=0;index<super.getNumOfMoments();index++)
       {
           
           if(super.getTimelineMoments()[index].getActualYear()==year)
           {
               numMomentInYear++;
               sumOfRate += super.getTimelineMoments()[index].getImportanceRate();
           }
       }
       return (double)sumOfRate/numMomentInYear;
   }
    
  public int getTopRated() {
      
        int maxRate = 0;
        
        for (int index = 0; index < getNumOfMoments(); index++) {
            
            if (getTimelineMoments()[index].getImportanceRate() > maxRate) {
                
                maxRate = getTimelineMoments()[index].getImportanceRate();
            }
        }

        return  maxRate;
    }

    public int getHappiestMoment() {
        
        int  maxHappy = 0 ;
        
        for (int index = 0; index < getNumOfMoments(); index++) {
                Moment currentMoment = getTimelineMoments()[index];
                
                if (currentMoment.getCalcHappiness()>= maxHappy) {
                    maxHappy = currentMoment.getCalcHappiness();
                }
            } 

      return maxHappy;
    }          
          
     public int getLeastHappiness()
     {
         int minHappiness= 1000000000;
         Moment currentMoment;
              
         for(int index = 0; index < getNumOfMoments();index++) 
            {
                    currentMoment = getTimelineMoments()[index];
                    if(currentMoment.getCalcHappiness() < minHappiness)
                    {
                        minHappiness = currentMoment.getCalcHappiness();

                    }
                }
        return minHappiness;
     }
     
   public int getleastRate()
   {
       int leastRate = 6;
      
       for(int index = 0 ; index < getNumOfMoments() ;index++) 
        {
           if(getTimelineMoments()[index].getImportanceRate() < leastRate)
              {
                leastRate = getTimelineMoments()[index].getImportanceRate(); 
              }
        }

      return leastRate;
    }
   
}