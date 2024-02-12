import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class MyFrame4 extends JFrame {

    private final JButton button;

    JLabel label;

    MyFrame4() {

        ImageIcon icon = new ImageIcon(Main.class.getResource("/img.png"));
        ImageIcon icon2 = new ImageIcon(Main.class.getResource("/logo.png"));



        // Redimensionne l'îcone
        Image image = icon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label

        // Redimensionne l'îcone
        Image image2 = icon2.getImage(); // transformation de l'icône en image
        Image newing2 = image2.getScaledInstance(50,50, Image.SCALE_SMOOTH);
        icon2 = new ImageIcon(newing2); // image est redimensionné en imageIcon pour être utilisé dans un label

        label = new JLabel();
        label.setIcon(icon2);
        label.setBounds(150, 250, 150, 150);
        label.setVisible(false);


        button = new JButton();
        button.setBounds(100, 200, 250, 100);
        button.addActionListener(this::actionPerformed);
        button.setText("Hello");
        button.setFocusable(false);
        button.setIcon(icon);
        //button.setIcon(icon2);
        button.setHorizontalTextPosition(JButton.CENTER);
        button.setVerticalTextPosition(JButton.BOTTOM);
        button.setFont(new Font("Comic Sans",Font.BOLD,25));
        button.setIconTextGap(-5);
        button.setForeground(Color.cyan);
        button.setBackground(Color.lightGray);
        button.setBorder(BorderFactory.createEtchedBorder());




        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(false);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button);
        this.add(label);
    }

    public  void  actionPerformed(ActionEvent e) {
        if (e.getSource()==button) {
           // System.out.println(("click me !"));
            //button.setEnabled(false); // pour la désactivation du button. . Le button ne peut pas être cliqué et ne repondra à aucun évenement
            label.setVisible(true);
        }
    }
}
