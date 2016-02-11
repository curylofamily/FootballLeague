package socerleague;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class SocerLeage {

    public static void main(String[] args) throws FileNotFoundException, IOException, ArrayIndexOutOfBoundsException {
       BufferedReader inputStream = null;
         List<Human> socerPlayers = new ArrayList<Human>();
        HumanFactory factory = HumanFactory.getInstance();
        HumanResorces humanResorces = HumanResorces.getInstance(); 
        try {
            inputStream = new BufferedReader(new FileReader("HumanResorces.txt"));
            String l;
            while ((l = inputStream.readLine()) != null) {
                String[] tmp = l.split(" ");
                Human obj = factory.create(Integer.parseInt(tmp[0]));
                obj.initialize(tmp);
                humanResorces.list.add(obj);
            }
        } finally {
            if (inputStream != null) {
                inputStream.close();
            }
        }
        Iterator iterator = humanResorces.createIterator();
        while (iterator.hasNext()) {
			Object person = iterator.next();
			System.out.println(person);
		}
        Criteria footballers = new CriteriaFootballer();
        socerPlayers = footballers.meetCriteria(humanResorces.list);
        System.out.println("------------------LISTA PILKARZY--------------------");
        for (Human human : socerPlayers) {
            System.out.println(human);
        }
        System.out.println("******************************************************");
        humanResorces.calculateBonus();
        iterator = humanResorces.createIterator();
        while (iterator.hasNext()) {
			Object person = iterator.next();
			System.out.println(person);
		}
        
    }
}
