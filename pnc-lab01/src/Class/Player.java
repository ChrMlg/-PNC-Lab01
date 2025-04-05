package Class;

import Enum.PlayerRole;

public class Player {
    private int id; 
    private int scoredGoals;
    private int matches;
    private PlayerRole role;

    public Player() {
    }

    public Player(int id, int scoredGoals, int matches, PlayerRole role) {
        this.id = id;
        this.scoredGoals = scoredGoals;
        this.matches = matches;
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

    public int getMatches() {
        return matches;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setScoredGoals(int scoredGoals) {
        this.scoredGoals = scoredGoals;
    }

    public void setMatches(int matches) {
        this.matches = matches;
    }

}
