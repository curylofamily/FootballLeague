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
public class CriteriaCoach implements Criteria{

    @Override
    public List<Human> meetCriteria(List<Human> humans) {
        List<Human> coaches = new ArrayList<Human>();
        for(Human coach : humans){
            if( coach instanceof Coach ){
                coaches.add(coach);
            }
        }
        return coaches;
    }
    
}
