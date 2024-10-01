import java.awt.*;
import java.awt.event.*;

public class MouseEvents extends Frame {
    public MouseEvents() {
        addMouseListener(new ExMouse());
        addMouseMotionListener(new ExMouse());
        setSize(200, 200);
        setVisible(true);
    }

    public static void main(String args[]) {
        new MouseEvents();
    }
}

class ExMouse implements MouseListener, MouseMotionListener {
    public void mouseClicked(MouseEvent me) {
        System.out.println("Mouse clicked.");
    }

    public void mouseEntered(MouseEvent me) {
        System.out.println("Mouse entered.");
    }

    public void mouseExited(MouseEvent me) {
        System.out.println("Mouse exited.");
    }

    public void mousePressed(MouseEvent me) {
        System.out.println("Down");
    }

    public void mouseReleased(MouseEvent me) {
        System.out.println("Up");
    }

    public void mouseDragged(MouseEvent me) {
        System.out.println("Dragging mouse ");
    }

    public void mouseMoved(MouseEvent me) {
        System.out.println("Moving mouse ");
    }
}
