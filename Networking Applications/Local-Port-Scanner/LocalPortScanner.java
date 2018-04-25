/**
*Text genereted by Simple GUI Extension for BlueJ
*/
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.net.*;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EtchedBorder;


public class LocalPortScanner extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JMenuBar menuBar;
	private JButton button1;
	private JButton button2;
	private JButton button3;
	private JButton button4;
	private JLabel label3;
	JTextArea textareainfo;
	

	//Constructor 
	public LocalPortScanner(){
		setResizable(false);

		this.setTitle("GUI_project");
		this.setSize(412,424);
		//menu generate method
		generateMenu();
		this.setJMenuBar(menuBar);

		//pane with null layout
		JPanel contentPane = new JPanel(null);
		contentPane.setBorder(new EtchedBorder(EtchedBorder.RAISED, null, null));
		contentPane.setPreferredSize(new Dimension(412,424));
		contentPane.setBackground(Color.LIGHT_GRAY);


		button1 = new JButton();
		button1.setBounds(8,100,90,35);
		button1.setBackground(new Color(214,217,223));
		button1.setForeground(new Color(0,0,0));
		button1.setEnabled(true);
		button1.setFont(new Font("SansSerif",0,15));
		button1.setText("Start");
		button1.setVisible(true);
		//Set action for button click
		//Call defined method
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent evt) {
				StartScanning(evt);
			}
		});

		//Set methods for mouse events
		//Call defined methods

		button2 = new JButton();
		button2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textareainfo.setText("");
				textareainfo.setText("Port  		Use");
				
				String info;
				info = "1 ) TCP Port Service Multiplexer (TCPMUX)\n ";
				textareainfo.append("\n"+info);
			}
		});
		button2.setBounds(6,150,90,35);
		button2.setBackground(new Color(214,217,223));
		button2.setForeground(new Color(0,0,0));
		button2.setEnabled(true);
		button2.setFont(new Font("SansSerif",0,15));
		button2.setText("Port Info");
		button2.setVisible(true);

		button3 = new JButton();
		button3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textareainfo.setText(" ");
				try
		        {
		            InetAddress myaddress = InetAddress.getLocalHost();
		            textareainfo.setText(myaddress.toString());
		        } catch (UnknownHostException e)
		        {
		            System.out.println("Address not known");
		        }
			}
		});
		button3.setBounds(9,200,90,35);
		button3.setBackground(new Color(214,217,223));
		button3.setForeground(new Color(0,0,0));
		button3.setEnabled(true);
		button3.setFont(new Font("SansSerif",0,15));
		button3.setText("Your IP");
		button3.setVisible(true);

		button4 = new JButton();
		button4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				textareainfo.setText("");
				textareainfo.setText("*****************************\n");
				textareainfo.append("  Local Port Scanner in Java     \n");
				textareainfo.append("*****************************\n");
				textareainfo.append("\n");
				textareainfo.append("  This Application shows \n  the ports that are open\n  on  your local system.");
				textareainfo.append("\n");
				textareainfo.append("\n");
				textareainfo.append("\n");
				textareainfo.append("*****************************\n");
				textareainfo.append("  Developed by Shashank J\n");
				textareainfo.append("*****************************\n");
			}
		});
		button4.setBounds(8,250,90,35);
		button4.setBackground(new Color(214,217,223));
		button4.setForeground(new Color(0,0,0));
		button4.setEnabled(true);
		button4.setFont(new Font("SansSerif",0,15));
		button4.setText("About");
		button4.setVisible(true);

		label3 = new JLabel();
		label3.setBounds(60,24,299,36);
		label3.setBackground(new Color(153,255,153));
		label3.setForeground(Color.BLACK);
		label3.setEnabled(true);
		label3.setFont(new Font("Bookman Old Style", Font.PLAIN, 30));
		label3.setText("Local Port Scanner");
		label3.setVisible(true);

		//adding components to contentPane panel
		contentPane.add(button1);
		contentPane.add(button2);
		contentPane.add(button3);
		contentPane.add(button4);
		contentPane.add(label3);

		//adding panel to JFrame and setting of window position and close operation
		getContentPane().add(contentPane);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(127, 100, 257, 296);
		contentPane.add(scrollPane);
		
		textareainfo = new JTextArea();
		textareainfo.setFont(new Font("Monospaced", Font.BOLD, 13));
		textareainfo.setEditable(false);
		textareainfo.setForeground(Color.BLACK);
		scrollPane.setViewportView(textareainfo);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(355, 100, 29, 296);
		contentPane.add(scrollBar);
		
		JLabel lblNewLabel = new JLabel("by - Shashank J");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(212, 72, 109, 20);
		contentPane.add(lblNewLabel);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.pack();
		this.setVisible(true);
	}

	//Method actionPerformed for button1
	private void StartScanning (ActionEvent evt) {
			//TODO
		textareainfo.setText(" ");
		int port = 0;
		while (port <= 65535) {
			try {
			ServerSocket server = new ServerSocket (port);
			server.close();
			} catch (Exception e) {
			textareainfo.append("Port " + port + " is open \n");
			}
		port ++;
		}
	}

	//method for generate menu
	public void generateMenu(){
		menuBar = new JMenuBar();

		JMenu file = new JMenu("File");
		JMenu tools = new JMenu("Tools");
		JMenu help = new JMenu("Help");

		JMenuItem open = new JMenuItem("Open   ");
		JMenuItem save = new JMenuItem("Save   ");
		JMenuItem exit = new JMenuItem("Exit   ");
		JMenuItem preferences = new JMenuItem("Preferences   ");
		JMenuItem about = new JMenuItem("About   ");


		file.add(open);
		file.add(save);
		file.addSeparator();
		file.add(exit);
		tools.add(preferences);
		help.add(about);

		menuBar.add(file);
		menuBar.add(tools);
		menuBar.add(help);
	}



	 public static void main(String[] args){
		System.setProperty("swing.defaultlaf", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		javax.swing.SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new LocalPortScanner();
			}
		});
	}
}