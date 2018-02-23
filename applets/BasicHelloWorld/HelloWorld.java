import java.applet.Applet;
import java.awt.*;

public class HelloWorld extends Applet
{
    private static final long serialVersionUID = 1L;
	String str;

    public void init()
    {
        str = "This is my first applet program";
    }
    public void start() {}

    public void paint(Graphics g)
    {
        g.drawString(str, 20, 40);
    }
}