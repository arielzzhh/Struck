package Item ;








public  class Gear extends Item {

   private int physical ;
   private byte[][] Perks;
   
   
   
   
   
   
   public Gear(String name,int physical,byte[][] Perks){
    super(name);
    this.physical=physical;
    this.Perks=Perks;
    
    
    
    }


}