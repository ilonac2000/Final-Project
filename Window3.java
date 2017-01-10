import javax.swing.*;
import java.awt.*;//NEW STUFF!
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
     pane.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
     pane.setBackground(Color.black);
     a = new JLabel("Choose the date you want to learn more about:", JLabel.CENTER);
     a.setForeground(Color.white);
     a.setFont(new Font("Arial", Font.BOLD, 60));
     JLabel lbl = new JLabel("Month");
     lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

    pane.add(lbl);

    String[] choices = { "January","February", "March","April","May","June","July","August","September","October","November","December"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    panel.add(cb);
}

    }



