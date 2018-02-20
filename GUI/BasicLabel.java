import javax.swing.*;

class BasicLabel extends JFrame
{
    private static final long serialVersionUID = 1L;

	public static void main(String[] args) 
    {
        new BasicLabel();
    }

    public BasicLabel ()
    {
        setTitle("Shashank");
        setSize (300,200);
        JLabel label = new JLabel("Simple JLabel Demonstration", SwingConstants.CENTER);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
}