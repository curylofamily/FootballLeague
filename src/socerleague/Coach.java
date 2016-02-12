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
        setTeam(Integer.parseInt(tmp[7]));
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

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
    
    @Override
    public Coach clone() throws CloneNotSupportedException {
        System.out.println("Cloning Coach object..");
        return (Coach) super.clone();
    }
}
