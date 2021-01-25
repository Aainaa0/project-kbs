import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class Age extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public Age(Movies m) {
		setType(Type.POPUP);

		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();

		
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblAge = new JLabel("Rating category:");
		lblAge.setHorizontalAlignment(SwingConstants.CENTER);
		lblAge.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblAge.setBounds(10, 11, 414, 52);
		contentPane.add(lblAge);
		
		JButton btnBelow = new JButton("13<");
		btnBelow.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setAge(true);
				System.out.println("Age : "+ m.isAge() + " (user is below 13)");
				MovieorTv movie = new MovieorTv(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnBelow.setBounds(161, 112, 106, 33);
		contentPane.add(btnBelow);
		
		JButton btnAbove = new JButton("13>=");
		btnAbove.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setAge(false);
				System.out.println("Age : "+ m.isAge() + " (user is above 13)");
				MovieorTv movie = new MovieorTv(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnAbove.setBounds(161, 167, 106, 33);
		contentPane.add(btnAbove);
	}
}
