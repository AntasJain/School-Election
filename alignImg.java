import java.awt.*;
import javax.swing.*;
import javax.swing.ImageIcon;

public class alignImg extends JFrame
{
    private ImageIcon image1,i1;
    private JLabel label1,l1;
    alignImg()
    {
            
            ImageIcon img=new ImageIcon(getClass().getResource("eli1.jpg"));
            JLabel label1 = new JLabel(img, SwingConstants.RIGHT);
            JLabel label2 = new JLabel("CenterLeft", SwingConstants.LEFT);
            JLabel label3 = new JLabel("TopCenter", SwingConstants.CENTER);
            label1.setVerticalAlignment(SwingConstants.BOTTOM);
            label2.setVerticalAlignment(SwingConstants.CENTER);
            label3.setVerticalAlignment(SwingConstants.TOP);

        
    }
    public static void main(String args[])
    {
        alignImg gui=new alignImg();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image Program");
    }
}
      