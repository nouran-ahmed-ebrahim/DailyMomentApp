
package frams;

/**
 *
 * @author AAAAA
 */
public class CurrentStatus {
    
    protected int sorted , ratedAFilter , ratedBFilter ;
    protected boolean  filtered = false ,displayHappiest=false ;
    protected boolean displaySaddest=false , displayMRMoment = false , displayLRMoment = false;
    public static CurrentStatus status =  new CurrentStatus();
    
    private CurrentStatus (){}
    
   public static CurrentStatus GetCurrentStatus ()
   {
       return status;
   }
}
