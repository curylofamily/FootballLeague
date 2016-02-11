package socerleague;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class SocerTeam {

    private int idTeam;
    private String name;
    private int idCoach;
    private int idManager;
    private int points;
    private List<Integer> team = new ArrayList<>();
    private Map<Integer, SocerPlayer> map = new TreeMap<Integer, SocerPlayer>();
    
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
    
    public void setIdManager(int inp){
        this.idManager = inp;
    }
    
    public int getIdManager(){
        return this.idManager;
    }
    
    public void addMemberToTeam(Integer inp){
        this.team.add(inp);
    }
    
    public void setHumansMap(TreeMap<Integer, SocerPlayer> inp)
    {
        this.map = inp;
    }
    
        @Override
    public String toString() {
        String details = this.getName() + " " + this.getIdManager() + " " + this.getIdCoach() 
                + " Players:\n";
            for(Integer a : team){
                if(map.containsKey(a)){
                    SocerPlayer player = map.get(a);
                    details += player.toString();
                }
        }
        return details;
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
