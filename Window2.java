import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JPanel;


public class Window2 extends JFrame{
 private Container pane;
 private JLabel bkgrd;
 private JLabel a;
 private JLabel b;
 private JLabel c;
 private JLabel d;
 private JLabel e;
 private JLabel f;
 private JLabel g;

 
public Window2() {
     this.setTitle("Start");
     this.setSize(1220,765);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(null);
     try {
    final Image backgroundImage = javax.imageio.ImageIO.read(new File("map.jpeg"));
    setContentPane(new JPanel(new BorderLayout()) {
       // @Override
         public void paintComponent(Graphics g) {
            g.drawImage(backgroundImage, 0, 0, null);
            a = new JLabel("California");
            a.setBounds(100,100,100,100);
     		this.add(a);
     		a.setLocation(100,300);
     		b = new JLabel("Oregon");
            b.setBounds(100,100,100,100);
     		this.add(b);
     		b.setLocation(100,100);
     		c = new JLabel("Washington");
            c.setBounds(100,100,100,100);
     		this.add(c);
     		c.setLocation(150,10);
        }

    });
} catch (IOException e) {
    throw new RuntimeException(e);

     //a.setOpaque(true);
 }

     //a.setFont(new Font("Arial", Font.BOLD, 40));

}
/*public Window2(){
	 


}*/
 	/*JFrame f = new JFrame();
    f.getContentPane().add(new Background("map.jpeg"));
}*/
     /*this.setTitle("Places");
     this.setSize(1200,765);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	 setLayout(new BorderLayout());
     bkgrd = new JLabel(new ImageIcon("map.jpeg"));
     add(bkgrd);
 } */
 public static void main(String[] args) {
     Window2 starter = new Window2();
     starter.setVisible(true);
}
}









