/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socerleague;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Piotr Curyło
 * 
 */
public class HumanResorces  {
    List<Human> list = new ArrayList<Human>();
//    List<Visitable> elements = new ArrayList<Visitable>();
    public static HumanResorces instance = new HumanResorces();
    public static HumanResorces getInstance(){
        return instance;
    }
    private HumanResorces(){    
    }
    
    public void addHuman(Human human){
        list.add(human);
        
    }
    
    public void calculateBonus(){

        BonusVisitor visitor = new BonusVisitor();
        for(Visitable item: list) {
            item.accept(visitor);
        }
    }
    public Iterator createIterator() {
        return new MenuIterator();
    }
    class MenuIterator implements Iterator {
        
        int currentIndex = 0;

        @Override
        public boolean hasNext() {
            if(currentIndex >= list.size()) {
		return false;
            } else {
		return true;
            }
        }
        @Override
        public Object next() {
           return list.get(currentIndex++);
        }
        
    }
    
    
    
}
