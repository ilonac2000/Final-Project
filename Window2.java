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
     		d = new JLabel("Idaho");
            d.setBounds(100,100,100,100);
     		this.add(d);
     		d.setLocation(250,100);
     		e = new JLabel("Nevada");
            e.setBounds(100,100,100,100);
     		this.add(e);
     		e.setLocation(200,200);
     		f = new JLabel("Montana");
            f.setBounds(100,100,100,100);
     		this.add(f);
     		f.setLocation(400,50);     	
     		h = new JLabel("Wyoming");
            h.setBounds(100,100,100,100);
     		this.add(h);
     		h.setLocation(400,150);  	
     		i = new JLabel("Utah");
            i.setBounds(100,100,100,100);
     		this.add(i);
     		i.setLocation(300,250); 
     		j = new JLabel("Arizona");
            j.setBounds(100,100,100,100);
     		this.add(j);
     		j.setLocation(300,400); 
     		k = new JLabel("New Mexico");
            k.setBounds(100,100,100,100);
     		this.add(k);
     		k.setLocation(400,400); 
     		l = new JLabel("Colorado");
            l.setBounds(100,100,100,100);
     		this.add(l);
     		l.setLocation(400,250); 
     		m = new JLabel("Kansas");
            m.setBounds(100,100,100,100);
     		this.add(m);
     		m.setLocation(550,225); 
     		n = new JLabel("North Dakota");
            n.setBounds(100,100,100,100);
     		this.add(n);
     		n.setLocation(500,50); 
     		o = new JLabel("South Dakota");
            o.setBounds(100,100,100,100);
     		this.add(o);
     		o.setLocation(550,125); 
     		p = new JLabel("Nebraska");
            p.setBounds(100,100,100,100);
     		this.add(p);
     		p.setLocation(550,325); 
     		q = new JLabel("Oklahoma");
            q.setBounds(100,100,100,100);
     		this.add(q);
     		q.setLocation(560,405); 
     		r = new JLabel("Texas");
            r.setBounds(100,100,100,100);
     		this.add(r);
     		r.setLocation(550,525); 
     		s = new JLabel("Arkansas");
            s.setBounds(100,100,100,100);
     		this.add(s);
     		s.setLocation(700,410); 
     		t = new JLabel("Louisiana");
            t.setBounds(100,100,100,100);
     		this.add(t);
     		t.setLocation(700,520); 
     	    u = new JLabel("Missouri");
            u.setBounds(100,100,100,100);
     		this.add(u);
     		u.setLocation(700,300); 
     	    v = new JLabel("Iowa");
            v.setBounds(100,100,100,100);
     		this.add(v);
     		v.setLocation(700,220); 
     		w = new JLabel("Minnesota");
            w.setBounds(100,100,100,100);
     		this.add(w);
     		w.setLocation(660,70); 
     		x = new JLabel("Wisconsin");
            x.setBounds(100,100,100,100);
     		this.add(x);
     		x.setLocation(750,120); 
     		y = new JLabel("Illinois");
            y.setBounds(100,100,100,100);
     		this.add(y);
     		y.setLocation(750,250); 
     		z = new JLabel("Indiana");
            z.setBounds(100,100,100,100);
     		this.add(z);
     		z.setLocation(840,250); 
     		a1 = new JLabel("Missisippi");
            a1.setBounds(100,100,100,100);
     		this.add(a1);
     		a1.setLocation(780,420);
     		b1 = new JLabel("Alabama");
            b1.setBounds(100,100,100,100);
     		this.add(b1);
     		b1.setLocation(850,450);
     		c1 = new JLabel("Georgia");
            c1.setBounds(100,100,100,100);
     		this.add(c1);
     		c1.setLocation(920,460);
     		d1 = new JLabel("Florida");
            d1.setBounds(100,100,100,100);
     		this.add(d1);
     		d1.setLocation(960,550);
     		e1 = new JLabel("South Carolina");
            e1.setBounds(100,100,100,100);
     		this.add(e1);
     		e1.setLocation(950,400);
     		f1 = new JLabel("Kentucky");
            f1.setBounds(100,100,100,100);
     		this.add(f1);
     		f1.setLocation(850, 320);  
     		g1 = new JLabel("North Carolina");
            g1.setBounds(100,100,100,100);
     		this.add(g1);
     		g1.setLocation(950,350);     	
     		h1 = new JLabel("Virginia");
            h1.setBounds(100,100,100,100);
     		this.add(h1);
     		h1.setLocation(1000,300);  	
			i1 = new JLabel("Tennessee");
            i1.setBounds(100,100,100,100);
     		this.add(i1);
     		i1.setLocation(800,360); 
     		j1 = new JLabel("Ohio");
            j1.setBounds(100,100,100,100);
     		this.add(j1);
     		j1.setLocation(900,250); 
     		k1 = new JLabel("West Virginia");
            k1.setBounds(100,100,100,100);
     		this.add(k1);
     		k1.setLocation(900,300); 
     		l = new JLabel("Pennsylvania");
            l.setBounds(100,100,100,100);
     		this.add(l);
     		l.setLocation(970,200); 
     		m = new JLabel("New York");
            m.setBounds(100,100,100,100);
     		this.add(m);
     		m.setLocation(1030,125); 

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





