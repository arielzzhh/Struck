package Human;

import java.util.ArrayList;

public class HumanC {
    // For single age
    public static Human age(byte age) {
        int[] stats = {5, 5, 5, 5, 5, 5, 5, 5, 5}; // Example stats for a human
        Human humanBluePrint = new Human("Human", age, stats);
        return humanBluePrint;
    }

    // For custom stats
    public static Human Stat(int Str, int agility, int Balance, int intelligence, int Empathy, int sharpness, int mentality, int Charisma, int Luck, int WorkRate) {
        int[] stats = {Str, agility, Balance, intelligence, Empathy, sharpness, mentality, Charisma, Luck, WorkRate}; // Properly set the variables here
        Human humanBluePrint = new Human("Human", 15, stats); // Assuming 15 is the age
        return humanBluePrint;
    }

    // For multiple ages
    public static Human[] ages(byte[] ages) {
        Human[] result = new Human[ages.length]; // Initialize the result array with the correct size
        for (int i = 0; i < ages.length; i++) { // Corrected the loop to iterate within bounds
            result[i] = HumanC.age(ages[i]); // Use correct index
        }
        return result;
    }
}
