package socerleague;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SocerLeage {

    public static void main(String[] args) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
        HumanFactory h = HumanFactory.getInstance();
        BufferedReader inputStream = null;
        List<Human> list = new ArrayList<Human>();
        List<Human> socerPlayers = new ArrayList<Human>();
        HumanFactory factory = HumanFactory.getInstance();
        try {
            inputStream = new BufferedReader(new FileReader("HumanResorces.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] tmp = l.split(" ");
                Human obj = factory.create(Integer.parseInt(tmp[0]));
                obj.initialize(tmp);
                list.add(obj);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        for (Human element : list) {
            System.out.println(element);
        }
        Criteria footballers = new CriteriaFootballer();
        socerPlayers = footballers.meetCriteria(list);
        System.out.println("------------------LISTA PILKARZY--------------------");
        for (Human human : socerPlayers) {
            System.out.println(human);
        }
    }
}
