import java.awt.FlowLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
 public class AlignIconInJLabel extends JFrame {
    private static final long serialVersionUID = 1L;
    public AlignIconInJLabel() {
 
        // set flow layout for the frame
        this.getContentPane().setLayout(new FlowLayout());
 

       // create an ImageIcon from the specified file
        ImageIcon icon = new ImageIcon("eli2.png");
 
        // create a center aligned label (horizontal alignment)
        JLabel label = new JLabel(icon, JLabel.LEFT);
 
        // add label to frame
        add(label);
 

   }
 

    private static void createAndShowGUI() {

 
 //Create and set up the window.
  JFrame frame = new AlignIconInJLabel();

 
//Display the window.
 frame.pack();
  frame.setVisible(true);
  frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args) {
 //Schedule a job for the event-dispatching thread:

  //creating and showing this application's GUI.
  javax.swing.SwingUtilities.invokeLater(new Runnable() {
 
public void run() {
    createAndShowGUI();

}
 });
    }

}
