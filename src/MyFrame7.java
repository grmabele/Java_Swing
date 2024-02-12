import javax.swing.*;
import java.awt.*;

public class MyFrame7 extends JFrame {

    MyFrame7() {
        // Layout Manager = Definies the natural layout for components within a cantainer

        // GridLayout = places components in a grid of cells.
        //              Each component takes all the available space within its cell,
        //              and each cell is the same size.

        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setLayout(new GridLayout(3,3,10,10));

        frame.add(new JButton("1"));
        frame.add(new JButton("2"));
        frame.add(new JButton("3"));
        frame.add(new JButton("4"));
        frame.add(new JButton("5"));
        frame.add(new JButton("6"));
        frame.add(new JButton("7"));
        frame.add(new JButton("8"));
        frame.add(new JButton("9"));
        frame.add(new JButton("10"));

        frame.setVisible(true);

    }
}
