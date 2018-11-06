
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.border.EmptyBorder;

public class MainScore extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String[] text = new String[20];
	private JPanel contentPane;
	private JLabel t1player5;
	private JLabel t1player4;
	private JLabel t1p4;
	private JLabel t1player3;
	int score1=0; 
	int sco=0;
	int score2=0;
	private JLabel t1p5;
	private JLabel t1player2;
     JLabel t1player1;
	private JLabel teamscore1;
	private JLabel teamscore;
	private JLabel t1p3;
	private JLabel t1p2;
	JLabel t1p1;
	JLabel indscore=new JLabel();
	private JButton extra;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainScore frame = new MainScore();
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
	public MainScore() {
//		String s = score1.toString(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 600, 600);
		contentPane = new JPanel();
		contentPane.setBackground(Color.CYAN);
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		set s = new set();
		
		t1player1 = new JLabel("Ganguly");
		//System.out.println(s);
		//lblNewLabel.setText();
		
		
		t1player2 = new JLabel("Dhoni");
//		lblNewLabel_1.setText(text[1]);
		
		t1player3 = new JLabel("kohili");
//		lblNewLabel_2.setText(text[2]);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setText(text[3]);
		
		t1player4 = new JLabel("Rohit");
//		t1player4.setText(text[4]);
		
		t1player5 = new JLabel("Sachin");
//		lblNewLabel_19.setText(text[19]);
		System.out.println(text[19]);

		JButton runs1 = new JButton("1");
		runs1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
		
			public void actionPerformed(ActionEvent e) {
				 score1+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				 teamscore.setText(String.valueOf(score1));
				 sco+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				 indscore.setText(String.valueOf(sco));
			}
		});
		
		JButton runs2 = new JButton("2");
		runs2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs2.getLabel().toString());
				teamscore.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs2.getLabel().toString());
				indscore.setText(String.valueOf(sco));
			}
		});
		
		JButton runs3 = new JButton("3");
		runs3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs3.getLabel().toString());
				teamscore.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs3.getLabel().toString());
				indscore.setText(String.valueOf(sco));
			}
		});
		
		JButton runs4 = new JButton("4");
		runs4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs4.getLabel().toString());
				teamscore.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs4.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				System.out.println("That 4 runs!!");
			}
		});
		
		JButton runs6 = new JButton("6");
		runs6.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs6.getLabel().toString());
				teamscore.setText(String.valueOf(score1));
				sco+=Integer.parseUnsignedInt(runs6.getLabel().toString());
				indscore.setText(String.valueOf(sco));
				System.out.println("That 6 runs!!");
			}
		});
		
		JButton runs0 = new JButton("0");
		
		JLabel lblTeam = new JLabel("Team 1");
		
		JButton out = new JButton("Out");
		out.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			  sco=0;
				
				
				if(indscore==t1p1)
				{
					indscore=t1p2;
				}
				else if(indscore==t1p2)
				{
					indscore=t1p3;
				}
				else if(indscore==t1p3)
				{
					indscore=t1p4;
				}
				else if(indscore==t1p4){
					indscore=t1p5;
				}
				else if(indscore==t1p5)
				{
					Team2 mn= new Team2();
					dispose();
					mn.indscore=mn.t2p1;
					mn.score2=score1;
					mn.setVisible(true);
					if(score1>mn.score1)
					{
						Team1won m= new Team1won();
						dispose();
						m.setVisible(true);
					}
					else if(score1<mn.score1)
					{
						Team2won n= new Team2won();
						dispose();
						n.setVisible(true);
					}
					else if(score1==mn.score1)
					{
						System.out.println(score1+" "+mn.score1);
						DrawMatch mno= new DrawMatch();
						dispose();
						mno.setVisible(true);
					}
				}
			}
		});
		
		t1p1 = new JLabel("0");
		
		t1p2 = new JLabel("0");
		
		t1p3 = new JLabel("0");
		
		t1p4 = new JLabel("0");
		
		t1p5 = new JLabel("0");
		
		teamscore1 = new JLabel("Team Score ");
		teamscore1.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 14));
		teamscore1.setBackground(Color.BLACK);
		teamscore1.setForeground(Color.BLUE);
		
		teamscore = new JLabel("New label");
		
		extra = new JButton("Extra");
		extra.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				teamscore.setText(String.valueOf(score1));
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(t1player5)
							.addGap(31)
							.addComponent(t1p5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(t1player4)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addComponent(t1player2)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(lblNewLabel_3)
												.addComponent(lblTeam, Alignment.TRAILING))
											.addComponent(t1player3))
										.addPreferredGap(ComponentPlacement.UNRELATED))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(t1player1)
										.addGap(3))))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(t1p4, 0, 0, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(t1p2, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addComponent(t1p3, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
								.addComponent(t1p1, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(141)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addComponent(runs0)
								.addComponent(runs3))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(runs1)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(runs2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(runs4)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(runs6))))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(56)
							.addComponent(extra)
							.addGap(37)
							.addComponent(out)))
					.addContainerGap(152, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(teamscore1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGap(18)
					.addComponent(teamscore)
					.addContainerGap(385, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(15)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(runs0)
										.addComponent(runs2)
										.addComponent(runs1)))
								.addComponent(lblTeam))
							.addGap(20)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(24)
									.addComponent(t1p2, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(4)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(t1player1)
										.addComponent(t1p1))
									.addPreferredGap(ComponentPlacement.RELATED)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(22)
											.addComponent(lblNewLabel_3)
											.addGap(42)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(t1player3)
												.addComponent(t1p3)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(25)
											.addComponent(t1player2)))))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t1player4)
								.addComponent(t1p4))
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t1player5)
								.addComponent(t1p5)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(58)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(runs4)
								.addComponent(runs6)
								.addComponent(runs3))
							.addGap(52)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(out)
								.addComponent(extra))))
					.addGap(300))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(325)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(teamscore1, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE)
						.addComponent(teamscore))
					.addGap(197))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void set(String s) {
		System.out.println(s);
		text[0] = s;
		System.out.println(text[0]);
		
	}
}
