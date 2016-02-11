/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socerleague;

/**
 *
 * @author Piotr Curylo
 * @author Szymon Chrobok
 * @author Maciej Wysocki
 * @author Maciej Basiak
 * 
 * 
 */
public interface Visitor {
     public void visit(SocerPlayer socerPlayer);
     public void visit(Coach coach);
     public void visit(Manager manager);  
     public void visit(Human human); 
}
