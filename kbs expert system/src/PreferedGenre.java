import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;

import recommendation.Thedragonprince;
import recommendation.adventuretime;
import recommendation.angeliclayer;
import recommendation.aot;
import recommendation.archer;
import recommendation.atashinci;
import recommendation.barebear;
import recommendation.bdaman;
import recommendation.beyblade;
import recommendation.bigmouth;
import recommendation.billyandmandy;
import recommendation.blackdynamite;
import recommendation.blackjack;
import recommendation.boboiboy;
import recommendation.boboiboymovie;
import recommendation.cardcaptorsakura;
import recommendation.castlevania;
import recommendation.chowder;
import recommendation.coco;
import recommendation.dcblue;
import recommendation.demonslayer;
import recommendation.dexter;
import recommendation.digimon;
import recommendation.ducktales;
import recommendation.dumbbell;
import recommendation.ejenali;
import recommendation.eldorado;
import recommendation.erased;
import recommendation.fairlyoddparent;
import recommendation.familyguy;
import recommendation.finalspace;
import recommendation.frozen;
import recommendation.gengupinipn;
import recommendation.gintama;
import recommendation.gintamafinalchapter;
import recommendation.gravityfalls;
import recommendation.gumball;
import recommendation.hagemaru;
import recommendation.hamtaro;
import recommendation.johnnybravo;
import recommendation.jojo;
import recommendation.klaus;
import recommendation.maruko;
import recommendation.onepiece;
import recommendation.orange;
import recommendation.oremonogatari;
import recommendation.pokemon;
import recommendation.pokemonichooseyou;
import recommendation.powerpuffgirl;
import recommendation.rapunzel;
import recommendation.regularshow;
import recommendation.rickandmorty;
import recommendation.saiki;
import recommendation.shinchan;
import recommendation.shinchanalien;
import recommendation.shinchanmoving;
import recommendation.shrek;
import recommendation.shrek2;
import recommendation.shrek3;
import recommendation.simpson;
import recommendation.spongebob_squarepants;
import recommendation.spongebobmovie;
import recommendation.summerwars;
import recommendation.tamako;
import recommendation.tangled;
import recommendation.toystory;
import recommendation.traindragon;
import recommendation.up;
import recommendation.watamote;
import recommendation.yourname;
import recommendation.zoidwild;

public class PreferedGenre extends JFrame {


	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public PreferedGenre(Movies m) {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblPreferedGenre = new JLabel("Prefered genre?");
		lblPreferedGenre.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblPreferedGenre.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreferedGenre.setBounds(10, 11, 414, 52);
		contentPane.add(lblPreferedGenre);
		
		JButton btnComedy = new JButton("Comedy");
		btnComedy.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.setComedy(true);
				System.out.println("Comedy : "+ m.isComedy() +" (user want to watch comedy)");
				
				if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
					{
						dispose();
						spongebob_squarepants movie = new spongebob_squarepants();
						movie.setLocationRelativeTo(null);
						movie.setVisible(true);
					}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					powerpuffgirl movie = new powerpuffgirl();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					barebear movie = new barebear();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					zoidwild movie = new zoidwild();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					shinchan movie = new shinchan();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					maruko movie = new maruko();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					regularshow movie = new regularshow();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					dexter movie = new dexter();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					fairlyoddparent movie = new fairlyoddparent();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					hagemaru movie = new hagemaru();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					angeliclayer movie = new angeliclayer();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					hamtaro movie = new hamtaro();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					spongebobmovie movie = new spongebobmovie();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					frozen movie = new frozen();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					toystory movie = new toystory();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					boboiboymovie movie = new boboiboymovie();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					shinchanalien movie = new shinchanalien();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					gengupinipn movie = new gengupinipn();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					simpson movie = new simpson();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					blackdynamite movie = new blackdynamite();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					familyguy movie = new familyguy();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					saiki movie = new saiki();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					gintama movie = new gintama();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					dumbbell movie = new dumbbell();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					chowder movie = new chowder();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					billyandmandy movie = new billyandmandy();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					johnnybravo movie = new johnnybravo();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					watamote movie = new watamote();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					oremonogatari movie = new oremonogatari();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					atashinci movie = new atashinci();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					shrek2 movie = new shrek2();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					shrek movie = new shrek();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					shrek3 movie = new shrek3();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==true))
				{
					dispose();
					gintamafinalchapter movie = new gintamafinalchapter();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==true))
				{
					dispose();
					yourname movie = new yourname();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==true))
				{
					dispose();
					summerwars movie = new summerwars();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				
				
				
				
				
			}
		});
		
		
		btnComedy.setBounds(161, 112, 106, 33);
		contentPane.add(btnComedy);
		
		JButton btnAction = new JButton("Action");
		btnAction.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				m.setComedy(false);
				System.out.println("Comedy : "+ m.isComedy() +" (user want to watch action)");
				
				if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					Thedragonprince movie = new Thedragonprince();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					rapunzel movie = new rapunzel();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					gumball movie = new gumball();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					pokemon movie = new pokemon();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					boboiboy movie = new boboiboy();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					beyblade movie = new beyblade();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					adventuretime movie = new adventuretime();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					adventuretime movie = new adventuretime();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					gravityfalls movie = new gravityfalls();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					bdaman movie = new bdaman();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					cardcaptorsakura movie = new cardcaptorsakura();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					digimon movie = new digimon();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					traindragon movie = new traindragon();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					up movie = new up();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					tangled movie = new tangled();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					pokemonichooseyou movie = new pokemonichooseyou();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					dcblue movie = new dcblue();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==true)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					shinchanmoving movie = new shinchanmoving();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					castlevania movie = new castlevania();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					bigmouth movie = new bigmouth();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					finalspace movie = new finalspace();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					jojo movie = new jojo();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					aot movie = new aot();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==true)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					demonslayer movie = new demonslayer();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					rickandmorty movie = new rickandmorty();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					archer movie = new archer();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					ducktales movie = new ducktales();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					erased movie = new erased();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					orange movie = new orange();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==true)&&(m.isOngoing()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					blackjack movie = new blackjack();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					coco movie = new coco();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					eldorado movie = new eldorado();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==true)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					klaus movie = new klaus();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==true)&&(m.isComedy()==false))
				{
					dispose();
					onepiece movie = new onepiece();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==true)&&(m.isComedy()==false))
				{
					dispose();
					tamako movie = new tamako();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				else if((m.isAge()==false)&&(m.isTv()==false)&&(m.isHollywood()==false)&&(m.isAlone()==false)&&(m.isPartner()==false)&&(m.isComedy()==false))
				{
					dispose();
					ejenali movie = new ejenali();
					movie.setLocationRelativeTo(null);
					movie.setVisible(true);
				}
				
				
				
			}
		});
		btnAction.setBounds(161, 167, 106, 33);
		contentPane.add(btnAction);
	}

}
