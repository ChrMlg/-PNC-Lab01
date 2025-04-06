package Class;

import Enum.PlayerRole;

public class Player {
    private static int idCounter = 0; 

    private int id; 
    private String name;
    private int scoredGoals;
    private int matches;
    private PlayerRole role;

    public Player() {
    }

    public Player(String name, PlayerRole role) {
        this.id = idCounter++;
        this.scoredGoals = 0;
        this.name = name;
        this.matches = 0;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public int getScoredGoals() {
        return scoredGoals;
    }

    public PlayerRole getRole() {
        return role;
    }

    public void setRole(PlayerRole role) {
        this.role = role;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMatches() {
        return matches;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

    @Override
    public String toString() {
        return "Jugador [nombre: " + name + ", scoredGoals: " + scoredGoals + ", matches: " + matches + ", role: " + role
                + "]";
    }

    

}
