import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyFrame12 extends JFrame implements ActionListener {
    String[] animals = {"dog","cat","bird"};
    JComboBox comboBox = new JComboBox(animals);

    MyFrame12() {
        // JComboBox = A component that combines a button or editable field and a drop-)down list =

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        comboBox.addActionListener(this);

        //comboBox.setEditable(true);
        //comboBox.getItemCount();
       // System.out.println(comboBox.getItemCount());
        comboBox.addItem("horse");
        comboBox.insertItemAt("pig",0);
        comboBox.setSelectedIndex(0);
        comboBox.removeItem("cat");
        comboBox.removeItemAt(0);
        // comboBox.removeAll(); // delete all

        this.add(comboBox);
        this.pack();
        this.setVisible(true);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == comboBox) {
            System.out.println(comboBox.getSelectedIndex());


        }
    }
}
