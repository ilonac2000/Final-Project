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
     a.setFont(new Font("Arial", Font.BOLD, 50));
     pane.add(a);
     JLabel lbl = new JLabel("Month");
     lbl.setForeground(Color.white);
     lbl.setFont(new Font("Arial", Font.BOLD, 20));
     lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

    pane.add(lbl);

    String[] choices = { "January","February", "March","April","May","June","July","August","September","October","November","December"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    pane.add(cb);
    JLabel lbl2 = new JLabel("Day");
    lbl2.setForeground(Color.white);
    lbl2.setFont(new Font("Arial", Font.BOLD, 20));
    lbl2.setAlignmentX(Component.CENTER_ALIGNMENT);
    pane.add(lbl2);
    String[] choices2 = new String[31];
    for (int i = 0; i < 31; i++){
      choices2[i] = Integer.toString(i + 1);
    }
    final JComboBox<String> cb2 = new JComboBox<String>(choices2);

    pane.add(cb2);

}
  public static void main(String[] args) {
     Window3 starter = new Window3();
     starter.setVisible(true);
}
    }




