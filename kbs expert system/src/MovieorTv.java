import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

public class MovieorTv extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					MovieorTv frame = new MovieorTv();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	public MovieorTv(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie or Tv series?");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblNewLabel.setBounds(10, 11, 414, 52);
		contentPane.add(lblNewLabel);
		
		JButton btnMovies = new JButton("Movies");
		btnMovies.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setTv(false);
				System.out.println("Tv series : "+ m.isTv() +" (user want to see movie)");
				HollywoodorAsia movie = new HollywoodorAsia(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnMovies.setBounds(161, 112, 106, 33);
		contentPane.add(btnMovies);
		
		JButton btnTvSeries = new JButton("Tv series");
		btnTvSeries.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
				m.setTv(true);
				System.out.println("Tv series : "+ m.isTv() +" (user want to see tv series)");
				OngoingorCompleted movie = new OngoingorCompleted(m);
				movie.setLocationRelativeTo(null);
				movie.setVisible(true);
			}
		});
		btnTvSeries.setBounds(161, 167, 106, 33);
		contentPane.add(btnTvSeries);
	}

}
