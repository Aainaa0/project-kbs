import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class FamilyorSpouse extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */

	/**
	 * Create the frame.
	 */
	public FamilyorSpouse(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblThenWithWho = new JLabel("Then, with who?");
		lblThenWithWho.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblThenWithWho.setHorizontalAlignment(SwingConstants.CENTER);
		lblThenWithWho.setBounds(10, 11, 414, 52);
		contentPane.add(lblThenWithWho);
		
		JButton btnFamilyfriends = new JButton("Family/friends");
		btnFamilyfriends.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setPartner(false);
				System.out.println("Partner : "+ m.isPartner() +" (user is watching with his/her family/friends)");
				PreferedGenre movie = new PreferedGenre(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnFamilyfriends.setBounds(134, 112, 164, 33);
		contentPane.add(btnFamilyfriends);
		
		JButton btnPartner = new JButton("Partner");
		btnPartner.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setPartner(true);
				System.out.println("Partner : "+ m.isPartner() +" (user is watching with his/her partner)");
				PreferedGenre movie = new PreferedGenre(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnPartner.setBounds(134, 167, 164, 33);
		contentPane.add(btnPartner);
	}

}
