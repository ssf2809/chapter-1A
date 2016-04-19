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
public class List {
    
     private Node head;

    public List() {

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

    public int remove(int p) {

        if (head == null) {
            return 0;
        }

        Node aux = head;

        if (p == 0) {
            head = aux.next;
            return aux.value;
        }

        Node q = head;

        for (int i = 0; i < p; i++) {
            q = aux;
            aux = aux.next;

            if (aux == null) {
                return 0;
            }
        }
        q.next = aux.next;
        return aux.value;
    }

    public void insert(int v, int p) {

    }

    /****** HOMEWORK 2 *****/
    public void print() {
        Node aux = head;

        while (aux != null) {
            System.out.print(" " + aux.value);
            aux = aux.next;
        }
        System.out.println();
    }

    public int lastElement() {

        int le = 45;
        Node aux = head;

        while (aux != null) {

            if (le == aux.value) {
                return le;
            }
            aux = aux.next;
        }
        return -1;
    }

    public int minElement() {
        int mine = 5;

        Node aux = head;

        while (aux != null) {
            if (mine == aux.value) {
                return mine;
            }
            aux = aux.next;
        }
        return -1;
    }

    public int maxElement() {
        int maxe = 45;

        Node aux = head;

        while (aux != null) {
            if (maxe == aux.value) {
                return maxe;
            }
            aux = aux.next;
        }
        return -1;
    }

    public int firstElement() {
        int fE = 5;

        Node aux = head;

        while (aux != null) {
            if (fE == aux.value) {
                return fE;
            }
            aux = aux.next;
        }
        return -1;
    }

    public void printOddPosition() {
        int cont = 0;
        Node aux = head;

        while (aux != null) {
            if (cont % 2 == 0) {
                System.out.print(" " + aux.value);

            }
            cont++;
            aux = aux.next;

        }

    }

    /**
     * *** FIN HOMEWORK ****
     */
    /**
     * *** TRANSCRIPCION CODIGO DEL 20/FEBRERO/2015 ****
     */
    public int count() {
        Node aux = head;
        int counter = 0;

        while (aux != null) {
            counter++;
            aux = aux.next;
        }
        return counter;
    }

    public boolean exist(int v) {
        Node aux = head;

        while (aux != null) {
            return true;
        }
        {
            aux = aux.next;
        }
        return false;
    }

    public int sum() {
        Node aux = head;
        int sum = 0;

        while (aux != null) {
            sum = sum + aux.value;
            aux = aux.next;
        }
        return sum;
    }

    public int poisitionOf(int v) {
        Node aux = head;
        int counter = 0;

        while (aux != null) {

            if (v == aux.value) {
                return counter;
            }
            aux = aux.next;
            counter++;
        }
        return -1;
    }

    /**
     * * CLASE FEBRERO 26 **
     */
    public void reversePrint() {

        if (head == null) {
            return;
        }

        Node aux = head, done = null;

        do {
            aux = head;
            while (aux.next != null && aux.next != done) {
                aux = aux.next;
            }
            System.out.print(" " + aux.value);
            done = aux;
        } while (done != head);
        System.out.println();
    }

    public void duplicate() {
        Node aux = head;

        while (aux != null) {
            Node n = new Node(aux.value);
            n.next = aux.next;
            aux.next = n;
            aux = n.next;
        }
    }

    public void retroveOddPositions() {
//Remover saltando una posición.
        Node aux = head;

        while (aux != null && aux.next != null) {
            aux.next = aux.next.next;
            aux = aux.next;
        }
    }

    public void duplicateAtEnd() {
        //Duplicar el último elemento de la lista

    }

    
    /********* HOMEWORK 3 ***********/
    
    
    public void RemoveLast() {

        Node aux = head, end = head;

        while (end.next != null) {

            aux = end;
            end = end.next;

        }
        aux.next = null;
    }

    public void increaseAllValues() {

        Node aux = head;

        while (aux != null) {
            
            aux.value = aux.value+1;
            aux = aux.next;

        }
    }
    
    public int getElementAt (int p){
        
        Node aux = head;
        int counter = 0;
        
        while (aux != null){
            
            if (counter==p){
                return aux.value;  
            }
            
            counter++;
            aux = aux.next;
        }
        return -1;
    } 
    
   public void invert(){
      
       Node head2=null;
       while(head !=null){
           Node aux = head;
           head = head.next;
           aux.next= head2;
           head2 = aux;
       }
       head=head2;
       
   }
   
   public void removeMin(){
     Node aux = head, fin = head;

        while (fin.next != null) {
            aux = fin;
            fin = fin.next;
        }
        aux.next = null;

    }
    
}
