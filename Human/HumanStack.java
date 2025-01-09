package Human;

import java.util.ArrayList;

public class HumanStack {

    private Human lead;
    private ArrayList<Human> team;

    // Constructor
    public HumanStack() {
        this.lead = null;
        this.team = new ArrayList<>();
    }

    // Method to change the leader
    public void changeLeader(Human human) {
        this.lead = human;
    }

    // Method to add a teammate
    public void addTeamMate(Human human) {
        this.team.add(human);
    }

    // Optional: Getters to access the lead and team if needed
    public Human getLead() {
        return lead;
    }

    public ArrayList<Human> getTeam() {
        return team;
    }
}
