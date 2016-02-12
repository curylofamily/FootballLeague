/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package socerleague;

/**
 *
 * @author Piotr
 */
public interface MyCloneableInterface extends Cloneable {
    public MyCloneableInterface clone() throws CloneNotSupportedException;
}