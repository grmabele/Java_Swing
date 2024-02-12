import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyFrame16 extends JFrame implements KeyListener {

    MyFrame16 () {

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        // sout = raccourcie pour System.out.println();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        // keyTyped = Invoked a ked is type. Uses keyChar, char output
    }

    @Override
    public void keyPressed(KeyEvent e) {
        //keyPressed = Invoked when a physical key is pressed down. Uses keyCode, int output

    }

    @Override
    public void keyReleased(KeyEvent e) {
        // KeyReleased = called whenever a button is released

    }
}
