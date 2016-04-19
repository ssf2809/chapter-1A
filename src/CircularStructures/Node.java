/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularStructures;

/**
 *
 * @author AULA6
 */
public class Node {
    
    protected  int value;
    protected Node next;
    
    public Node(int v){
       value= v;
       next = this;
    }
    
}
