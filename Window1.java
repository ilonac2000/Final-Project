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


public class Window1 extends JFrame implements ActionListener{
 private Container pane;
 private JButton home;
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
       // @Override
         public void paintComponent(Graphics g){
            g.drawImage(backgroundImage, 0, 0, null);
            g.drawImage(triangle, 100, 200, null);
            JLabel tri = new JLabel("<html> Triangle Shape <br>" + Dataizer.TRIANGLE + "</html>", JLabel.CENTER);
            tri.setBounds(100,300,200,140);
            tri.setForeground(Color.white);
     		tri.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(tri);
            tri.setLocation(100,300); 
            g.drawImage(fire, 320, 200, null);
            JLabel f = new JLabel("<html> Fireball Shape <br>" + Dataizer.LIGHT + "</html>", JLabel.CENTER);
            f.setBounds(330,300,200,140);
            f.setForeground(Color.white);
     		f.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(f);
        //    f.setLocation(330,300); 
            g.drawImage(sphere, 570, 200, null);
            JLabel s = new JLabel("<html> Sphere Shape <br>" + Dataizer.SPHERE + "</html>", JLabel.CENTER);
            s.setBounds(540,300,200,140);
            s.setForeground(Color.white);
     		s.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(s);
        //    s.setLocation(540,300); 
            g.drawImage(cigar, 750, 200, null);
            JLabel c = new JLabel("<html> Cigar Shape <br>" + Dataizer.CIGAR + "</html>", JLabel.CENTER);
            c.setBounds(750,300,200,140);
            c.setForeground(Color.white);
     		c.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(c);
         //   c.setLocation(750,300); 
            g.drawImage(unknown, 985, 200, null);
            JLabel u = new JLabel("<html> Unknown Shape <br>" + Dataizer.UNKNOWN + "</html>", JLabel.CENTER);
            u.setBounds(960,300,200,140);
            u.setForeground(Color.white);
     		u.setFont(new Font("Arial", Font.BOLD, 20));
            this.add(u);
            home = new JButton("BACK");
            home.setFont(new Font("Arial", Font.BOLD, 20));
			home.setAlignmentX(Component.CENTER_ALIGNMENT);
			home.addActionListener(new ActionListener() {
    			@Override
    			public void actionPerformed( ActionEvent aActionEvent ) {
      		new Window().setVisible(true);
    		}
  } );
    //pane.add(Box.createRigidArea(new Dimension(5,0)));
    		this.add(home);

    		home.setActionCommand("back");
    		home.setBounds(1000,500,200,140);



         //   u.setLocation(965,300); 
        }
    }

            );
} catch (IOException e) {
    throw new RuntimeException(e);

     //a.setOpaque(true);
 }

     //a.setFont(new Font("Arial", Font.BOLD, 40));
}

  public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("back")){
    new Window().setVisible(true);}
}

 public static void main(String[] args) {
     Dataizer.organize("UFOData2.txt");
     Dataizer.dateFixer();
     Dataizer.shapeCount();
     Window1 starter = new Window1();
     starter.setVisible(true);
}

}
