import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame11 extends JFrame implements ActionListener {

    JRadioButton pizzButton = new JRadioButton("pizza");
    JRadioButton hamburgerButton = new JRadioButton("hamburger");
    JRadioButton hotdogButton = new JRadioButton("hotdog");

    ButtonGroup group = new ButtonGroup();

    // ImageIcon pizzaIcon = new ImageIcon("pizza.png");

    ImageIcon pizzaIcon = new ImageIcon(Main.class.getResource("/pizza.png"));
    ImageIcon hamburgerIcon = new ImageIcon(Main.class.getResource("hamburger.png"));
    ImageIcon hotdogIcon = new ImageIcon(Main.class.getResource("hotdog.png"));


    MyFrame11() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        group.add(pizzButton);
        group.add(hamburgerButton);
        group.add(hotdogButton);

        pizzButton.addActionListener(this);
        hamburgerButton.addActionListener(this);
        hotdogButton.addActionListener(this);



        // Redimensionne l'îcone pizza
        Image image = pizzaIcon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        pizzaIcon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label


        // Redimensionne l'îcone hamburger
        Image image2 = hamburgerIcon.getImage(); // transformation de l'icône en image
        Image newing2 = image2.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        hamburgerIcon = new ImageIcon(newing2); // image est redimensionné en imageIcon pour être utilisé dans un label


        // Redimensionne l'îcone hotdog
        Image image3 = hotdogIcon.getImage(); // transformation de l'icône en image
        Image newing3 = image3.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        hotdogIcon = new ImageIcon(newing3); // image est redimensionné en imageIcon pour être utilisé dans un label



        pizzButton.setIcon(pizzaIcon);
        hamburgerButton.setIcon(hamburgerIcon);
        hotdogButton.setIcon(hotdogIcon);


        this.add(pizzButton);
        this.add(hamburgerButton);
        this.add(hotdogButton);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() ==pizzButton) {
            System.out.println("You ordered pizza !");
        } else if (e.getSource() == hamburgerButton) {
            System.out.println("You ordered hambuger !");
        } else if (e.getSource() == hotdogButton) {
            System.out.println("You ordered a hotdog !");
        }
    }
}
