import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Window2 extends JFrame{
 private Container pane;
 private JLabel bkgrd;

 public Window2() {
     this.setTitle("Places");
     this.setSize(1200,765);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setLayout(new BorderLayout());
     bkgrd = new JLabel(new ImageIcon("map.jpeg"));
     add(bkgrd);
 }
 public static void main(String[] args) {
     Window2 starter = new Window2();
     starter.setVisible(true);
}
}

