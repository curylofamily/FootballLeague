package socerleague;

public class HumanFactory {

    private static HumanFactory instance = new HumanFactory();

    private HumanFactory() {
    }

    public static HumanFactory getInstance() {
        return instance;
    }

    public Human create(int id) {
        if (id == 0) {
            return null;
        }
        if (id == 1) {
            return new SocerPlayer();
        } else if (id == 2) {
            return new Coach();
        } else if (id == 3) {
            return new Manager();
        }
        return null;
    }

    public Human create(String fileRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
