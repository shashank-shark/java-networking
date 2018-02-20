import javax.swing.*;

class BasicSwing extends JFrame
{
    private static final long serialVersionUID = 1L;

	public static void main (String[] args)
    {
        new BasicSwing();
    }

    public BasicSwing()
    {
        setTitle("A Simple basic GUI window in java");
        setSize(300,200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}