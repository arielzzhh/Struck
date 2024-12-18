package Human;
import java.util.ArrayList;

public class HumanCreator
{
    //base for engine not really usable 
   public static Human age(byte age){
       int[] stats = {5,5,5,5,5,5,5,5,5};
       Human HumanBluePrint = new Human("Human",age,stats);
    return HumanBluePrint;
       
    }
    

    
    
public static Human Stat(int power,int agility,int Balance,int intelgence ,int Ampaty, int sharped,int mentality,int Charisma,int Luck,int WorkRate ){
        int[] stats ={power,agility,Balance,intelgence,Ampaty,sharped,mentality,Charisma,Luck,WorkRate} ;
        Human HumanBluePrint = new Human("Human",15,stats);
        return HumanBluePrint;
    }
    
    

    
    
    
    
    
    
}

