// 15 Demonstrate concept of event handling
import java.awt.*;
import java.applet.*;
import java.awt.event.*;

class KeyBoard extends Applet implements KeyListener {
    String msg = " ";

    public void init() {
        addKeyListener(this);
        requestFocus();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 100, 50);
    }

    public void keyTyped(KeyEvent ke) {
        msg = String.valueOf((ke.getKeyChar()));
        repaint();
    }

    public void keyPressed(KeyEvent ke) {
        msg = "Key Pressed";
        repaint();
    }

    public void keyReleased(KeyEvent ke) {
        msg = "keyReleased";
        repaint();
    }
}