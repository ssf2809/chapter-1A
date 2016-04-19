/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Grapher;

/**
 *
 * @author Felipe
 */
public class Coordinate {
    
     protected int x,y;
     protected Coordinate next,back;
    
    
    public Coordinate(int x, int y){
        
        this.x = x;
        this.y = y;
        
        next = back = null;
        
        
    }    

    Coordinate(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
