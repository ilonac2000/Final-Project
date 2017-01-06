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
    JPanel panel = new JPanel();

    JLabel lbl = new JLabel("Month");
    frame.setVisible(true);
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.setSize(100, 80);

    panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
    frame.add(panel);

    lbl.setAlignmentX(Component.CENTER_ALIGNMENT);

    panel.add(lbl);

    String[] choices = { "January","February", "March","April","May","June","July","August","September","October","November","December"};

    final JComboBox<String> cb = new JComboBox<String>(choices);

    panel.add(cb);
    frame.setVisible(true);

    }
}
