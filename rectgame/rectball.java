import javax.swing.*;
import java.awt.*;
import java.util.*;
public class rectball{
int x;
int y;
int dx;
int dy;
int iflost;
Image image;
int width;
int height;
public rectball(){
x=40;
y=60;
dx=3;
dy=6;
iflost=1;

ImageIcon ii=new ImageIcon(this.getClass().getResource("rectball.png"));
image=ii.getImage();
width=image.getWidth(null);
height=image.getHeight(null);
}
Rectangle getBounds(){
return new Rectangle(x, y, width, height);
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
public void move(){
x+=dx;
y+=dy;
if(y==0){
dy=6;
}
if(x==0+1){
dx=3;
}
if(x==800-width){
dx=-3;
}
if(y>700){
iflost=2;
}

}
}