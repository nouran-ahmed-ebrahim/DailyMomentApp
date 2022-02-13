
package moment;

public class Achievement extends Moment {
     private int proudPoints, plannedYear;

    public Achievement(String momentName, String description, int actualYear, int importanceRate, int proudPoints, int plannedYear ) {
        super(momentName, description, actualYear, importanceRate);
        this.proudPoints = proudPoints;
        this.plannedYear = plannedYear;
        setCalcHappiness( CalculateHappiness());
    }

     
     
    public int getProudPoints() {
        return proudPoints;
    }


    public int getPlannedYear() {
        return plannedYear;
    }


     public void editAchievement(String newMomentName,int newYear,String newDescription,int newRate,int newProudPoint,int newPlanYear )
    {
        super.editMoment(newMomentName, newYear, newDescription, newRate);
         proudPoints =  newProudPoint; 
         plannedYear = newPlanYear;
    }
  
  

    @Override
    public int CalculateHappiness() {
        int happiness = (proudPoints + (10 * (Math.max(1, plannedYear - getActualYear()))
                * getImportanceRate()));

        return happiness;
    }

}
