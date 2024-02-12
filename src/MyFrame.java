import javax.swing.*;

import java.awt.*;
import javax.swing.JFrame;


public class MyFrame extends JFrame {
    MyFrame() {
        // JFrame = a GIU Window

        JFrame frame = new JFrame(); // creates a frame
        frame.setTitle("JFrame title goes here");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // exit out of application
        //frame.setResizable(false); // prevent frame from being resized
        frame.setSize(420, 420); // x-dimension and y-dimension of frame



        ImageIcon icon = new ImageIcon(Main.class.getResource("/logo.png"));// creates an ImageIcon
        //ImageIcon image = new ImageIcon("/Users/relgrandgiressemounguembomabele/IdeaProjects/Java_Swing/src/logo.png");

        // Redimensionne l'îcone
        Image image = icon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(8,8, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label

        //JLabel lbl = new JLabel(image);
        //frame.add(lbl);
        //frame.setIconImage(image.getImage()); // change icon of frame
        frame.setVisible(true); // make frame visible
        //frame.getContentPane().setBackground(new Color(123,50,250)); // change color of background
    }
}
