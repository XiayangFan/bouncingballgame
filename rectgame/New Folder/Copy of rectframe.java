import javax.swing.*;
public class rectframe extends JFrame{
public rectframe(){
add(new rectboard());
setVisible(true);
setSize(800, 800);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setTitle("game");
setLocationRelativeTo(null);
setResizable(false);
}
public static void main(String[] args){
rectframe n=new rectframe();
}
}
