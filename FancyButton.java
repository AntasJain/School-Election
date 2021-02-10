// FancyButton.java
// Create a JButton that does not show focus, does not paint a border, and
// displays different icons when rolled-over and pressed.
//

import javax.swing.*;
import java.awt.*;

public class FancyButton extends JButton {
  public FancyButton(Icon icon, Icon pressed, Icon rollover) {
    super(icon);
    setFocusPainted(false);
    setRolloverEnabled(true);
    setRolloverIcon(rollover);
    setPressedIcon(pressed);
    setBorderPainted(false);
    setContentAreaFilled(false);
  }

  // A simple test program 
  public static void main(String[] args) {

    FancyButton b1 = new FancyButton(
      new ImageIcon("redcube.gif"),
      new ImageIcon("redpaw.gif"),
      new ImageIcon("reddiamond.gif"));
    FancyButton b2 = new FancyButton(
      new ImageIcon("bluecube.gif"),
      new ImageIcon("bluepaw.gif"),
      new ImageIcon("bluediamond.gif"));
    JFrame f = new JFrame();
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Container c = f.getContentPane();
    c.setLayout(new FlowLayout());
    c.add(b1);
    c.add(b2);
    f.pack();
    f.setVisible(true);
  }
}
