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
public class Queve {
    
     private Node head;

    public Queve() {

        head = null;

    }

    public void add(int v) {

        Node n = new Node(v);

        if (head == null) {
            head = n;

        } else {

            Node aux = head;

            while (aux.next != null) {// el diferente != siempre debe ir pegado al igual.
                aux = aux.next;
            }
            aux.next = n;
        }

    }

    public int remove() {

        if (head == null) {
            return 0;
        } else {
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
    
}
