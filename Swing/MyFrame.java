import java.awt.Color;
import javax.swing.*;


class MyFrame extends JFrame{
    MyFrame(){
        // JFrame this = new JFrame("Neko");
        this.setTitle("Neko");  
        ImageIcon image = new ImageIcon("cat.jpg");   // create an image icon
        this.setIconImage(image.getImage());

        this.setSize(500,500);
        this.getContentPane().setBackground(new Color(10,25,5));
        

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);   
    }
}