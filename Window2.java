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


public class Window2 extends JFrame implements ActionListener {
 private Container pane;
 private JLabel bkgrd;
 private JLabel a;
 private JLabel b;
 private JLabel c;
 private JLabel d;
 private JLabel e;
 private JLabel f;
 private JLabel h;
 private JLabel i;
 private JLabel j;
 private JLabel k;
 private JLabel l;
 private JLabel m;
 private JLabel n;
 private JLabel o;
 private JLabel p;
 private JLabel q;
 private JLabel r;
 private JLabel s;
 private JLabel t;
 private JLabel u;
 private JLabel v;
 private JLabel w;
 private JLabel x;
 private JLabel y;
 private JLabel z;
 private JLabel a1;
 private JLabel b1;
 private JLabel c1;
 private JLabel d1;
 private JLabel e1;
 private JLabel f1;
 private JLabel g1;
 private JLabel h1;
 private JLabel i1;
 private JLabel j1;
 private JLabel k1;
 private JLabel l1;
 private JLabel m1;
 private JLabel n1;
 private JLabel o1;
 private JLabel p1;
 private JLabel q1;
 private JLabel r1;
 private JLabel s1;
 private JLabel t1;
 private JLabel u1;
 private JLabel v1;
 private JLabel w1;
 private JLabel x1;
 private JLabel y1;

public Window2(){
     this.setTitle("Map");
     this.setSize(1220,765);
     this.setLocation(100, 10);
     this.setDefaultCloseOperation(EXIT_ON_CLOSE);  
     pane = this.getContentPane();
     pane.setLayout(null);
     try {
    final Image backgroundImage = javax.imageio.ImageIO.read(new File("map.jpeg"));
    setContentPane(new JPanel(new BorderLayout()) {
        @Override
         public void paintComponent(Graphics g){
            g.drawImage(backgroundImage, 0, 0, null);
            setOpaque(true);
            a = new JLabel("<html> California <br>" + Dataizer.getSum("California") + "</html>");
            a.setBounds(100,100,100,100);
     		this.add(a);
     		a.setLocation(100,300);
     		b = new JLabel("<html> Oregon <br>" + Dataizer.getSum("Oregon")+ "</html>");
            b.setBounds(100,100,100,100);
     		this.add(b);
     		b.setLocation(110,100);
     		c = new JLabel("<html> Washington <br>" + Dataizer.getSum("Washington")+ "</html>");
            c.setBounds(110,110,110,110);
     		this.add(c);
     		c.setLocation(145,10);
     		d = new JLabel("<html> Idaho <br>" + Dataizer.getSum("Idaho")+ "</html>");
            d.setBounds(100,100,100,100);
     		this.add(d);
     		d.setLocation(245,105);
     		e = new JLabel("<html> Nevada <br>" + Dataizer.getSum("Nevada")+ "</html>");
            e.setBounds(100,100,100,100);
     		this.add(e);
     		e.setLocation(200,200);
     		f = new JLabel("<html> Montana <br>" + Dataizer.getSum("Montana")+ "</html>");
            f.setBounds(100,100,100,100);
     		this.add(f);
     		f.setLocation(400,50);     	
     		h = new JLabel("<html> Wyoming <br>" + Dataizer.getSum("Wyoming")+ "</html>");
            h.setBounds(100,100,100,100);
     		this.add(h);
     		h.setLocation(400,150);  	
     		i = new JLabel("<html> Utah <br>" + Dataizer.getSum("Utah")+ "</html>");
            i.setBounds(100,100,100,100);
     		this.add(i);
     		i.setLocation(300,250); 
     		j = new JLabel("<html> Arizona <br>" + Dataizer.getSum("Arizona")+ "</html>");
            j.setBounds(100,100,100,100);
     		this.add(j);
     		j.setLocation(280,400); 
     		k = new JLabel("<html> New Mexico  <br>" + Dataizer.getSum("New Mexico")+ "</html>");
            k.setBounds(100,100,100,100);
     		this.add(k);
     		k.setLocation(390,400); 
     		l = new JLabel("<html> Colorado <br>" + Dataizer.getSum("Colorado")+ "</html>");
            l.setBounds(100,100,100,100);
     		this.add(l);
     		l.setLocation(390,260); 
     		m = new JLabel("<html> Kansas <br>" + Dataizer.getSum("Kansas")+ "</html>");
            m.setBounds(100,100,100,100);
     		this.add(m);
     		m.setLocation(550,225); 
     		n = new JLabel("<html> North Dakota <br>" + Dataizer.getSum("North Dakota")+ "</html>");
            n.setBounds(100,100,100,100);
     		this.add(n);
     		n.setLocation(510,50); 
     		o = new JLabel("<html> South Dakota  <br>" + Dataizer.getSum("South Dakota")+ "</html>");
            o.setBounds(100,100,100,100);
     		this.add(o);
     		o.setLocation(530,125); 
     		p = new JLabel("<html> Nebraska <br>" + Dataizer.getSum("Nebraska")+ "</html>");
            p.setBounds(100,100,100,100);
     		this.add(p);
     		p.setLocation(550,315); 
     		q = new JLabel("<html> Oklahoma <br>" + Dataizer.getSum("Oklahoma")+ "</html>");
            q.setBounds(100,100,100,100);
     		this.add(q);
     		q.setLocation(570,395); 
     		r = new JLabel("<html> Texas <br>" + Dataizer.getSum("Texas")+ "</html>");
            r.setBounds(100,100,100,100);
     		this.add(r);
     		r.setLocation(550,525); 
     		s = new JLabel("<html> Arkansas <br>" + Dataizer.getSum("Arkansas")+ "</html>");
            s.setBounds(100,100,100,100);
     		this.add(s);
     		s.setLocation(680,410); 
     		t = new JLabel("<html> Louisiana <br>" + Dataizer.getSum("Louisiana")+ "</html>");
            t.setBounds(100,100,100,100);
     		this.add(t);
     		t.setLocation(700,520); 
     	    u = new JLabel("<html> Missouri <br>" + Dataizer.getSum("Missouri")+ "</html>");
            u.setBounds(100,100,100,100);
     		this.add(u);
     		u.setLocation(680,300); 
     	    v = new JLabel("<html> Iowa <br>" + Dataizer.getSum("Iowa")+ "</html>");
            v.setBounds(100,100,100,100);
     		this.add(v);
     		v.setLocation(700,220); 
     		w = new JLabel("<html> Minnesota <br>" + Dataizer.getSum("Minnesota")+ "</html>");
            w.setBounds(100,100,100,100);
     		this.add(w);
     		w.setLocation(660,70); 
     		x = new JLabel("<html> Wisconsin <br>" + Dataizer.getSum("Wisconsin")+ "</html>");
            x.setBounds(100,100,100,100);
     		this.add(x);
     		x.setLocation(740,120); 
     		y = new JLabel("<html> Illinois <br>" + Dataizer.getSum("Illinois")+ "</html>");
            y.setBounds(100,100,100,100);
     		this.add(y);
     		y.setLocation(750,250); 
     		z = new JLabel("<html> Indiana <br>" + Dataizer.getSum("Indiana")+ "</html>");
            z.setBounds(100,100,100,100);
     		this.add(z);
     		z.setLocation(830,250); 
     		a1 = new JLabel("<html> Missisippi <br>" + Dataizer.getSum("Missisippi")+ "</html>");
            a1.setBounds(100,100,100,100);
     		this.add(a1);
     		a1.setLocation(770,420);
     		b1 = new JLabel("<html> Alabama <br>" + Dataizer.getSum("Alabama")+ "</html>");
            b1.setBounds(100,100,100,100);
     		this.add(b1);
     		b1.setLocation(850,450);
     		c1 = new JLabel("<html> Georgia <br>" + Dataizer.getSum("Georgia")+ "</html>"); 
            c1.setBounds(100,100,100,100);
     		this.add(c1);
     		c1.setLocation(920,460);
     		d1 = new JLabel("<html> Florida <br>" + Dataizer.getSum("Florida")+ "</html>");
            d1.setBounds(100,100,100,100);
     		this.add(d1);
     		d1.setLocation(960,550);
     		e1 = new JLabel("<html> South Carolina <br>" + Dataizer.getSum("South Carolina")+ "</html>");
            e1.setBounds(100,100,100,100);
     		this.add(e1);
     		e1.setLocation(950,400);
     		f1 = new JLabel("<html> Kentucky <br>" + Dataizer.getSum("Kentucky")+ "</html>");
            f1.setBounds(100,100,100,100);
     		this.add(f1);
     		f1.setLocation(850, 320);  
     		g1 = new JLabel("<html> North Carolina <br>" + Dataizer.getSum("North Carolina")+ "</html>");
            g1.setBounds(100,100,100,100);
     		this.add(g1);
     		g1.setLocation(950,350);     	
     		h1 = new JLabel("<html> Virginia <br>" + Dataizer.getSum("Virginia")+ "</html>");
            h1.setBounds(100,100,100,100);
     		this.add(h1);
     		h1.setLocation(1000,300);  	
			i1 = new JLabel("<html> Tennessee <br>"  + Dataizer.getSum("Tennessee")+ "</html>");
            i1.setBounds(100,100,100,100);
     		this.add(i1);
     		i1.setLocation(800,360); 
     		j1 = new JLabel("<html> Ohio <br>" + Dataizer.getSum("Ohio")+ "</html>");
            j1.setBounds(100,100,100,100);
     		this.add(j1);
     		j1.setLocation(900,250); 
     		k1 = new JLabel("<html> West Virginia <br>" + Dataizer.getSum("West Virginia")+ "</html>");
            k1.setBounds(100,100,100,100);
     		this.add(k1);
     		k1.setLocation(910,285); 
     		l1 = new JLabel("<html> Pennsylvania <br>" + Dataizer.getSum("Pennsylvania")+ "</html>");
            l1.setBounds(100,100,100,100);
     		this.add(l1);
     		l1.setLocation(970,200); 
     		m1 = new JLabel("<html> New York <br>"+ Dataizer.getSum("New York")+ "</html>");
            m1.setBounds(100,100,100,100);
     		this.add(m1);
     		m1.setLocation(1030,125); 
            n1 = new JLabel("<html> Maine <br>"+ Dataizer.getSum("Maine")+ "</html>");
            n1.setBounds(100,100,100,100);
            this.add(n1);
            n1.setLocation(1130,25); 
        }
    }

            );
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

 public static void PopUp(){
        final JFrame parent = new JFrame();
        JButton button = new JButton();
        JOptionPane.showMessageDialog(null, "This Month Does Not Have 31 Days");
        
     }

public void actionPerformed(ActionEvent e){
   String event = e.getActionCommand();
   if(event.equals("back")){
    new Window().setVisible(true);
    }
    if(event.equals("small")){
        PopUp();
    }
}

 public static void main(String[] args) {

     Dataizer.organize("UFOData2.txt");
     Dataizer.dateFixer();
     Dataizer.countState();
     Window2 starter = new Window2();
     starter.setVisible(true);
}
}



