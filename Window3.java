import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Window3 extends JFrame {
 private Container pane;
 private JLabel a;

   public Window3() {
     this.setTitle("Calendar");
     this.setSize(1200,600);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());
     pane.setBackground(Color.black);
     a = new JLabel("Choose the date you want to learn more about:", JLabel.CENTER);
     a.setForeground(Color.white);
     a.setFont(new Font("Arial", Font.BOLD, 60));
     
}


    }



