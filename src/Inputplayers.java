import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JLabel;

public class Inputplayers extends JFrame {

	private JPanel contentPane;
	public JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
//		MainScore ms = new MainScore(txt);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Inputplayers frame = new Inputplayers();
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
	String[] txt = new String[20];
	private JLabel lblTeam;
	private JLabel lblTeam_1;
	public Inputplayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 500, 450);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		textField = new JTextField("Player 1");
		textField.setColumns(10);
		txt[0] = textField.getText().toString();
		
		textField_1 = new JTextField("Player 2");
		textField_1.setColumns(10);
		txt[1] = textField_1.getText().toString();
		
		textField_2 = new JTextField("Player 3");
		textField_2.setColumns(10);
		txt[2] = textField_2.getText().toString();
		
		textField_3 = new JTextField("Player 4");
		textField_3.setColumns(10);
		txt[3] = textField_3.getText().toString();
		
		textField_4 = new JTextField("Player 5");
		textField_4.setColumns(10);
		txt[4] = textField_4.getText().toString();
		
		
		
		textField_11 = new JTextField("Player 1");
		textField_11.setColumns(10);
		txt[11] = textField_11.getText().toString();
		
		textField_12 = new JTextField("Player 2");
		textField_12.setColumns(10);
		txt[12] = textField_12.getText().toString();
		
		textField_13 = new JTextField("Player 3");
		textField_13.setColumns(10);
		txt[13] = textField_13.getText().toString();
		
		textField_14 = new JTextField("Player 4");
		textField_14.setColumns(10);
		txt[14] = textField_14.getText().toString();
		
		textField_15 = new JTextField("Player 5");
		textField_15.setColumns(10);
		txt[15] = textField_15.getText().toString();
		
		JButton btnSubmit = new JButton("Submit");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				String s= textField_14.getText().toString();
				System.out.println(s);
			    Selectplayers mn= new Selectplayers();
				dispose();
				mn.setVisible(true);
				
			}
		});
		
		lblTeam = new JLabel("Team 1");
		
		lblTeam_1 = new JLabel("Team 2");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED, 98, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(96))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(150)
					.addComponent(btnSubmit)
					.addContainerGap(257, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(30)
					.addComponent(lblTeam)
					.addPreferredGap(ComponentPlacement.RELATED, 213, Short.MAX_VALUE)
					.addComponent(lblTeam_1)
					.addGap(127))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(12)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_15, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_11, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_2, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_12, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_3, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_13, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(6)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(textField_4, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(textField_14, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(52)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTeam)
						.addComponent(lblTeam_1))
					.addGap(31)
					.addComponent(btnSubmit)
					.addContainerGap(156, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
