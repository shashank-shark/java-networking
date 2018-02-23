import java.applet.*;
import java.awt.*;

public class AppletImage extends Applet
{
    private static final long serialVersionUID = 1L;
	/* Creating image object of class Image */
    Image img;

    public void init()
    {
        setSize(400,400);
        img = getImage(getCodeBase(), "image1.jpg");
    }

    public void paint(Graphics g)
    {
        g.drawImage(img, 2, 2, this);
    }
}