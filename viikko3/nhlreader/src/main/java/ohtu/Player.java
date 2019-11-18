
package ohtu;

import java.util.Date;

public class Player implements Comparable<Player>{
    private String name;
    int goals;
    int assists;
    int penalties;
    String team;
    String nationality;
    Date birthdate;
    public Player(String name, String nationality, String team, int goals, int assists, int penalties, Date birthdate){
        this.birthdate = birthdate;
        this.goals = goals;
        this.assists = assists;
        this.penalties = penalties;
        this.name = name;
        this.team = team;
        this.nationality = nationality;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getNationality() {
        return this.nationality;
    }

    
    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getTeam(){
        return this.team;
    }

    
    public void setGoals(int goals) {
        this.goals = goals;
    }

    public void setAssists(int assists) {
        this.assists = assists;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public void setTeam(String team) {
        this.team = team;
    }
    
    public void setPenalties(int penalties) {
        this.penalties = penalties;
    }

    public int getAssists() {
        return assists;
    }

    
    public int getGoals() {
        return goals;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public int getPenalties() {
        return penalties;
    }

    public int points() {
        return goals + assists;
    }

    
    @Override
    public String toString() {
        return this.name + " team " + this.team + " goals " + this.goals + " assists " + this.assists;
    }

    @Override
    public int compareTo(Player t) {
        return t.points() - this.points();
    }
      
}
