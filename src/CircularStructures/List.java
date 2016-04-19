/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package CircularStructures;

/**
 *
 * @author AULA6
 */
public class List {
    
  private Node head;
  
  public List(){
      
      head=null;
  }
  
  public void add(int v){
      Node n = new Node(v);
      if(head == null){
          head = n;
      }else{
          Node aux = head;
          while(aux.next!=head){
              aux=aux.next;
          }
          n.next = head;
          aux.next = n;
      }
  }
  
  public void Print(){
      if(head==null)return;
      Node aux = head;
      do{
          System.out.println(" " + aux.value);
          aux =  aux.next;
      }while(aux!=head);
      System.out.println();
  }
  
  public void insert( int v) {
        Node n = new Node(v);
        if(head == null){
          head = n;
      }else{
          Node aux = head;
          while(aux.next!=head){
              aux=aux.next;
          }
          n.next = head;
          aux.next=n;
          head=n;
      }
    }
    
    public void MoveFirstToLast() {
     
      if(head==null)return;
      head=head.next;
//      Node aux = head;
//      while(aux.next!=head){
//          head=aux.next;
//      }
    }

    public void MoveLastToFirst() {
      if(head==null)return;
      Node aux = head;
      while(aux.next!=head){
          aux=aux.next;
      } head= aux;
    }

    
    }
   
