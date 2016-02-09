package socerleague;

import java.util.ArrayList;
import java.util.List;

public class SocerTeam {

    int idTeam;
    String name;
    int idCoach;
    int points;
    List<SocerPlayer> team = new ArrayList<SocerPlayer>();
    
    
    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }
    
    public int getIdTeam() {
        return this.idTeam;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return this.name;
    }
    
    public void setIdCoach(int idCoach) {
        this.idCoach = idCoach;
    }
    
    public int getIdCoach() {
        return this.idCoach;
    }
    
//    public void setCurrentPlace(int currentPlace) {
//        this.currentPlace = currentPlace;
//    }
//
//    public int getCurrentPlace() {
//        return this.currentPlace;
//    }
    
//    public void setBudget(double budget) {
//        this.budget = budget;
//    }
//
//    public double getBudget() {
//        return this.budget;
//    }
}
