import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window extends JFrame implements ActionListener{
 private Container pane;
 private JLabel a;
 private JLabel im;
 //private JButton map;
 //private JButton time;
 //private JButton date;
 private JTextField t;

 
public Window() {
     this.setTitle("Start");
     this.setSize(1200,600);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(new FlowLayout());
     pane.setBackground(Color.black);
     a = new JLabel("How do you want to see the data?", JLabel.CENTER);
     a.setForeground(Color.white);
     a.setFont(new Font("Arial", Font.BOLD, 72));
     JButton map = new JButton("Map");
     
     }
