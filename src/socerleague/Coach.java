package socerleague;

public class Coach extends Human {

    int idTeam;

    Coach() {
        super();
    }

    Coach(int id, String name, String surname, int age, String nationality, int idTeam) {
        super(id, name, surname, age, nationality);
        this.idTeam = idTeam;
    }

    @Override
    public void initialize(String[] tmp) {
        super.initialize(tmp);
        setTeam(Integer.parseInt(tmp[6]));
    }

    public void setTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getTeam() {
        return idTeam;
    }

    @Override
    public String toString() {
        String details = super.toString() + " " + this.idTeam;
        return details;
    }
}
