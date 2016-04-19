/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package simpleStructures;

/**
 *
 * @author ALEX
 */
public class Game {
    
    public static void main(String args[]){
        
        Stack tower1, tower2, tower3;
        
        tower1 = new Stack();
        tower2 = new Stack();
        tower3 = new Stack();
        
        tower1.add(3);  tower1.add(2);  tower1.add(1);
        
        System.out.print("Torre1: "); tower1.print();
        System.out.print("Torre2: "); tower2.print();
        System.out.print("Torre3: "); tower3.print();
        
        tower2.add(tower1.remove());
        //tower3.add(tower1.remove()); terminar los pasos
        
        

        System.out.println("Torres despues de movimientos");
        
        System.out.print("Torre1: "); tower1.print();
        System.out.print("Torre2: "); tower2.print();
        System.out.print("Torre3: "); tower3.print();
        
    }
    
}
