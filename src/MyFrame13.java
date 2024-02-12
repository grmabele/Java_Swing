import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.security.Key;

public class MyFrame13 extends JFrame implements ActionListener {

    JMenuBar menuBar = new JMenuBar();
    JMenu fileMenu = new JMenu("File");
    JMenu editMenu = new JMenu("Edit");
    JMenu helpMenu = new JMenu("Help");

    JMenuItem loadItem = new JMenuItem("Load");
    JMenuItem saveItem = new JMenuItem("Save");
    JMenu exitItem = new JMenu("Exit");

    // Create image icon

    ImageIcon loadIcon = new ImageIcon(Main.class.getResource("/load.png"));
    ImageIcon saveIcon = new ImageIcon(Main.class.getResource("/save.png"));
    ImageIcon exitIcon = new ImageIcon(Main.class.getResource("/exit.png"));

    MyFrame13 () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());

        // Redimensionne l'îcone load
        Image image = loadIcon.getImage(); // transformation de l'icône en image
        Image newing = image.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        loadIcon = new ImageIcon(newing); // image est redimensionné en imageIcon pour être utilisé dans un label


        // Redimensionne l'îcone save
        Image image2 = saveIcon.getImage(); // transformation de l'icône en image
        Image newing2 = image2.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        saveIcon = new ImageIcon(newing2); // image est redimensionné en imageIcon pour être utilisé dans un label


        // Redimensionne l'îcone exit
        Image image3 = exitIcon.getImage(); // transformation de l'icône en image
        Image newing3 = image3.getScaledInstance(30,30, Image.SCALE_SMOOTH);
        exitIcon = new ImageIcon(newing3); // image est redimensionné en imageIcon pour être utilisé dans un label


        // Add an Action
        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);

        loadItem.setIcon(loadIcon);
        saveItem.setIcon(saveIcon);
        exitItem.setIcon(exitIcon);

        fileMenu.setMnemonic(KeyEvent.VK_F);  // Alt + f for file
        editMenu.setMnemonic(KeyEvent.VK_E);  // Alt + e for edit
        helpMenu.setMnemonic(KeyEvent.VK_H);  // Alt + h for help
        loadItem.setMnemonic(KeyEvent.VK_L); // l for load
        saveItem.setMnemonic(KeyEvent.VK_S); // s for save
        exitItem.setMnemonic(KeyEvent.VK_E); // e for exit

        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);
        menuBar.add(fileMenu);
        menuBar.add(editMenu);
        menuBar.add(helpMenu);

        this.setJMenuBar(menuBar);
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loadItem) {
            System.out.println("*beep boop* you load a file");
        } else if (e.getSource()==saveItem) {
            System.out.println("*beep boop* you saved a file");
        } else if (e.getSource() == exitItem) {
            System.out.println(0);

        }
    }
}
