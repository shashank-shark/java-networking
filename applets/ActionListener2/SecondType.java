import java.applet.Applet;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SecondType extends Applet
{
    private static final long serialVersionUID = 1L;
	Label label = new Label("Click on me");
    public void init()
    {
        resize(300,100);
        Button btn = new Button("Press");
        add(btn);
        add(label);

        EListener listener = new EListener();
        btn.addActionListener(listener); 
    }

    class EListener implements ActionListener
    {
        public void actionPerformed(ActionEvent e)
        {
            label.setText("The Button is pressed");
        }
    }
}