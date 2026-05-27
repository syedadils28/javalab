/*
  8.write a java applet program which handle  keyboard events.
 */

import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class AppletKeyEvent extends Applet implements KeyListener {
    String msg = " ";
    String key = " ";

    public void init() {
        addKeyListener(this);
        setFocusable(true);
        requestFocus();
    }

    public void paint(Graphics g) {
        g.drawString(msg, 150, 100);

    }

    public void keyReleased(KeyEvent e) {
        showStatus(key + "  keyReleased");
    }

    public void keyPressed(KeyEvent e) {
        int keycode = e.getKeyCode();
        key = e.getKeyText(keycode);
        repaint();
        showStatus(key + " key pressed");
    }

    public void keyTyped(KeyEvent e) {
        char c = e.getKeyChar();
        msg += c;
        key = String.valueOf(c);
        repaint();
    }

}
