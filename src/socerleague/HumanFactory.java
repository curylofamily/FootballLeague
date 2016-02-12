package socerleague;

import java.util.Map;
import java.util.TreeMap;



public class HumanFactory {

    private static HumanFactory instance = new HumanFactory();
    private TreeMap<Integer, Human> objectsMap = new TreeMap<Integer, Human>();
    private HumanFactory() {
    }

    public static HumanFactory getInstance() {
        return instance;
    }
    
    public void registerType(Integer id, Human type){
        objectsMap.put(id, type);
    }

    public Human create(int id) {
        try
        {
            if(objectsMap.containsKey(id)){
                return objectsMap.get(id).clone();
            }else{
                return null;
            }
        }catch(CloneNotSupportedException exc)
        {
            return null;
        }
    }

    public Human create(String fileRow) {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
