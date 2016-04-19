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
public class Test {
    
     public static void main(String args[]) {

        Stack s = new Stack();
        int values[] = {8, 10, 77, 45, 5, 9, 21};

        for (int i = 0; i < values.length; i++) {
            s.add(values[i]);
        }
        System.out.println("Valores actuales en la pila: ");
        s.print();

        int element = s.remove();
        System.out.print("Valores en la pila despues de remover: ");
        s.print();
        System.out.println("El valor removido fue: " + element);

        Queve q = new Queve();
        q.add(8);
        q.add(13);
        q.add(21);
        q.add(45);
        q.add(7);
        q.add(19);

        System.out.println("Informacion en la cola");
        q.print();

        element = q.remove();
        System.out.print("Datos en la cola despues de remover: ");
        q.print();

        List l = new List();

        for (int i = 1; i < 10; i++) {
            l.add(i * 5);
        }
        System.out.print("Valores actuales en la lista: ");
        l.print();

        element = l.remove(3);
        System.out.print("Valores en la lista despues de remover: ");
        l.print();
        System.out.println();

        /////////////////// IMPRESION DE VALORES DEL HOMEWORK ///////////////////////////////////
        
        
        System.out.println("********** HOMEWORK 2 **********");
        System.out.println("El ultimo elemento es: " + l.lastElement());
        System.out.println("El mínimo elemnto es: " + l.minElement());
        System.out.println("El máximo elemento es: " + l.lastElement());
        System.out.println("El primer elemento es: " + l.firstElement());
        System.out.print("los numeros son: ");

        l.printOddPosition();
        System.out.println(" ");
        System.out.println(" ");

        //////////////////////FIN IMPRESION DE VALORES HOMEWORK //////////////////////////////////
        // IMPRESION DE VALORES TRANSCRIPCION DE CODIGO 20/FEB/2015 /////////////////////////////
        int size = l.count();
        System.out.println("Cantidad de nodos en la lista:" + size);

        if (l.exist(9)) {
            System.out.println("La lista contiene el número 9");
        }

        System.out.println("La suma de todos los nodos es: " + l.sum());

        int position = l.poisitionOf(7);
        if (position >= 0) {
            System.out.print("El valor 7 se encuentra en la posición:_" + position);
        }
        ///////////////////// FINAL IMPRESIONES ///////////////////////////////

        
        
        /* FEBRERO 26 */
        System.out.print("Los numeros impresos en forma invertida son: ");
        l.reversePrint();

        System.out.print("Lista duplicada quedaría así: ");
        l.duplicate();
        l.print();

        System.out.print("La lista removiendo un numero saltando posicion quedaría: ");
        l.retroveOddPositions();
        l.print();

        /**
         * ******** IMPRESION HOMEWORK 3 **********
         */
        System.out.println();
        System.out.println("********** HOMEWORK 3 **********");

        
        System.out.print("La lista eliminando el ultimo elemento quedaría así ");
        l.RemoveLast();
        l.print();

        System.out.print("Los valores de la lista incrementados quedan de la siguiente manera: ");
        l.increaseAllValues();
        l.print();

        int pos = l.getElementAt(3);
        System.out.println("El elemento asignado a la posicion 3 es: " + pos);
        
        /********** Final Impresiones HOMEWORK 3 **********/
        
        System.out.print("Los numeros invertidos son: ");
        l.invert();
        l.print();
        
        System.out.println();
        System.out.println("********** HOMEWORK PARCIAL **********");
        
        System.out.print("la lista con el menor numero eliminado es: ");
           l.removeMin();
           l.print();

    }
     

    
}
