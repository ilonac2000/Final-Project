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


public class Window1 extends JFrame {
 private Container pane;
	public Window1(){
     this.setTitle("Shapes");
     this.setSize(1220,800);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(null);
     try {
     Image backgroundImage = javax.imageio.ImageIO.read(new File("galaxy.jpg"));
     Image triangle = javax.imageio.ImageIO.read(new File("triangle.jpeg"));
     Image fire = javax.imageio.ImageIO.read(new File("fireball.jpg"));
     Image sphere = javax.imageio.ImageIO.read(new File("moon.jpg"));
    setContentPane(new JPanel(new BorderLayout()) {
        @Override
         public void paintComponent(Graphics g){
            g.drawImage(backgroundImage, 0, 0, null);
            g.drawImage(triangle, 200, 300, null);
            g.drawImage(fire, 420, 300, null);
            g.drawImage(sphere, 670, 300, null);


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
