package Data;

import java.util.ArrayList;
import WorldObject.Zone ; 
import Engine.CustomClock;

import Engine.Date.Date;




public class World {


    private String name ;
    private float[] Size ;
    private ArrayList<Zone> Zones;
    private Date Date ;
    
    
    
    
    
    
    
    

    
    
    
    public World(String name){
        this.name = name;
        this.Size=new float[]{3000,3000};
        this.Date=new Date();
        
    }
    
    
    
    
    
    public Date  getDate(){
    return this.Date;
    
    
    
    
    }
    
    
    public String toString(){
    
        
        
        return "the World Name is "+this.name;
    
    }
    
    //adding zones 
    
      public void addZone(Zone newZone){
        Zones.add(newZone);
        
        
        
        
        
        }
    
    
    
    
    
    
    


}
