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
import javax.swing.JComponent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class Window1 extends JFrame {
 private Container pane;
	public Window1(){
     this.setTitle("Shapes");
     this.setSize(1220,600);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(null);
     try {
     Image backgroundImage = javax.imageio.ImageIO.read(new File("galaxy.jpg"));
     Image triangle = javax.imageio.ImageIO.read(new File("triangle.jpeg"));
     Image fire = javax.imageio.ImageIO.read(new File("fireball.jpg"));
     Image sphere = javax.imageio.ImageIO.read(new File("moon.jpg"));
     Image cigar = javax.imageio.ImageIO.read(new File("cigar.jpg"));
     Image unknown = javax.imageio.ImageIO.read(new File("un.jpg"));
    setContentPane(new JPanel(new BorderLayout()) {
        @Override
         public void paintComponent(Graphics g){
            g.drawImage(backgroundImage, 0, 0, null);
            g.drawImage(triangle, 100, 200, null);
            JLabel tri = new JLabel("<html> Triangle Shape <br>" + "</html>", JLabel.CENTER);
            tri.setBounds(100,300,200,140);
            tri.setForeground(Color.white);
     		tri.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(tri);
            tri.setLocation(100,300); 
            g.drawImage(fire, 320, 200, null);
            JLabel f = new JLabel("<html> Fireball Shape <br>" + "</html>", JLabel.CENTER);
            f.setBounds(100,300,200,140);
            f.setForeground(Color.white);
     		f.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(f);
            f.setLocation(330,300); 
            g.drawImage(sphere, 570, 200, null);
            JLabel s = new JLabel("<html> Sphere Shape <br>" + "</html>", JLabel.CENTER);
            s.setBounds(100,300,200,140);
            s.setForeground(Color.white);
     		s.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(s);
            s.setLocation(540,300); 
            g.drawImage(cigar, 750, 200, null);
            JLabel c = new JLabel("<html> Cigar Shape <br>" + "</html>", JLabel.CENTER);
            c.setBounds(100,300,200,140);
            c.setForeground(Color.white);
     		c.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(c);
            c.setLocation(750,300); 
            g.drawImage(unknown, 985, 200, null);
            JLabel u = new JLabel("<html> Unknown Shape <br>" + "</html>", JLabel.CENTER);
            u.setBounds(100,300,200,140);
            u.setForeground(Color.white);
     		u.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(u);
            u.setLocation(965,300); 


        }
    }

            );
} catch (IOException e) {
    throw new RuntimeException(e);

     //a.setOpaque(true);
 }

     //a.setFont(new Font("Arial", Font.BOLD, 40));

}
 public static void main(String[] args) {

     Window1 starter = new Window1();
     starter.setVisible(true);
}

}
