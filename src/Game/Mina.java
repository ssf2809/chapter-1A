/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author AULA6
 */
public class Mina {
    protected int x;
    protected int y;
    protected boolean state;
    protected Mina next,back;
    protected Zona z;
    
    public Mina(int posx, int posy,Zona zona){
        x              = posx;
        y              = posy;
        state          = false;
        next           = null;
        back           = null;
        z              = zona;
    }
    
    public void paint(Graphics g, boolean current){
        Image image;
        if(state == false){
            image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\AULA6\\Documents\\NetBeansProjects\\img\\mine.png");
            
        }else{
            image = Toolkit.getDefaultToolkit().getImage("C:\\Users\\AULA6\\Documents\\NetBeansProjects\\img\\boom.png");
        }
        
        g.drawImage(image, x-24, y-24, z);
        
        if(current == true){
            g.setColor(Color.red);
        }else{
            g.setColor(Color.white);
        }
        
        g.drawRect( x-25, y-25, 50,50);
    }
}
