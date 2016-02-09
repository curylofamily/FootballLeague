/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socerleague;

import java.util.List;

/**
 *
 * @author Piotr
 */
public interface Criteria {
    public List<Human> meetCriteria(List<Human> humans);
}
