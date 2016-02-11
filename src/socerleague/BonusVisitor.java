/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socerleague;

/**
 *
 * @author Piotr Curyło
 */
public class BonusVisitor implements Visitor{
    
    @Override
    public void visit(SocerPlayer socerPlayer) {
        socerPlayer.setSalary(socerPlayer.getSalary() * 1.20);
    }

    @Override
    public void visit(Coach coach) {
        coach.setSalary(coach.getSalary() * 1.30);
    }

    @Override
    public void visit(Manager manager) {
        manager.setSalary(manager.getSalary() * 1.40);
    }
    
}
