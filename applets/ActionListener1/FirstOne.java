import java.applet.Applet;
import java.awt.*;

public class FirstOne extends Applet
{
    private static final long serialVersionUID = 1L;
	Label label = new Label("Click on the press button");

    public void init()
    {
        resize(300,100);

        Button btn = new Button("Press");
        add(btn);
        add(label);

        btn.addActionListener(
            ae -> {
                label.setText("You clicked the button");
            }
        );
    }

    public void paint(Graphics g) {}
}