package Data;
import Engine.CustomClock;

public class RunData {
    private String name;
    private CustomClock startingTime = new CustomClock(); // Variable name should start with lowercase
    private SavedData[] savesToName;

    // Constructor that takes a name
    public RunData(String name) {
        this.name = name; // Use the name parameter for consistency
        // Initialize the savesToName array with new SavedData objects
        this.savesToName = new SavedData[] {
            new SavedData("one"),
            new SavedData("two"),
            new SavedData("three")
        };
    }

    // You can add getter and setter methods for the fields as necessary
}
