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
public class CriteriaFootballer implements Criteria{

    @Override
    public List<Human> meetCriteria(List<Human> humans) {
        List<Human> footballer = new ArrayList<Human>();
        for(Human human : humans){
            if( human instanceof SocerPlayer){
                footballer.add(human);
            }
                
        }
        return footballer;
    }
    
    
}
