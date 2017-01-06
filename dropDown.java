import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.BoxLayout;
import java.awt.Component;

public class dropDown {

public static void main(String[] args) {

    JFrame frame = new JFrame("Drop Down Menu");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(500, 500);
    frame.setLocation(430, 100);

    JPanel panel = new JPanel();
    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

    frame.add(panel);

    JLabel lbl = new JLabel("Month");

    panel.add(lbl);

    String[] choices = { "January","February", "March","April","May","June","July","August","September","October","November","December"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    panel.add(cb);

    JButton btn = new JButton("OK");
    panel.add(btn);

    frame.setVisible(true);

    }
}
