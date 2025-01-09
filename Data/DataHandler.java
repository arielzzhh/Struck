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
    System.out.println("game starts");
    }
    
    
    public static void startDinoWorld(){
    World newWorld = new World("DinoWorld");
    DataHandler.setActiveWorld(newWorld);  
    System.out.println("game starts");
    

}
    
    

    
    
    
    public static void passMoment(){
    
    
    }
    
    
    
}
