import java.awt.*;
import java.awt.Color;
import javax.swing.*;
import java.io.FileOutputStream;



public class ImageAdd extends JFrame{
    private ImageIcon image1,image2,image3,image4;
    private JLabel label1,label2,label3,label4;
    ImageAdd()
    {
        setLayout(new FlowLayout());
        image1=new ImageIcon(getClass().getResource("logo.png"));
        label1=new JLabel(image1);
        
        image2=new ImageIcon(getClass().getResource("eli1.jpg"));
        label2=new JLabel(image2);
        image3=new ImageIcon(getClass().getResource("eli2.png"));
        label3=new JLabel(image3);
        image4=new ImageIcon(getClass().getResource("eli3.jpg"));
        label4=new JLabel(image4);
        add(label1);
        add(label2);
        add(label3);
        add(label4);
    }
    public static void main(String args[])
    {
        ImageAdd gui=new ImageAdd();
        gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        gui.setVisible(true);
        gui.pack();
        gui.setTitle("Image Program");
        gui.setBackground(Color.BLUE);
    }
}
        