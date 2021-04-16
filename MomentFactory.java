
package moment;


public class MomentFactory {
    
      public Moment getMoment (Object[] data){
    
        String  MomentType = (String)(data[0]);
               
        switch(MomentType ){
            case "Memory": return new Memory( (String)(data[1]), (String)(data[2]),(int)data[3], 
                                              (int)data[4], (int)data[5], (int)data[6], (String)data[7] );
            
            case "Achievement": return new Achievement( (String)(data[1]), (String)(data[2]),(int)data[3], 
                                                         (int)data[4], (int)data[5], (int)data[6]);
        } 
      return null;
    }
}
