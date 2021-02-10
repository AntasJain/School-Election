import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonPanel2 extends JPanel implements ActionListener {

JButton button2;
JLabel secondLabel;

int i = 1;
int total = 0;

ButtonPanel2()
{
    button2 = new JButton("Push");
    add(button2);

    button2.addActionListener(this);

    secondLabel = new JLabel("Button pushes: " + total);
    add(secondLabel);
}

public void actionPerformed(ActionEvent e)
{
    total += i;
    secondLabel.setText("Button pushes: " + total);
    
    
}
}