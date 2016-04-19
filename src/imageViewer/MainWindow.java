/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package imageViewer;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author ALEX
 */
public class MainWindow extends JFrame {
    
    private JButton left , right;
        private JButton viewer;
        private ImageStore images;
        
        public MainWindow(){
            
            setTitle("VISOR DE IMAGENES");
            setSize(300 , 150);
            LaunchWidgets();
            LaunchEvents();
            setVisible(true);
            
        }
        private void LaunchWidgets(){
            
            left = new JButton("<");
            right = new JButton(">");
            viewer = new JButton();
            
            add(left,BorderLayout.WEST);
            add(right,BorderLayout.EAST);
            add(viewer,BorderLayout.CENTER);
            
            images = new ImageStore();
            
          
        }
        private void LaunchEvents(){
            
            File folder = new File("G:\\icons");
            for(File f : folder.listFiles()){
                images.add(f.getAbsolutePath());
            }
            viewer.setIcon(images.getCurrent());
            left.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(images.goBack()){
                    viewer.setIcon(images.getCurrent());
                    
               
                }
                
                
            }
        });
           
                 right.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                if(images.goForward()){
                    viewer.setIcon(images.getCurrent());
                    
                }
                
            }  
         });
            
            
            
            
            
        }
        
        public static void main(String arg[]){
            
            new MainWindow();
            
            
       
        
    } 
    
}
