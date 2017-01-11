import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PopUp{

    public static void main(final String[] args) {
        final JFrame parent = new JFrame();
        JButton button = new JButton();
        JOptionPane.showMessageDialog(null, "This Month Does Not Have 31 Days");
     }
 }
