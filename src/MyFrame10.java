import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame10 extends JFrame implements ActionListener {

    JCheckBox checkBox = new JCheckBox();
    JButton button = new JButton();

    ImageIcon icon = new ImageIcon(Main.class.getResource("/close.png"));

    ImageIcon checkIcon = new ImageIcon(Main.class.getResource("checkmark.png"));

    MyFrame10() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.setText("submit");
        button.addActionListener(this);

        // Redimensionne l'îcone
        Image image = icon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label

        // Redimensionne de la checkmark
        Image image2 = checkIcon.getImage(); // transformation de l'icône en image
        Image newing2 = image2.getScaledInstance(20,20, Image.SCALE_SMOOTH);
        checkIcon = new ImageIcon(newing2); // image est redimensionné en imageIcon pour être utilisé dans un label

        checkBox.setText("Im not a robot");
        checkBox.setFocusable(false);
        checkBox.setFont(new Font("Consolas",Font.PLAIN,35));
        checkBox.setIcon(icon);
        checkBox.setSelectedIcon(checkIcon);

        this.add(button);
        this.add(checkBox);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            System.out.println(checkBox.isSelected());
        }
    }
}
