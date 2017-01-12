  import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;


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
       Random t = new Random();
     int  r = t.nextInt();
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
    else{if (r % 15 == 1){
	    System.out.println("20:25	Murfreesboro	TN	Sphere	20 seconds	Dark Red Orb Slowly Moving Across Skyline.  ");}
	else if(r % 15 == 2){System.out.println("23:00	Fort Lauderdale	FL	Circle	15 minutes	Driving down the highway there was a big bright circular light, it would dim and get really bright again. Then it would break off  ");}
	else if(r % 15 == 3){System.out.println("23:50	Conway	SC	Triangle	Still out there	((HOAX??)) Odd blinking lights, 3 in a shape of a triangle, and one dull but bright orange sphere shaped light.");}
       	else if(r % 15 == 4){System.out.println("22:15	Sheridan	WY	Fireball	54 seconds	Glowing ball of light moved slowly across sky 8/9/16 in UFO in Sheridan, WY..  ");}
	else if(r % 15 == 5){System.out.println("23:55	Elliottsburg	PA	Unknown	4 minutes	Craft with orange lights moved north of me.  ");}
      	else if(r % 15 == 6){System.out.println("01:12	Los Banos	CA	Triangle	2-5 minutes	Triangle shape, with 3 lights.  ");}	
    	else if(r % 15 == 7){System.out.println("09:43	St. Paul	MN	Formation	currently still in the sk	Three bright lights in a perfect triangle position. Above Dayton Bluff area & east side of the St paul,MN  ");}	
	else if(r % 15 == 8){System.out.println("01:30	Lexington	SC	Unknown	5-10 seconds	2 lights combined to become one and dissapeared.   ");}
	else if(r % 15 == 9){System.out.println("19:30	Murfreesboro	TN	Circle	2 minutes	Green ball bouncing around in front of storm.  ");}
	else if(r % 15 == 10){System.out.println("22:00	Lake Mills	WI	Triangle	2 minutes	Three bright white lights, and one blinking red light in the shape of a triangle.  ");}
	else if(r % 15 == 11){System.out.println("00:37	Valparaiso	IN	Circle	Too scared to keep observ	Flashing green lights; they are shifting and moving irradically. No flight pattern is discernable.  ");}
	else if(r % 15 == 12){System.out.println("11:00	Mount Gilead	OH	Other	2 hours	I looked into the sky tonight, because I saw a flashing light and what I saw amazed me. I saw what looked like a jetpack of some sort  ");}
       	else if(r % 15 == 13){System.out.println("21:45	Shoreline	WA	Unknown	1 minute	I noticed a light way up in the sky, and quickly realized a second light following  ");}
	else if(r % 15 == 14){System.out.println("20:45	Jacksonville	FL	Light	20 minutes	Red lights, three, moving from east to west, the stright up.");}
        else if(r % 15 == 15){System.out.println("22:15	Corpus Christi	TX	Light	3 seconds	Appeared in the sky and descended straight down kind of slow, was too big to be an a/c; no sound. ");}
	
    }}}







     

public static void main(String[] args) {
     Window3 starter = new Window3();
     starter.setVisible(true);   
}}

