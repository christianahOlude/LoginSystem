import javax.swing.*;
import java.awt.*;

public class WelcomePage{

    JFrame frame = new JFrame("Welcome");
    JLabel welcomeLabel = new JLabel("Welcome to the world");

    WelcomePage(String userId){
        welcomeLabel.setBounds(0,0,200,35);
        welcomeLabel.setFont(new Font(null, Font.PLAIN, 25));
        welcomeLabel.setText("Hello " + userId + "!");
        frame.add(welcomeLabel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(250,250);
        frame.setLayout(null);
        frame.setVisible(true);
    }
}
