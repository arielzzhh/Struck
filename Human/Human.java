package Human;


import WorldObject.WorldObject;


import Item.HeadGear;
import Item.BeltGear;
import Item.Upper;
import Item.Lower;
import Item.Foot;
import Item.Header;



public class Human extends WorldObject {
    //info 
        static String[] HumanSkills  ={"Travler","Hunter","Crafter","shelterCreator","guard"};
        

    //stats
    private String name;
    private int age;
    private int[] Genes;
  
    
    
    //gear 
    
    //Armor
    private HeadGear HeadSlot; 
    private BeltGear BeltSlot;
    
    
    //clothes 
    private Header HeaderSlot;
    private Upper UpperSlot;
    private Lower LowerSlot;
    private Foot FootSlot ;
   
    
    
    
    //getters and setters 
    

   public String getName(){
    return name;    
   }
   public String getAge(){
    return name;    
   }
   public void setAge(int age){
       this.age=age;
   }
   public HeadGear getHeadSlot(){
        return HeadSlot;
   }  
    
    
    

 
    
    
    
    
    

  

    public Human(String name, int age, int[] Genes){
        this.name = name;
        this.age = age;
        this.Genes = Genes;
        //items 
        this.HeadSlot = null;
        this.BeltSlot = null;
        //clothes
        this.HeaderSlot=null;
        this.UpperSlot=null;
        this.LowerSlot=null;
        this.FootSlot=null;

    }
    
 
    
    
    
    
    
    
    
    
    
    
    
    
    
}
