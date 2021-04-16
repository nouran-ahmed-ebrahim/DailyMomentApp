
package moment;

import java.util.Scanner;

public class Memory extends Moment{
    private int happinessPoints, sadnessPoints;
    private String location;

    public Memory(String momentName, String description, int actualYear, int importanceRate, int happinessPoints, int sadnessPoints, String location ) {
        super(momentName, description, actualYear, importanceRate);
        this.happinessPoints = happinessPoints;
        this.sadnessPoints = sadnessPoints;
        this.location = location;
        setCalcHappiness( CalculateHappiness());
    }

    
    public int getHappinessPoints() {
        return happinessPoints;
    }

    public int getSadnessPoints() {
        return sadnessPoints;
    }

    public String getLocation() {
        return location;
    }

    public void editMemory(String newMomentName,int newYear,String newDescription,int newRate,int newHappinessPoint,int newSadnessPoint,String newLocation)
    {
        super.editMoment(newMomentName, newYear, newDescription, newRate);
        this.happinessPoints = newHappinessPoint;
        this.sadnessPoints = newSadnessPoint ;
        this.location = newLocation;
    }
  
    @Override
    public int CalculateHappiness() {
        int happiness = (happinessPoints - sadnessPoints) * getImportanceRate();

        return happiness;
    }

}
