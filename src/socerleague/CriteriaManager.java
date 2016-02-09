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
 * @author Piotr
 */
public class CriteriaManager implements Criteria{

    @Override
    public List<Human> meetCriteria(List<Human> humans) {
       List<Human> managers = new ArrayList<Human>();
       
       for(Human manager : humans){
            if( manager instanceof Manager){
                managers.add(manager);
            }
       }
       return managers;
    }
    
    
}
