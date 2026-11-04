import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


public class My_Frame extends JFrame{
    My_Frame(){
        this.setTitle("Test");
        this.setSize(420,420);
        this.setVisible(true);  
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   //exit out applications 
        this.setResizable(false);  // you cannot resize the window anymore!

        ImageIcon img = new ImageIcon("cat.jpg");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(125,156,255));  //change color of background
    }
}