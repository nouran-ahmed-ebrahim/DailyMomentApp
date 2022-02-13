
package moment;

import java.util.Scanner;

public abstract class Moment {
    private String momentName , description ;
    private int actualYear,importanceRate,index,calcHappiness;
   

    public Moment(String momentName, String description, int actualYear, int importanceRate) {
        this.momentName = momentName;
        this.description = description;
        this.actualYear = actualYear;
        this.importanceRate = importanceRate;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public void setCalcHappiness(int calcHappiness) {
        this.calcHappiness = calcHappiness;
    }

    public int getCalcHappiness() {
        return calcHappiness;
    }
 
 

    public String getMomentName() {
        return momentName;
    }

    public int getActualYear() {
        return actualYear;
    }

    public String getDescription() {
        return description;
    }

    public int getImportanceRate() {
        return importanceRate;
    }

    public int getIndex() {
        return index;
    }

      public void editMoment(String newMomentName,int newYear,String newDescription,int newRate)
    {
         this.momentName = newMomentName;
           this.actualYear = newYear;
           this.description = newDescription;
            this.importanceRate = newRate;
            calcHappiness = CalculateHappiness();
    }
  

    public abstract int CalculateHappiness();

}
