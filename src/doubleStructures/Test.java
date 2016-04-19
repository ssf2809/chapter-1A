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
public class Test {
    
     public static void main (String args[]){
        
        List dl = new List();
        
        int values[] = {2, 4, 6, 8, 10, 12, 14, 16, 18};
        
        for (int i=0; i < values.length; i++){
            dl.add(values[i]);
        }
        System.out.print("Impresion invertida: ");
        dl.reversePrint();
        
        dl.remove(3);
        System.out.print("Despues de remover el nodo de la posicion 3: ");
        dl.print();
        
//        System.out.print("El orden de los numero es: ");
//        dl.sort();
        
        System.out.println();
        System.out.println("********** HOMEWORK PARCIAL **********");
        System.out.println();
        
        dl.print();
         System.out.println(" ");
         System.out.print("eliminando numero la lista queda asi: ");
         dl.finandRemov(16);
        dl.print();
        System.out.println(" ");
    }
    
}
