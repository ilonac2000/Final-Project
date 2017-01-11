import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window3 extends JFrame implements ActionListener{
    private Container pane;
    private JLabel a;
    private JButton year;
    private JComboBox<String> cb; 
    private JComboBox<String> cb2;

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

    cb = new JComboBox<String>(choices);

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
    cb2 = new JComboBox<String>(choices2);

    pane.add(cb2);
    year = new JButton("2016");
    pane.add(year);
    year.addActionListener(this);
    year.setActionCommand("result");
}
public static void PopUp(){
        final JFrame parent = new JFrame();
        JButton button = new JButton();
        JOptionPane.showMessageDialog(null, "This Month Does Not Have 31 Days");
        
     }

public static void PopUpFeb(){
        final JFrame parent = new JFrame();
        JButton button = new JButton();
        JOptionPane.showMessageDialog(null, "February only had 29 days");
        
     }

  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("result")){
     String chosen = (String)cb.getSelectedItem();
     String chosenDay = (String)cb2.getSelectedItem();
     //System.out.print(chosen);
     //System.out.println(chosenDay);
    if (chosenDay.equals("31") && ((chosen.equals("February")) || 
        chosen.equals("April") || 
        chosen.equals("June") || 
        chosen.equals("September")|| 
        chosen.equals("November")))
        {
            //System.out.println("NO");
            PopUp();
     }
    else if((Integer.valueOf(chosenDay) > 29) && (chosen.equals("February"))){
        //System.out.println("NAH");
        PopUpFeb();
     }
    }
 
}
public static void main(String[] args) {
     Window3 starter = new Window3();
     starter.setVisible(true);   
}
    }








