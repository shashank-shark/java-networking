import java.applet.*;
import java.awt.Graphics;
import java.awt.*;

public class Labels extends Applet
{
    private static final long serialVersionUID = 1L;
	Label label1 = new Label("welcome to applet world");
    Label label2 = new Label("Shashank J");

    public void init()
    {
        setSize(400,300);
        add(label1);
        add(label2);
    }

    public void paint(Graphics g)
    {
        g.drawString("Welcome", 50, 80);
    }
}