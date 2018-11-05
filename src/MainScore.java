
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;
import javax.swing.JTree;
import javax.swing.JTextPane;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.UIManager;
import java.awt.Font;

public class MainScore extends JFrame{

	String[] text = new String[20];
	private JPanel contentPane;
	private JLabel t1player5;
	private JLabel t1player4;
	private JLabel t1p4s;
	private JLabel t1player3;
	String score1;
	private JLabel t1p5s;
	private JLabel t1player2;
	private JLabel t1player1;
	private JLabel t2p1s;
	private JLabel t2p3s;
	private JLabel t2p4s;
	private JLabel t2p2s;
	private JLabel t2p5s;
	private JLabel teamscore1;
	private JLabel teamscore;
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
		String s = new score1(); 
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
//		set s = new set();
		
		t1player1 = new JLabel("New label");
		//System.out.println(s);
//		lblNewLabel.setText(text[0]);
		
		t1player2 = new JLabel("New label");
//		lblNewLabel_1.setText(text[1]);
		
		t1player3 = new JLabel("New label");
//		lblNewLabel_2.setText(text[2]);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setText(text[3]);
		
		t1player4 = new JLabel("New label");
//		lblNewLabel_4.setText(text[4]);
		
		t1player5 = new JLabel("New label");
//		lblNewLabel_5.setText(text[5]);
		
		JLabel t2player5 = new JLabel("New label");
//		lblNewLabel_7.setText(text[6]);
		
		JLabel t2player4 = new JLabel("New label");
//		lblNewLabel_6.setText(text[7]);
		
		JLabel t2player3 = new JLabel("New label");
//		lblNewLabel_8.setText(text[8]);
		
		JLabel t2player1 = new JLabel("New label");
//		lblNewLabel_9.setText(text[9]);
		
		JLabel t2player2 = new JLabel("New label");
//		lblNewLabel_19.setText(text[19]);
		System.out.println(text[19]);
		
		JButton runs1 = new JButton("1");
		runs1.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				 score1+=Integer.parseUnsignedInt(runs1.getLabel().toString());
				 teamscore.setText(score1);
			}
		});
		
		JButton runs2 = new JButton("2");
		runs2.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs2.getLabel().toString());
				teamscore.setText(score1);
			}
		});
		
		JButton runs3 = new JButton("3");
		runs3.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs3.getLabel().toString());
				teamscore.setText(score1);
			}
		});
		
		JButton runs4 = new JButton("4");
		runs4.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs4.getLabel().toString());
				teamscore.setText(score1);
			}
		});
		
		JButton runs6 = new JButton("6");
		runs6.addActionListener(new ActionListener() {
			@SuppressWarnings("deprecation")
			public void actionPerformed(ActionEvent e) {
				score1+=Integer.parseUnsignedInt(runs6.getLabel().toString());
				teamscore.setText(score1);
			}
		});
		
		JButton runs0 = new JButton("0");
		
		JRadioButton wide1 = new JRadioButton("Wide");
		
		JLabel lblTeam = new JLabel("Team 1");
		
		JLabel lblTeam_1 = new JLabel("Team 2");
		
		JRadioButton rdbtnNoBall = new JRadioButton("No Ball");
		
		JRadioButton rdbtnByes = new JRadioButton("Byes");
		
		JRadioButton wide2 = new JRadioButton("Wide");
		
		JRadioButton noball2 = new JRadioButton("No Ball");
		
		JRadioButton byes2 = new JRadioButton("Byes");
		
		JButton blowed = new JButton("Blowed");
		
		JButton lbw = new JButton("LBW");
		lbw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton runout = new JButton("Run Out");
		
		JLabel t1p1s = new JLabel("New label");
		
		JLabel t1p2s = new JLabel("New label");
		
		JLabel t1p3s = new JLabel("New label");
		
		t1p4s = new JLabel("New label");
		
		t1p5s = new JLabel("New label");
		
		t2p1s = new JLabel("New label");
		
		t2p2s = new JLabel("New label");
		
		t2p3s = new JLabel("New label");
		
		t2p4s = new JLabel("New label");
		
		t2p5s = new JLabel("New label");
		
		teamscore1 = new JLabel("Team Score ");
		teamscore1.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 14));
		teamscore1.setBackground(Color.BLACK);
		teamscore1.setForeground(Color.BLUE);
		
		teamscore = new JLabel("New label");
		
		JLabel teamscore2 = new JLabel("Team score");
		
		JLabel lblNewLabel = new JLabel("New label");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(t1player5)
							.addGap(31)
							.addComponent(t1p5s, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
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
									.addComponent(t1p4s, 0, 0, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(t1p2s, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
										.addComponent(t1p3s, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
								.addComponent(t1p1s, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))))
					.addGap(45)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTeam_1)
							.addGap(111))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(wide1)
													.addGap(35))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addComponent(rdbtnNoBall)
														.addComponent(rdbtnByes))
													.addGap(18)))
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
											.addGap(158)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
												.addComponent(blowed, Alignment.LEADING)
												.addComponent(runout, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(lbw, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
									.addPreferredGap(ComponentPlacement.RELATED, 75, Short.MAX_VALUE)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(noball2)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(wide2)
													.addGap(13)))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(byes2)
												.addGap(259)
												.addComponent(t2p1s, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
										.addComponent(t2p4s, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(t2p3s, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(t2p2s, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)))
								.addComponent(t2p5s, Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
							.addGap(42)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(t2player5)
								.addComponent(t2player4)
								.addComponent(t2player3)
								.addComponent(t2player2)
								.addComponent(t2player1))
							.addGap(103))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(teamscore1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(18)
							.addComponent(teamscore)
							.addContainerGap(885, Short.MAX_VALUE))
						.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(teamscore2)
							.addGap(50)
							.addComponent(lblNewLabel)
							.addGap(114))))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(17)
									.addComponent(wide2))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(15)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(runs0)
										.addComponent(runs2)
										.addComponent(runs1)
										.addComponent(wide1)))
								.addComponent(lblTeam))
							.addGap(2)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(noball2)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(byes2)
														.addComponent(t1p2s, GroupLayout.PREFERRED_SIZE, 19, GroupLayout.PREFERRED_SIZE))
													.addGap(7))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(t2p1s)
													.addGap(18)))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(t2player2)
												.addComponent(t2p2s)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(4)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(t1player1)
												.addComponent(t1p1s))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(22)
													.addComponent(lblNewLabel_3)
													.addGap(42)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(t1player3)
														.addComponent(t1p3s)))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(25)
													.addComponent(t1player2))))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(22)
									.addComponent(rdbtnByes)
									.addPreferredGap(ComponentPlacement.UNRELATED)
									.addComponent(rdbtnNoBall)))
							.addGap(22)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t1player4)
								.addComponent(t1p4s))
							.addGap(38)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t1player5)
								.addComponent(t1p5s))
							.addGap(62))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(lblTeam_1)
									.addGap(81)
									.addComponent(t2player1))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(58)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(runs4)
										.addComponent(runs6)
										.addComponent(runs3))))
							.addPreferredGap(ComponentPlacement.RELATED, 47, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(blowed)
									.addGap(18)
									.addComponent(lbw)
									.addPreferredGap(ComponentPlacement.RELATED))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
										.addComponent(t2player3)
										.addComponent(t2p3s))
									.addGap(27)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(runout)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(t2player4)
									.addComponent(t2p4s)))
							.addGap(12)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(t2player5)
								.addComponent(t2p5s))
							.addGap(38)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(teamscore2)
						.addComponent(lblNewLabel))
					.addGap(223))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
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
		lblNewLabel_12.setText(text[10]);
	}
}
