import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame15 extends JFrame implements ActionListener {

    JButton button = new JButton("Pick a color");
    JLabel label = new JLabel();
    JColorChooser colorChooser = new JColorChooser();
    MyFrame15 () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        label.setBackground(Color.WHITE);
        label.setText("This is some text :D");
        label.setFont(new Font("MV Boli", Font.PLAIN,100));
        label.setOpaque(true);

        this.add(label);
        this.add(button);

        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {
            Color color = JColorChooser.showDialog(null,"Pick a color....I guess", Color.BLACK);

            label.setForeground(color);
            //label.setBackground(color);
        }

    }
}
