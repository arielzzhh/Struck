package Data;

import java.util.ArrayList;
import WorldObject.Zone ; 
import Engine.CustomClock;





public class World {


    private String name ;
    private CustomClock Time;
    private float[] Size ;
    private ArrayList<Zone> Zones;
    
    
    
    

    
    
    
    public World(String name){
        this.name = name;
        this.Time = new CustomClock();
        this.Size=new float[]{3000,3000};
    }
    
    
    //adding zones 
    
      public void addZone(Zone newZone){
        Zones.add(newZone);
        
        
        }
    
    
    
    
    
    
    


}
