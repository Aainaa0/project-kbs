import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class AloneorNot extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public AloneorNot(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAreYouWatching = new JLabel("Are you watching alone?");
		lblAreYouWatching.setHorizontalAlignment(SwingConstants.CENTER);
		lblAreYouWatching.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAreYouWatching.setBounds(10, 11, 414, 52);
		contentPane.add(lblAreYouWatching);
		
		JButton btnYes = new JButton("Yes");
		btnYes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setAlone(true);
				System.out.println("Alone : "+ m.isAlone() +" (user is forever alone)");
				PreferedGenre movie = new PreferedGenre(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnYes.setBounds(161, 112, 106, 33);
		contentPane.add(btnYes);
		
		JButton btnNo = new JButton("No");
		btnNo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setAlone(false);
				System.out.println("Alone : "+ m.isAlone() +" (user is watching with someone)");
				FamilyorSpouse movie = new FamilyorSpouse(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnNo.setBounds(161, 167, 106, 33);
		contentPane.add(btnNo);
	}

}
