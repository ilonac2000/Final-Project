import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window1 extends JFrame implements ActionListener{
 private Container pane;
 private JLabel a;
 private JLabel im;
 //private JButton map;
 //private JButton time;
 //private JButton date;
 private JTextField t;

 
public Window1() {
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
     map.addActionListener(this);
     map.setActionCommand("places");
     JButton time = new JButton("Timeline");
     time.addActionListener(this);
     time.setActionCommand("graph");
     JButton date = new JButton("Choice a date");
     date.addActionListener(this);
     date.setActionCommand("calendar");
     map.setFont(new Font("Arial", Font.PLAIN, 50));
     time.setFont(new Font("Arial", Font.PLAIN, 50));
     date.setFont(new Font("Arial", Font.PLAIN, 50));
     pane.add(a);
     pane.add(map);
     pane.add(time);
     pane.add(date); 
 }


  public static void main(String[] args) {
     Window1 starter = new Window1();
     starter.setVisible(true);
}
  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("places")){
     new Window2().setVisible(true);
   }
   if(event.equals("graph")){
    new Window1().setVisible(true);
   }
   if(event.equals("calendar")){
    new Window3().setVisible(true);
   }
  }
}
