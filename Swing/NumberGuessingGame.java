import java.awt.*;
import java.util.*;
import javax.swing.*;

class NumberGuessingGame{
    public static void main(String[] args) {
        // JFrame
        JFrame frame = new JFrame("Number Guessing Game!");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(900,450);     // set frame size

        // JPanel
        JPanel topPanel = new JPanel();
        JPanel centerPanel = new JPanel();
        JPanel bottomPanel = new JPanel();

        // JLabel
        JLabel title = new JLabel("Number Guessing Game");
        JLabel instruction = new JLabel("Guess a number between 1 and 100");
        JLabel feedback = new JLabel("Your game starts here!");
        JLabel attempts = new JLabel("Attempts: 0/7 ");

        title.setFont(new Font("MV Boli", Font.BOLD, 25));
        instruction.setFont(new Font("MV Boli", Font.PLAIN, 20));
        feedback.setFont(new Font("MV Boli", Font.PLAIN, 20));
        attempts.setFont(new Font("MV Boli", Font.PLAIN, 20));
        
        // attempts.setHorizontalTextPosition(JLabel.RIGHT);
        // instruction.setHorizontalAlignment();

        // JTextField
        JTextField guessInput = new JTextField(10);

        // JButton
        JButton submitButton = new JButton("Submit Guess");

        // set panel layouts - FlowLayouts
        topPanel.setLayout(new FlowLayout());
        centerPanel.setLayout(new GridLayout(3,1));
        bottomPanel.setLayout(new GridLayout(1,2));

        topPanel.add(title);
        
        centerPanel.add(instruction);
        centerPanel.add(guessInput);
        centerPanel.add(submitButton);

        bottomPanel.add(feedback);
        bottomPanel.add(attempts);

        topPanel.setBackground(new Color(15,155,134));
        centerPanel.setBackground(new Color(69,216,194));
        bottomPanel.setBackground(new Color(15,155,134));
        
        frame.add(topPanel, BorderLayout.NORTH);
        frame.add(centerPanel, BorderLayout.CENTER);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        
        Random rand = new Random();
        
        int i = rand.nextInt(1, 101);
        
        int[] attemptCount = {0};

        
        // int[] clickCount = {0};
        submitButton.addActionListener(e ->{
            int guess;
            try {
                guess = Integer.parseInt(guessInput.getText());  
            } 
            catch (NumberFormatException ex) {
                feedback.setText("Please enter a valid number!");
                guessInput.setText("");
                return;
            }

            if(guess < 1 || guess > 100){
                feedback.setText("Invalid input! Number cannot be less than 1 or greater than 100!");
                guessInput.setText("");                
                return;
            }
            
            attemptCount[0]++;
            attempts.setText("Attempts: " + attemptCount[0] + "/7");
            guessInput.setText("");

            if(guess < i){
                feedback.setText("Too low!");
                
                if(attemptCount[0] >= 7){
                    feedback.setText("You Lost!\n" + " The correct No was: " + i);
                    submitButton.setEnabled(false);}

            }

            else if(guess > i){
                feedback.setText("Too high!");

                
                if(attemptCount[0] >= 7){
                    feedback.setText("You Lost!\n" + " The correct No was: " + i);
                    submitButton.setEnabled(false);}
            }

            else{
                feedback.setText("You guessed it!");
                submitButton.setEnabled(false);

            }
            
        });




        frame.setVisible(true);     // set Visible 
    }
}

