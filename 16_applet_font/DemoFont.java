// 16 Program to demonstrate different types of fonts.
import java.applet.Applet;
import java.awt.Font;
import java.awt.*;

public class DemoFont extends Applet {
    public void paint(Graphics g) {
        Font f1 = new Font("SERIF", Font.PLAIN, 20);
        g.setFont(f1);
        g.drawString("Hello!!", 40, 45);
        Font f2 = new Font("MONOSPACED", Font.BOLD, 20);
        g.setFont(f2);
        g.drawString("Hello word!!", 40, 70);
        Font f3 = new Font(" SANS_SERIF", Font.ITALIC, 20);
        g.setFont(f3);
        g.drawString("Hello word!!", 40, 100);
    }
}