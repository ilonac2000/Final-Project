import javax.swing.*;
import java.awt.*;
public class sindow extends JFrame {
 private Container pane;
 private JLabel a;
 private JButton map;
 private JButton time;
 private JButton date;
 private JTextField t;

 
 public start() {
     this.setTitle("Starter");
     this.setSize(600,400);
     this.setLocation(100,100);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
    
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());  
     a = new JLabel("How do you want to see the data?");
     map = new JButton("Map");
     time = new JButton("Timeline");
     date = new JButton("Choice a date");
     pane.add(map);
     pane.add(time);
     pane.add(date);

 }

 
  public static void main(String[] args) {
     start one = new start();
     one.setVisible(true);
  }
}
