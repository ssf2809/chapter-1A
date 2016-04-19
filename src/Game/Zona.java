/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.JFrame;
import simpleStructures.Node;

/**
 *
 * @author AULA6
 */
public class Zona extends JFrame{
    protected Mina head;
    protected Mina current;
    
    public Zona(){
       setTitle("Zona Minada");
       setSize(500,400);
       LaunchEvents();
       setVisible(true);
       head = current = null;
    }
    
    public void addMina(int x, int y){
        Mina n = new Mina(x,y,this);
        if(head == null){
            head = n;
        }else {
            Mina aux= head;
            while(aux.next!=null)aux= aux.next;
            aux.next=n;
            n.back=aux;
        }
        current =n;
    }
    
    public void goForward(){
        if(current.next != null){
            current = current.next;
        }
    }
    
    public void goBack(){
         if(current.back!=null){
            current=current.back;
        }
    }
    
    public void Explode(){
        if(current != null){
            current.state = true;
        }
    }
   
    public void ExplodeTds(){      
         
            head.state = true;
            current.state = true;
            
            
    }   
    public void paint(Graphics g){
        if(head == null)return;
        Mina aux= head;
        while(aux != null){
            aux.paint(g,aux==current);
            aux = aux.next;
        }
        
    }
    
    public void LaunchEvents(){
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });
        
        addMouseListener(new MouseListener(){

          
            public void mouseClicked(MouseEvent me) {
               addMina(me.getX(),me.getY());
               repaint();
            }

           
            public void mousePressed(MouseEvent me) {
            }

       
            public void mouseReleased(MouseEvent me) {
                
            }

           
            public void mouseEntered(MouseEvent me) {
               
            }

        
            public void mouseExited(MouseEvent me) {
                
            }
        });
        
        addKeyListener(new KeyListener() {

            
            public void keyTyped(KeyEvent ke) {
               
            }

           
            public void keyPressed(KeyEvent ke) {
               switch(ke.getKeyCode()){
                   case KeyEvent.VK_RIGHT: goForward(); break;
                   case KeyEvent.VK_LEFT: goBack(); break;
                   case KeyEvent.VK_ENTER: Explode(); break;
                   case KeyEvent.VK_SPACE: ExplodeTds(); break;
               }
               repaint();
            }

           
            public void keyReleased(KeyEvent ke) {
              
            }
        });
    }
    
    public static void main (String args[]){
           new Zona();
        }
}
