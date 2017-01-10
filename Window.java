import javax.swing.*;
import java.awt.*;
public class Window extends JFrame {
 private Container pane;
 private JLabel a;
 private JLabel im;
 private JButton map;
 private JButton time;
 private JButton date;
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
     map = new JButton("Map");
     time = new JButton("Timeline");
     date = new JButton("Choice a date");
     map.setFont(new Font("Arial", Font.PLAIN, 50));
     time.setFont(new Font("Arial", Font.PLAIN, 50));
     date.setFont(new Font("Arial", Font.PLAIN, 50));
     pane.add(a);
     pane.add(map);
     pane.add(time);
     pane.add(date);
     map.addActionListener(this);
     map.setActionCommand("places");
     time.addActionListener(this);
     time.setActionCommand("graph");
     date.addActionListener(this);
     date.setActionCommand("calendar");
 }

  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("places")){
     String s = t.getText();
     s += "-0101000";
     j.setText(s);
   }
   if(event.equals("graph")){
    j.setText("Fish");
   }
   if(event.equals("calendar")){
    
   }
  }

  public static void main(String[] args) {
     Window starter = new Window();
     starter.setVisible(true);
  }
}


