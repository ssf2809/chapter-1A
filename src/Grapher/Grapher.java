/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Grapher;

import java.awt.Graphics;
import javax.swing.JComponent;

/**
 *
 * @author Felipe
 */
public class Grapher extends JComponent {
   
   private Coordinate head;
   
   public Grapher(){
       head = null;
   }
   
   public void addCoordinate(int x, int y){
      
       Coordinate n = new Coordinate(x,y);
       
       //******************
       
       if (head == null){
           head = n;
       }else {
           Coordinate aux=head;
           while(aux.next != null){
               aux = aux.next;
           }
           
           aux.next = n;
           n.back = aux;
       }
   } 
   
    public void paint(Graphics g){
        
        if(head == null) return;
        
        if(head.next ==  null){
            g.drawOval( head.x, head.y, 1, 1);
            return;
        }
        
        Coordinate p1=head, p2=head.next;
        
        while(p2 != null){
            g.drawLine(p1.x, p1.y, p2.x, p2.y);
            p1=p2;
            p2=p2.next;
        }
    }
    
    
    public void RemoveLast(){
        if(head==null)return;
        if(head.next==null){
            head=null;
            return;
        }
        Coordinate aux=head;
        
        while(aux.next.next != null){
            aux=aux.next;
        }
        aux.next=null;
    }
    
    public void RemoveFirst(){
        if(head==null)return;
        head=head.next;
       if(head!=null){
           head.back=null;
       }
    }
    
    
    public int Count(){
        int counter = 0;
        Coordinate aux=head;
        while(aux!=null){
            counter++;
            aux=aux.next;
        }
        return counter;
    }

    public int getDrawingWidth() {
       if(head==null)return 0;
       if (head.next==null)return 1;
       int min = head.x;
       int max = head.x;
       Coordinate aux = head.next;
       
       while(aux!=null){
           if(aux.x<min){
               min = aux.x;
           }
           if(aux.x>max){
               max= aux.x;
           }
           aux= aux.next;
       }
       return max-min;
   }

    public int getDrawingHeight() {
       if(head==null)return 0;
       if (head.next==null)return 1;
       int min = head.y;
       int max = head.y;
       Coordinate aux = head.next;
       
       while(aux!=null){
           if(aux.y<min){
               min = aux.y;
           }
           if(aux.y>max){
               max= aux.y;
           }
           aux= aux.next;
       }
       return max-min;
               
    }

    public void RemoveOddPositions() {
        Coordinate aux = head;

        while (aux != null && aux.next != null) {
            aux.next = aux.next.next;
            aux = aux.next;
         }
    }
    
    
  // ********** Homework 5 **********
    
    public void HorizontalMirror(){
        Coordinate aux = head;
        Coordinate previo = head;
        int duplicado = 0;
        
        while(aux != null){
            if(aux.x > previo.x){
                duplicado =  aux.x;
            }
            previo = aux;
            aux= aux.next;
        }
        aux= head;
        int length=Count();
        for(int i=0;i<length;i++ ){
            int x1= Math.abs(aux.x-duplicado);
            Coordinate n = new Coordinate(aux.x+x1+x1,aux.y);
            n.next =  head ;
            head.back = n;
            head = n;
            aux =  aux.next;
        }
    }
    
    public void VerticalMirror(){
        Coordinate aux = head;
        Coordinate previo =  head;
        int reflejo = 0;
        while(aux!=null){
            if(aux.y>previo.y){
                reflejo=aux.y;
            }previo = aux;
            aux = aux.next;
        }aux= head;
        int length=Count();
        for(int i=0;i<length;i++){
            int x1 = Math.abs(aux.y-reflejo);
            Coordinate n = new Coordinate(aux.x,aux.y+x1+x1);
            n.next = head;
            head.back = n;
            head = n;
            aux = aux.next;
        }
    }
    
    public void PrintCoordinate(){
        if(head == null){
            return;
        }
        Coordinate aux = head;
        int contador = 0;
        
        while(aux!=null){
            System.out.println("Coordenadas De Ubicacion Del Dibujo");
            System.out.println(" : " + contador + " ** " + aux.x + " . " + aux.y + " ** ");
            aux = aux.next;
            contador ++;
        }
    }
    
    public void Clean(){
        head = null;
    }
        
    
}
