package Class;

import java.util.LinkedList;

public class Team {
    private int id;
    private String name;
    private LinkedList<Player> players;

    public Team() {
    }

    public Team(int id, String name, LinkedList<Player> players) {
        this.id = id;
        this.name = name;
        this.players = players;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }

    





}
