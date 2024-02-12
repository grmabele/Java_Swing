import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;

public class MyFrame14 extends JFrame implements ActionListener {

    JButton button = new JButton("Select file");

    JFileChooser fileChooser = new JFileChooser();
    MyFrame14 () {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button.addActionListener(this);

        this.add(button);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == button) {

            fileChooser.setCurrentDirectory(new File("."));
           // int response = fileChooser.showOpenDialog(null); // select file to open
            int response = fileChooser.showSaveDialog(null); // select file to open

            if (response == JFileChooser.APPROVE_OPTION) {
                File file = new File(fileChooser.getSelectedFile().getAbsolutePath());
                System.out.println(file);
            }

            // System.out.println(fileChooser.showOpenDialog(null));

           // fileChooser.showOpenDialog(null); //select file to open
        }
    }
}
