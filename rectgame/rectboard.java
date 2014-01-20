import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
public class rectboard extends JPanel implements ActionListener{
rect newrect;
Timer timer;
rectball ball;
public rectboard(){
setDoubleBuffered(true);
setSize(800, 800);
setFocusable(true);
setBackground(Color.BLACK);
newrect=new rect();
ball=new rectball();
timer=new Timer(5, this);
timer.start();
addKeyListener(new TAdapter());
}
public void actionPerformed(ActionEvent e){
newrect.move();
ball.move();
repaint();
Rectangle r1=newrect.getBounds();
Rectangle r2=ball.getBounds();
if(r1.intersects(r2)){
ball.dy=-6;
}
}
public void paint(Graphics g){
super.paint(g);
Graphics2D g2d=(Graphics2D)g;
if(ball.iflost==1){
g2d.drawImage(newrect.getImage(), newrect.getX(), newrect.getY(), this);
g2d.drawImage(ball.getImage(), ball.getX(), ball.getY(), this);
}
if(ball.iflost==2){
g2d.setColor(Color.WHITE);
g2d.drawString("You Lose", 400, 400);
}
}
private class TAdapter extends KeyAdapter{
public void keyPressed(KeyEvent e){
newrect.keyPressed(e);
}
public void keyReleased(KeyEvent e){
newrect.keyReleased(e);
}
}
}