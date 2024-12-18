package Item ;
import java.util.ArrayList;






public class Clothes extends Gear {
 //
 private byte set =1;
 private static String[] setNames = {"none", "StoneArmor", ""};
 

 
 
 
 
public Clothes (String name,int physical,byte[][] Perks ){
    super(name,physical,Perks);
    this.set= 2;
    }
    
    
    
}