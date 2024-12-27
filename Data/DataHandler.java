package Data;





public class DataHandler
{
    public static World ActiveWorld =null;
    
    
    
    public World getActiveWorld(){
    
        
        
        return ActiveWorld ;
    }
    
    
    public static void setActiveWorld(World newWorld){
        ActiveWorld= newWorld;
    }
    
    public static void startBaseWorld(){
    World newWorld = new World("new Game");
    DataHandler.setActiveWorld(newWorld);   
    System.out.println("game start the");
    System.out.println("the year is:"+newWorld.getDate());
    
    }
    
    
    
    
    

    
    
    
    public static void passMoment(){
    
    
    }
    
    
    
}
