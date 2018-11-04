
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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1100, 600);
		contentPane = new JPanel();
		contentPane.setForeground(Color.MAGENTA);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		
		JLabel lblNewLabel = new JLabel("New label");
		//System.out.println(s);
		lblNewLabel.setText(text[0]);
		
		JLabel lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setText(text[1]);
		
		JLabel lblNewLabel_2 = new JLabel("New label");
		lblNewLabel_2.setText(text[2]);
		
		JLabel lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setText(text[3]);
		
		JLabel lblNewLabel_4 = new JLabel("New label");
		lblNewLabel_4.setText(text[4]);
		
		JLabel lblNewLabel_5 = new JLabel("New label");
		lblNewLabel_5.setText(text[5]);
		
		JLabel lblNewLabel_7 = new JLabel("New label");
		lblNewLabel_7.setText(text[6]);
		
		JLabel lblNewLabel_6 = new JLabel("New label");
		lblNewLabel_6.setText(text[7]);
		
		JLabel lblNewLabel_8 = new JLabel("New label");
		lblNewLabel_8.setText(text[8]);
		
		JLabel lblNewLabel_9 = new JLabel("New label");
		lblNewLabel_9.setText(text[9]);
		
		JLabel lblNewLabel_10 = new JLabel("New label");
		lblNewLabel_10.setText(text[10]);
		
		JLabel lblNewLabel_11 = new JLabel("New label");
		lblNewLabel_11.setText(text[11]);
		
		JLabel lblNewLabel_12 = new JLabel("New label");
		lblNewLabel_12.setText(text[12]);
		
		JLabel lblNewLabel_13 = new JLabel("New label");
		lblNewLabel_13.setText(text[13]);
		
		JLabel lblNewLabel_14 = new JLabel("New label");
		lblNewLabel_14.setText(text[14]);
		
		JLabel lblNewLabel_15 = new JLabel("New label");
		lblNewLabel_15.setText(text[15]);
		
		JLabel lblNewLabel_16 = new JLabel("New label");
		lblNewLabel_16.setText(text[16]);
		
		JLabel lblNewLabel_17 = new JLabel("New label");
		lblNewLabel_17.setText(text[17]);
		
		JLabel lblNewLabel_18 = new JLabel("New label");
		lblNewLabel_18.setText(text[18]);
		
		JLabel lblNewLabel_19 = new JLabel("New label");
		lblNewLabel_19.setText(text[19]);
		System.out.println(text[19]);
		
		JButton button = new JButton("1");
		
		JButton button_1 = new JButton("2");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_2 = new JButton("3");
		
		JButton button_3 = new JButton("4");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton button_4 = new JButton("6");
		
		JButton button_5 = new JButton("0");
		
		JRadioButton rdbtnWide = new JRadioButton("Wide");
		
		JLabel lblTeam = new JLabel("Team 1");
		
		JLabel lblTeam_1 = new JLabel("Team 2");
		
		JRadioButton rdbtnNoBall = new JRadioButton("No Ball");
		
		JRadioButton rdbtnByes = new JRadioButton("Byes");
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("Wide");
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("No Ball");
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("Byes");
		
		JButton btnNewButton = new JButton("Blowed");
		
		JButton btnLbw = new JButton("LBW");
		btnLbw.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		
		JButton btnRunOut = new JButton("Run Out");
		
		JLabel lblNewLabel_20 = new JLabel("New label");
		
		JLabel lblNewLabel_21 = new JLabel("New label");
		
		JLabel lblNewLabel_22 = new JLabel("New label");
		
		JLabel lblNewLabel_23 = new JLabel("New label");
		
		JLabel lblNewLabel_24 = new JLabel("New label");
		
		JLabel label = new JLabel("New label");
		
		JLabel label_1 = new JLabel("New label");
		
		JLabel label_2 = new JLabel("New label");
		
		JLabel label_3 = new JLabel("New label");
		
		JLabel label_4 = new JLabel("New label");
		
		JLabel label_5 = new JLabel("New label");
		
		JLabel label_6 = new JLabel("New label");
		
		JLabel label_7 = new JLabel("New label");
		
		JLabel label_8 = new JLabel("New label");
		
		JLabel label_9 = new JLabel("New label");
		
		JLabel label_10 = new JLabel("New label");
		
		JLabel label_11 = new JLabel("New label");
		
		JLabel label_12 = new JLabel("New label");
		
		JLabel label_13 = new JLabel("New label");
		
		JLabel label_14 = new JLabel("New label");
		
		JLabel lblTeam_2 = new JLabel("Team Score ");
		lblTeam_2.setFont(new Font("DejaVu Sans Condensed", Font.ITALIC, 14));
		lblTeam_2.setBackground(Color.BLACK);
		lblTeam_2.setForeground(Color.BLUE);
		
		JLabel lblNewLabel_25 = new JLabel("New label");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(29)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addComponent(lblNewLabel_3)
							.addComponent(lblTeam, Alignment.TRAILING)
							.addComponent(lblNewLabel_2)
							.addComponent(lblNewLabel_1)
							.addComponent(lblNewLabel)
							.addComponent(lblNewLabel_5)
							.addComponent(lblNewLabel_12)
							.addComponent(lblNewLabel_13)
							.addComponent(lblNewLabel_17))
						.addComponent(lblNewLabel_18)
						.addComponent(lblNewLabel_4))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
						.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
							.addGroup(gl_contentPane.createSequentialGroup()
								.addPreferredGap(ComponentPlacement.UNRELATED)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_21, 0, 0, Short.MAX_VALUE)
									.addComponent(lblNewLabel_20, GroupLayout.PREFERRED_SIZE, 27, Short.MAX_VALUE)))
							.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
								.addGap(13)
								.addComponent(lblNewLabel_22, GroupLayout.PREFERRED_SIZE, 26, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_24, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_23, 0, 0, Short.MAX_VALUE)
								.addComponent(label, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_1, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_2, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_3, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
								.addComponent(label_4, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))))
					.addGap(67)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblTeam_1)
							.addGap(111))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(rdbtnWide)
											.addGap(35))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addComponent(rdbtnByes)
												.addComponent(rdbtnNoBall))
											.addGap(18)))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(button_5)
										.addComponent(button_2))
									.addGap(12)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(button_1))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(button_3)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addComponent(button_4))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGap(158)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
										.addComponent(btnNewButton, Alignment.LEADING)
										.addComponent(btnRunOut, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnLbw, Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
							.addPreferredGap(ComponentPlacement.RELATED, 91, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addComponent(rdbtnNewRadioButton_1)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addComponent(rdbtnNewRadioButton)
										.addGap(13)))
								.addComponent(rdbtnNewRadioButton_2))
							.addPreferredGap(ComponentPlacement.RELATED, 243, Short.MAX_VALUE)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_6, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_5, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_8, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_7, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
									.addGap(18))
								.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
										.addComponent(label_13, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_14, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_12, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_11, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_10, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE)
										.addComponent(label_9, GroupLayout.PREFERRED_SIZE, 28, GroupLayout.PREFERRED_SIZE))
									.addGap(26)))
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addComponent(lblNewLabel_10)
								.addComponent(lblNewLabel_9)
								.addComponent(lblNewLabel_8)
								.addComponent(lblNewLabel_6)
								.addComponent(lblNewLabel_7)
								.addComponent(lblNewLabel_11)
								.addComponent(lblNewLabel_14)
								.addComponent(lblNewLabel_15)
								.addComponent(lblNewLabel_19)
								.addComponent(lblNewLabel_16))
							.addGap(103))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(238)
					.addComponent(lblTeam_2, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(lblNewLabel_25)
					.addContainerGap(696, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addContainerGap()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(17)
											.addComponent(rdbtnNewRadioButton))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(15)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(button_5)
												.addComponent(button_1)
												.addComponent(button)
												.addComponent(rdbtnWide)))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblTeam)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel)
												.addComponent(lblNewLabel_20))))
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(rdbtnNewRadioButton_1)
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(rdbtnNewRadioButton_2)
													.addGap(7)
													.addComponent(label_9))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(4)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
														.addComponent(lblNewLabel_1)
														.addComponent(lblNewLabel_21))
													.addPreferredGap(ComponentPlacement.RELATED)
													.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_2)
															.addGap(7)
															.addComponent(lblNewLabel_3)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(lblNewLabel_4)
															.addGap(24)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_5)
																.addComponent(label))
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_12)
																.addComponent(label_1))
															.addPreferredGap(ComponentPlacement.UNRELATED)
															.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
																.addComponent(lblNewLabel_13)
																.addComponent(label_2))
															.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addGap(18)
																	.addComponent(lblNewLabel_17))
																.addGroup(gl_contentPane.createSequentialGroup()
																	.addPreferredGap(ComponentPlacement.RELATED)
																	.addComponent(label_3))))
														.addGroup(gl_contentPane.createSequentialGroup()
															.addComponent(lblNewLabel_22)
															.addGap(10)
															.addComponent(lblNewLabel_23)
															.addPreferredGap(ComponentPlacement.RELATED)
															.addComponent(lblNewLabel_24)))))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(18)
													.addComponent(lblNewLabel_18))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(18)
													.addComponent(label_4))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(22)
											.addComponent(rdbtnByes))))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblTeam_1)
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_9)
												.addComponent(label_5))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_10)
												.addComponent(label_6))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_8)
												.addComponent(label_7))
											.addGap(12)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
												.addComponent(lblNewLabel_6)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addComponent(label_8)
													.addGap(6))))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addGap(58)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(button_3)
												.addComponent(button_4)
												.addComponent(button_2))))
									.addGap(18)
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(btnNewButton)
											.addGap(18)
											.addComponent(btnLbw)
											.addPreferredGap(ComponentPlacement.RELATED)
											.addComponent(btnRunOut))
										.addGroup(gl_contentPane.createSequentialGroup()
											.addComponent(lblNewLabel_7)
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_11)
												.addComponent(label_10))
											.addPreferredGap(ComponentPlacement.UNRELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_14)
												.addComponent(label_11))
											.addGap(18)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_15)
												.addComponent(label_12))
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
												.addGroup(gl_contentPane.createSequentialGroup()
													.addGap(18)
													.addComponent(lblNewLabel_19))
												.addGroup(gl_contentPane.createSequentialGroup()
													.addPreferredGap(ComponentPlacement.UNRELATED)
													.addComponent(label_13)))
											.addPreferredGap(ComponentPlacement.RELATED)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
												.addComponent(lblNewLabel_16)
												.addComponent(label_14))))))
							.addPreferredGap(ComponentPlacement.RELATED, 36, Short.MAX_VALUE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap(53, Short.MAX_VALUE)
							.addComponent(rdbtnNoBall)
							.addGap(274)))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
						.addComponent(lblNewLabel_25, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblTeam_2, GroupLayout.DEFAULT_SIZE, 38, Short.MAX_VALUE))
					.addGap(172))
		);
		contentPane.setLayout(gl_contentPane);
	}
	
	public void set(String s) {
		System.out.println(s);
		text[0] = s;
		System.out.println(text[0]);
	}
}
