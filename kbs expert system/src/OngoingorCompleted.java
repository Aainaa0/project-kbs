import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class OngoingorCompleted extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					OngoingorCompleted frame = new OngoingorCompleted();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public OngoingorCompleted(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblOngoingOrCompleted = new JLabel("Ongoing or completed?");
		lblOngoingOrCompleted.setHorizontalAlignment(SwingConstants.CENTER);
		lblOngoingOrCompleted.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblOngoingOrCompleted.setBounds(10, 11, 414, 52);
		contentPane.add(lblOngoingOrCompleted);
		
		JButton btnOngoing = new JButton("Ongoing");
		btnOngoing.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setOngoing(true);
				System.out.println("Ongoing : "+ m.isOngoing() +" (user want ongoing series)");
				HollywoodorAsia movie = new HollywoodorAsia(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnOngoing.setBounds(161, 112, 106, 33);
		contentPane.add(btnOngoing);
		
		JButton btnCompleted = new JButton("Completed");
		btnCompleted.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setOngoing(false);
				System.out.println("Ongoing : "+ m.isOngoing() +" (user want completed series)");
				HollywoodorAsia movie = new HollywoodorAsia(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnCompleted.setBounds(161, 167, 106, 33);
		contentPane.add(btnCompleted);
	}

}
