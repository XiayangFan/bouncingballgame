import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.awt.Rectangle;
public class rect{
int x;
int y;
int dx;
int width;
int height;
Image image;

public rect(){
x=0;
y=700;

ImageIcon ii=new ImageIcon(this.getClass().getResource("rect.PNG"));
image=ii.getImage();
width=image.getWidth(null);
height=image.getHeight(null);
}
public int getX(){
return x;
}
public int getY(){
return y;
}
public Image getImage(){
return image;
}
Rectangle getBounds(){
return new Rectangle(x, y, width, height);
}
public void keyPressed(KeyEvent e){
int key=e.getKeyCode();
if(key==KeyEvent.VK_LEFT){
dx=-5;
}



if(key==KeyEvent.VK_RIGHT){
dx=5;
}
}
public void keyReleased (KeyEvent e){
int key=e.getKeyCode();
if(key==KeyEvent.VK_LEFT){
dx=0;
}
if(key==KeyEvent.VK_RIGHT){
dx=0;
}
}
public void move(){
x+=dx;
}
}