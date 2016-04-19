/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularStructures;

import java.util.Random;

/**
 *
 * @author AULA6
 */
public class Test {
    
   
    public static void main (String args[]){
    
        List cl = new List ();
        Random r = new Random();
    
        for(int i=0;i<7;i++){
            cl.add(r.nextInt(100));
       }
    
        System.out.println("Lista Original");
        cl.Print();
        
        
       System.out.println("Valor Insertado");
       cl.insert(8);
       cl.Print();
        
         System.out.println("Moviendo Primer Valor Al Final");
        cl.MoveFirstToLast();
        cl.Print();
        
        System.out.println("Moviendo Ultimo Valor Al Principio");
        cl.MoveLastToFirst();
        cl.Print();
    }
    
   
    
}
