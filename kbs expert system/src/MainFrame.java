import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JTextField;
import javax.swing.JTextArea;

public class MainFrame {

	private JFrame frame;
	private JTextField txtDevelopedBy;
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainFrame window = new MainFrame();
					window.frame.setLocationRelativeTo(null);
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}


	public MainFrame() {
		initialize();
	}


	private void initialize() {
		Movies m = new Movies();
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.background"));
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblLabel = new JLabel("What movie/tv animation should you watch? ");
		lblLabel.setForeground(new Color(0, 0, 0));
		lblLabel.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblLabel.setBounds(10, 11, 414, 52);
		frame.getContentPane().add(lblLabel);
		
		JButton btnStart = new JButton("START QUIZ");
		btnStart.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnStart.setForeground(UIManager.getColor("Button.disabledShadow"));
		btnStart.setBackground(UIManager.getColor("Button.disabledForeground"));
		btnStart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//frame.dispose();
				Age age = new Age(m);
				age.setLocationRelativeTo(null);
				age.setVisible(true);
								
				
			}
		});
		btnStart.setBounds(148, 171, 139, 67);
		frame.getContentPane().add(btnStart);
		
		JTextArea textArea = new JTextArea("Developed by:\nAainaa Nabilah binti Rohaizad\nGion Min Ming\nNur Alis Sophia binti Suhaimi");
		textArea.setBackground(UIManager.getColor("Button.background"));
		textArea.setFont(new Font("Monospaced", Font.PLAIN, 14));
		textArea.setEditable(false);
		textArea.setLineWrap(true);
		textArea.setBounds(92, 74, 316, 84);
		frame.getContentPane().add(textArea);
		

	}
}
