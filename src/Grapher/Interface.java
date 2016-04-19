
/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Grapher;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionListener;
import javax.swing.JFrame;

/**
 *
 * @author Felipe
 */
public class Interface extends JFrame {
    
   private Grapher graph;
    
    public Interface(){
        setTitle("Graficador");
        setSize(600,400);
        launchWidgets();
        launchEvents();
        setVisible(true);
    }
   //************************************ 
    private void launchWidgets(){
        graph = new Grapher();
        add (graph);
    }
    
    private void launchEvents(){
        graph.addMouseMotionListener(new MouseMotionListener(){
            public void mouseDragged(MouseEvent e ){
                graph.addCoordinate(e.getX(), e.getY());
                repaint();
            }
            
            public void mouseMoved(MouseEvent e){
                
                
            }
            
          
        });
        
        addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {
             
            }

            @Override
            public void keyPressed(KeyEvent e) {
                 if(e.getKeyCode()==KeyEvent.VK_BACK_SPACE){
                  graph.RemoveLast();
                  repaint();
               }
                 
                 if (e.getKeyCode()==KeyEvent.VK_DELETE){
                     graph.RemoveFirst();
                     repaint();
                 }
                 if (e.getKeyCode()==KeyEvent.VK_C){
                     int total = graph.Count();
                     System.out.println("--------- Conteo De Puntos ---------");
                     System.out.println(" "+ total+" Puntos");
                 }
                 
                 if (e.getKeyCode()==KeyEvent.VK_I){
                     int width = graph.getDrawingWidth();
                     int height = graph.getDrawingHeight();
                     System.out.println("--------- Informacion Del Dibujo ---------");
                     System.out.println(" Ancho :" + width + " Pixeles ");
                     System.out.println(" Alto : " + height + " Pixeles ");
                 }
                
                 if(e.getKeyCode()==KeyEvent.VK_R){
                     graph.RemoveOddPositions();
                     repaint();
                     System.out.println("-------- Pixelando Imagen --------");
                     
                 }
                  // ********** Homework 5 **********
                 
                   if(e.getKeyCode()==KeyEvent.VK_H){
                     graph.HorizontalMirror();
                     repaint();
                     System.out.println("-------- Mirada Horizontal --------");
                     
                 }
                   
                   if(e.getKeyCode()==KeyEvent.VK_V){
                     graph.VerticalMirror();
                     repaint();
                     System.out.println("-------- Mirada Vertical --------");
                     
                 }
                     if(e.getKeyCode()==KeyEvent.VK_P){
                     graph.PrintCoordinate();
                     repaint();
                     System.out.println("");
                     
                 }
                     if(e.getKeyCode()==KeyEvent.VK_D){
                     graph.Clean();
                     repaint();
                     System.out.println("-------- Borrando --------");
                     
                 }
                 
            }

            @Override
            public void keyReleased(KeyEvent e) {
                 
            }
        });
    }
        public static void main (String args[]){
            new Interface();
        }
    }
    
    
   
    
    

