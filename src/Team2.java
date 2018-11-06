import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Color;

public class Team2 extends JFrame {

	private JPanel contentPane;
	private JLabel t2player1;
	private JLabel t2player2;
	private JLabel t2player3;
	private JLabel t2player4;
	private JLabel t2player5;
	JLabel t2p1;
	private JLabel t2p2;
	private JLabel t2p3;
	private JLabel t2p4;
	private JLabel t2p5;
	private JButton runs0;
	private JButton runs3;
	private JButton runs1;
	private JButton runs2;
	private JButton runs6;
	private JButton out;
	JLabel indscore;
	int score1=0;
	int sco=0;
	int score2;
	private JButton runs4;
	private JLabel lblTeamScore;
	private JLabel teamscore1;
	private JButton extra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Team2 frame = new Team2();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Team2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.YELLOW);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		t2player1 = new JLabel("Pointing");
		
		t2player2 = new JLabel("warner");
		
		t2player3 = new JLabel("smith");
		
		t2player4 = new JLabel("Finch");
		
		
		t2player5 = new JLabel("Lee");
		t2p1 = new JLabel("0");
		
		t2p2 = new JLabel("0");
		
		t2p3 = new JLabel("0");
		
		t2p4 = new JLabel("0");
		
		t2p5 = new JLabel("0");
		
		runs6 = new JButton("6");
		runs6.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs6.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs6.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				System.out.println(score2);
				if(score1>score2)
				{
					System.out.println(score1);
					dispose();
					Team2won n= new Team2won();
					dispose();
					n.setVisible(true);
					
					
				}
			}
		});
		
		runs4 = new JButton("4");
		runs4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs4.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs4.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				if(score1>score2)
				{
					
					Team2won n= new Team2won();
					dispose();
					n.setVisible(true);
					
				}
			}
		});
		
		runs3 = new JButton("3");
		runs3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs3.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs3.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				if(score1>score2)
				{
					Team2won n= new Team2won();
					dispose();
					n.setVisible(true);
					
				}
			}
		});
		runs0 = new JButton("0");
		
		runs1 = new JButton("1");
		runs1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				if(score1>score2)
				{
					Team2won n= new Team2won();
					dispose();
					n.setVisible(true);
					
				}
			}
		});
		
		runs2 = new JButton("2");
		runs2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs2.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs2.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				if(score1>score2)
				{
					Team2won n= new Team2won();
					dispose();
					n.setVisible(true);
					
				}
			}
		});
		
		out = new JButton("Out");
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  sco=0;
				if(indscore==t2p1)
				{
					indscore=t2p2;
				}
				else if(indscore==t2p2)
				{
					indscore=t2p3;
				}
				else if(indscore==t2p3)
				{
					indscore=t2p4;
				}
				else if(indscore==t2p4)
				{
					indscore=t2p5;
				}
				else if(indscore==t2p5)
				{
					if(score1>score2)
					{
						Team1won m= new Team1won();
						dispose();
						m.setVisible(true);
					}
					else  if(score1==score2)
					{
						System.out.println(score1+" "+score1);
						DrawMatch mno= new DrawMatch();
						dispose();
						mno.setVisible(true);
					}
				}
			}
		});
		
		lblTeamScore = new JLabel("Team Score");
		lblTeamScore.setFont(new Font("Dialog", Font.BOLD | Font.ITALIC, 14));
		
		teamscore1 = new JLabel("ts1");
		
		extra = new JButton("Extra");
		extra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				teamscore1.setText(String.valueOf(score1));
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(10)
							.addComponent(lblTeamScore)
							.addGap(18)
							.addComponent(teamscore1))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(t2player4)
								.addComponent(t2player5))
							.addGap(28)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(t2p4)
								.addComponent(t2p5)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(t2player1)
									.addGap(28)
									.addComponent(t2p1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(t2player2)
									.addGap(28)
									.addComponent(t2p2)))
							.addGap(80)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(runs0)
									.addGap(18)
									.addComponent(runs1)
									.addGap(18)
									.addComponent(runs2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(runs3)
											.addGap(18)
											.addComponent(runs4))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(22)
											.addComponent(extra)))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(out)
										.addComponent(runs6)))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(t2player3)
							.addGap(28)
							.addComponent(t2p3)))
					.addContainerGap(56, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(t2player1)
								.addComponent(t2p1))
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t2p2)
								.addComponent(t2player2))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(10)
									.addComponent(t2player3))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(5)
									.addComponent(t2p3))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(runs0)
								.addComponent(runs1)
								.addComponent(runs2))
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(runs3)
									.addComponent(runs4))
								.addComponent(runs6))))
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(t2player4)
									.addGap(12)
									.addComponent(t2player5))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(t2p4)
									.addGap(12)
									.addComponent(t2p5)))
							.addGap(32)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblTeamScore)
								.addComponent(teamscore1)))
						.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
							.addComponent(out)
							.addComponent(extra)))
					.addGap(4))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
