import javax.swing.*;

import java.awt.*;
import javax.swing.JFrame;
import javax.swing.border.Border;

public class MyFrame2 extends JFrame {

    MyFrame2() {

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false); // prevent frame from being resized
        frame.setSize(500,500);

        //frame.setVisible(true);


        // JLabel = a GUI display area for a string of text, an image, or both

        //ImageIcon image = new ImageIcon("/img.png");
        ImageIcon image = new ImageIcon(Main.class.getResource("/logo.png"));// creates an ImageIcon
        Border border = BorderFactory.createLineBorder(Color.green);

        JLabel label = new JLabel();
        label.setText("Bro, do you even code"); // set text of label
        label.setIcon(image);
        label.setHorizontalTextPosition(JLabel.CENTER); // set text LEFT, CENTER, RIGTH, of imageicon
        label.setVerticalTextPosition(JLabel.TOP); // Set text top, center, bottom of imageicon
        label.setForeground(new Color(0X00FF00));
        label.setFont(new Font("MV Boli", Font.PLAIN,20)); // set font of text
        label.setIconTextGap(-25); // set gap of text image
        label.setBackground(Color.black);
        label.setOpaque(true); //display background color
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER); // set vertical position of icon+text withing label
        label.setHorizontalAlignment(JLabel.CENTER); // set horizontal position of icon+text withing label
        //label.setBounds(100, 100, 250, 250); // set x,y position within frame as well as dimensions
        frame.add(label);
        frame.pack();


        frame.setVisible((true));

    }
}
