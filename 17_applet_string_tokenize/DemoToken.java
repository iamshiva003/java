// 17 Create an applet to tokenize the string.
import java.applet.*;
import java.util.StringTokenizer;
import java.awt.*;

public class DemoToken extends Applet {
    String msg;
    int y = 30;
    StringTokenizer st;

    public void init() {
        msg = getParameter("abc");
    }

    public void paint(Graphics g) {
        st = new StringTokenizer(msg, " ");
        while (st.hasMoreTokens()) {
            g.drawString(st.nextToken(), 50, y);
            y = y + 20;
        }
    }
}