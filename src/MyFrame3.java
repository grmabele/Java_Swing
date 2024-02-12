import javax.swing.*;
import java.awt.*;

public class MyFrame3 extends JFrame {
    MyFrame3()
    {
        // dowload icon
        ImageIcon icon = new ImageIcon(Main.class.getResource("/logo.png"));

        // Redimensionne l'îcone
        Image image = icon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(100,100, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label

        JLabel label = new JLabel();
        label.setText("Hi");
        label.setIcon(icon);
        //label.setVerticalAlignment(JLabel.BOTTOM);
        //label.setHorizontalAlignment(JLabel.RIGHT);
        label.setBounds(100, 100, 75, 75);


        // JPanel = a GUI component that functions as a container to hold other components

        JPanel redPanel = new JPanel();
        redPanel.setBackground(Color.red);
        redPanel.setBounds(0,0,250,250);
        //redPanel.setLayout(new BorderLayout());
        redPanel.setLayout(null);

        JPanel bleuePanel = new JPanel();
        bleuePanel.setBackground(Color.BLUE);
        bleuePanel.setBounds(250,0,250,250);
        //bleuePanel.setLayout(new BorderLayout());
        bleuePanel.setLayout(null);

        JPanel greenPanel = new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(0,250,500,250);
        //greenPanel.setLayout(new BorderLayout());
        greenPanel.setLayout(null);


        JFrame frame = new JFrame("Exemple d'utilisateur de Jpanel");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setSize(750,750);
        frame.setVisible(true);
        greenPanel.add(label);
        frame.add(redPanel);
        frame.add(bleuePanel);
        frame.add(greenPanel);


    }
}
