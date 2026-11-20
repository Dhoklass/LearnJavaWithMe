import java.awt.BorderLayout;
    import java.awt.Color;
    import java.awt.Font;
    import javax.swing.*;
    import javax.swing.border.Border;

    class LearningSwing01{
        public static void main(String[] args) {
            JFrame frame = new JFrame("Neko");
            JLabel label = new JLabel();
            Border border = BorderFactory.createLineBorder(Color.pink, 3);
            JPanel redpanel = new JPanel();
            JPanel greenpanel = new JPanel();
            JPanel bluepanel = new JPanel();

            ImageIcon image = new ImageIcon("cat.jpg");   // create an image icon
            // image = new ImageIcon(image.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH));    //used to resize image, use this or

            // this can also be used to reize image
            Image img = image.getImage().getScaledInstance(200, 200, Image.SCALE_SMOOTH);
            // ImageIcon resizedImage = new ImageIcon(img);
            frame.setLayout(null);

            redpanel.setBackground(Color.red);
            redpanel.setBounds(0,0,250,250);

            bluepanel.setBackground(Color.blue);
            bluepanel.setBounds(250,0,250,250);

            greenpanel.setBackground(Color.green);
            greenpanel.setBounds(0,250,500,250);



            label.setText("Get serious gng!!"); 
            label.setHorizontalTextPosition(JLabel.CENTER);     // // set Horizontal height of text in label
            label.setVerticalTextPosition(JLabel.TOP);      // set vertical height of text in label
            label.setForeground(Color.pink);    // Change color of font in label
            label.setFont(new Font("MV Boli", Font.PLAIN, 20));     // set font of text, change it to bold italic etc, size of font
            label.setIconTextGap(35);       // set gap of text to image
            label.setBackground(Color.black);   // set background color of label
            label.setOpaque(true);      // display background color 
            label.setBorder(border);
            label.setVerticalAlignment(JLabel.CENTER);
            label.setHorizontalAlignment(JLabel.CENTER);
            label.setBounds(0,0, 10,10);     // Set x, y position within frame as well as dimensions 

            frame.setIconImage(image.getImage());
            label.setIcon(image);
            // label.setIcon(resizedImage);
            
            frame.setSize(500,500);
            frame.getContentPane().setBackground(new Color(10,25,25));      // change background color
            frame.add(label);   
            
            // frame.setLayout(null);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setVisible(true);
            
            // frame.pack();
            frame.add(redpanel);
            frame.add(bluepanel);
            frame.add(greenpanel);

            greenpanel.add(label);
            greenpanel.setLayout(new BorderLayout());

            // MyFrame frame = new MyFrame();   
        }
    }