import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet{
    String msg;

    public void init()
    {
        setBackground(Color.orange);
        setForeground(Color.black);
        msg = "Basic hello world applet 2";
    }

    public void paint(Graphics g)
    {
        g.drawString(msg,50,80);
        showStatus("Welcome to applet programming");
    }

}