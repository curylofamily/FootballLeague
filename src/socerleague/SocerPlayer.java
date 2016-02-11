package socerleague;

public class SocerPlayer extends Human  {

    private int height;

    private Footed footed;

    SocerPlayer() {
        super();
    }

    SocerPlayer(int id, String name, String surname, int age, String nationality, int height, Footed f) {
        super(id, name, surname, age, nationality);
        this.height = height;
        this.footed = f;
    }

    @Override
    public void initialize(String[] tmp) {
        super.initialize(tmp);
        setHeight(Integer.parseInt(tmp[7]));
        setFooted(Footed.valueOf(tmp[8]));
    }

    public int getHeight() {
        return this.height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public void setFooted(Footed footed) {
        this.footed = footed;
    }

    public Footed getFooted() {
        return footed;
    }

    @Override
    public String toString() {
            String details = super.toString() + " " + this.getHeight() + " " + this.getFooted();
        return details;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
