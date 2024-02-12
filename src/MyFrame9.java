import javax.swing.*;
import javax.swing.text.Caret;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame9 extends JFrame implements ActionListener {

    JTextField textField = new JTextField();
    JButton button = new JButton("Submit");

    MyFrame9() {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());


        button.addActionListener(this);

        textField.setPreferredSize(new Dimension(250,40));
        textField.setFont(new Font("Consolas",Font.PLAIN,35));
        textField.setForeground(new Color(0x00FF00));
        textField.setBackground(Color.BLACK);
        textField.setCaretColor(Color.WHITE);
        textField.setText("username");


        this.add(button);
        this.add(textField);
        this.pack();
        this.setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == button) {
            System.out.println("Welcom "+ textField.getText());
            button.setEnabled(false);
            textField.setEditable(false);
            //textField.getText();
        }

    }
}
