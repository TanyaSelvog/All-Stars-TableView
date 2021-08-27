package model;

public class SoccerPlayer {

    private String name; // Name of player
    private String team; // MLS team player is current member of
    private int jersey; // Player's shirt #
    private String position; // Position player normally plays

    // Constructor
    public SoccerPlayer(String name, String team, int jersey, String position) {
        this.name = name;
        this.team = team;
        this.jersey = jersey;
        this.position = position;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getTeam(){
        return team;
    }

    public void setTeam(String team){
        this.team = team;
    }

    public int getJersey() {
        return jersey;
    }

    public void setJersey(int jersey){
        this.jersey = jersey;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position){
        this.position = position;
    }
}
