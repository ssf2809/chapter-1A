/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package doubleStructures;

/**
 *
 * @author ALEX
 */
public class Node {
    
     protected int value;
    protected Node next;
    protected Node back;
    
    public Node (int v){
        value = v;
        next = null;
        back = null;
    }
    
}
