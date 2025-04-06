package Class;

import java.util.Date;
import java.util.LinkedList;

public class Match {
    private int id;
    private Date date;
    private Team teamB;
    private Team teamA;
    private int teamAGoals;
    private int teamBGoals;
    private String location;
    private String stadium;

    // Constructor vacío
    public Match() {
    }

    // Constructor con parámetros, nos va a servir 
    public Match(int id, Date date, Team teamA, Team teamB, int teamAGoals, int teamBGoals, String location, String stadium) {
        this.id = id;
        this.date = date;
        this.teamA = teamA;
        this.teamB = teamB;
        this.teamAGoals = teamAGoals;
        this.teamBGoals = teamBGoals;
        this.location = location;
        this.stadium = stadium;
    }

    // Getters y Setters

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Team getTeamA() {
        return teamA;
    }

    public void setTeamA(Team teamA) {
        this.teamA = teamA;
    }

    public Team getTeamB() {
        return teamB;
    }

    public void setTeamB(Team teamB) {
        this.teamB = teamB;
    }

    public int getTeamAGoals() {
        return teamAGoals;
    }

    public void setTeamAGoals(int teamAGoals) {
        this.teamAGoals = teamAGoals;
    }

    public int getTeamBGoals() {
        return teamBGoals;
    }

    public void setTeamBGoals(int teamBGoals) {
        this.teamBGoals = teamBGoals;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getStadium() {
        return stadium;
    }

    public void setStadium(String stadium) {
        this.stadium = stadium;
    }
}
