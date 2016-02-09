package socerleague;

public class Manager extends Human {

    private int idTeam;

    Manager() {
        super();
    }

    Manager(int id, String name, String surname, int age, String nationality, int idTeam) {
        super(id, name, surname, age, nationality);
        this.idTeam = idTeam;
    }

    public void setIdTeam(int idTeam) {
        this.idTeam = idTeam;
    }

    public int getIdTeam() {
        return this.idTeam;
    }

    @Override
    public void initialize(String[] tmp) {
        super.initialize(tmp);
        setIdTeam(Integer.parseInt(tmp[6]));
    }

    public void sellSocerPlayer(int idPlayer) {
    }

    @Override
    public String toString() {
        String details = super.toString() + " " + this.idTeam;
        return details;
    }
}
