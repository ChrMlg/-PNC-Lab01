package Class;

import java.util.LinkedList;

public class Team {
    private static int idCounter = 0; 

    private int id;
    private String name;
    private LinkedList<Player> players;

    public Team() {
    }

    public Team(String name) {
        this.id = idCounter++;
        this.name = name;
        this.players = new LinkedList<>();
    }


    //method to add players to a team
    public void addPlayer(Player player){
        players.add(player);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // get LL of players
    public LinkedList<Player> getPlayers() {
        return players;
    }

    public void setPlayers(LinkedList<Player> players) {
        this.players = players;
    }

    // print players on the team 
    public void displayPlayers(){
        for(Player player : players){
            System.out.println(player.getName());
        }
    }

}
