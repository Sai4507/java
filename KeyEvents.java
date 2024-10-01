import java.awt.*;
import java.awt.event.*;

public class KeyEvents extends Frame {
    public KeyEvents() {
        addKeyListener(new ExKey());
        requestFocus(); // request input focus
        setVisible(true);
        setSize(300, 200);
    }

    public static void main(String args[]) {
        new KeyEvents();
    }
}

class ExKey implements KeyListener {
    public void keyPressed(KeyEvent ke) {
        System.out.println("Key Down");
    }

    public void keyReleased(KeyEvent ke) {
        System.out.println("Key Up");
    }

    public void keyTyped(KeyEvent ke) {
        String msg = "";
        msg += ke.getKeyChar();
        System.out.println(msg);
    }
}
