//import required libraries
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

//define the class
public class GuessTheNumberGame {
  public static void main(String[] args) {

    //Generate a random number and store it
    Random rand = new Random();
    int target = rand.nextInt(100) + 1; 

    //create a JFrame
    JFrame frame = new JFrame("Guess the Number");

    //Add visual properties of Jframe
    frame.setSize(400, 150);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    //Add Create JPnel
  
    JPanel panel = new JPanel();
    frame.add(panel);

    // Create and add components to Jpanel
    JLabel label = new JLabel("A number is generated! Guess the number between 1 and 100:");
    panel.add(label);
    JTextField textField = new JTextField(10);
    panel.add(textField);
    JButton button = new JButton("Guess");
    panel.add(button);
    

    //add and implement actionlistener on button
    button.addActionListener(new ActionListener() {
      @Override
      public void actionPerformed(ActionEvent e) {
        int guess = Integer.parseInt(textField.getText());


        //Check the given number by comparing with target
        if (guess == target) {
          JOptionPane.showMessageDialog(frame, "Congratulations, you guessed the correct number!");
        } else if (guess < target) {
          JOptionPane.showMessageDialog(frame, "Your guess is too low. Try again.");
        } else {
          JOptionPane.showMessageDialog(frame, "Your guess is too high. Try again.");
        }
      }
    });

    frame.setVisible(true);
  }
}
