package Item ;
import java.util.ArrayList;

public class Hand extends Gear {
 
    
    private boolean oneHand ;

    
public Hand (String name,int physical,byte[][] Perks ){
    super(name,physical,Perks);
    this.oneHand =true ;
    }
    
    
    
}