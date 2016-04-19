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
public class Stack {
    
     private Node head;

    public Stack() {
        //la cabeza esta vacia o nula
        head = null;
    }

    public void add(int v) {
        //creacion de un nuevo nodo
        Node n = new Node(v);

        n.next = head;
        head = n;
    }

    public int remove() {
        
        if (head == null){
            return 0;
        }else{
            Node aux = head;
            head = head.next;
            return aux.value;
        }
        
    }

    public void print() {
        Node aux = head;

        while (aux != null) {
            System.out.print(" " + aux.value);
            aux = aux.next;
        }

        System.out.println();
    }
    
    public void verify(){
        if (head == null) return;
        
        Node aux = head.next;
        int tmp = head.value;
        
        while (aux != null){
            if (tmp >= aux.value){
                System.out.print("Error de movimiento.");
                return;
            }
            tmp = aux.value;
            aux = aux.next;
        }
    }
    
}
