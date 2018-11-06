import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import java.awt.Color;
import javax.swing.JButton;

public class Welcome extends JFrame {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Welcome frame = new Welcome();
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
	public Welcome() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		JLabel lblHiWelcomeTo = new JLabel("Hi, Welcome to 2 overs Cricket score board Application");
		lblHiWelcomeTo.setForeground(Color.WHITE);
		
		JButton btnEnterToThe = new JButton("Enter to the Match\\");
		btnEnterToThe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
			    Inputplayers mn= new Inputplayers();
				dispose();
				mn.setVisible(true);
				
			}
		});
		
		JLabel label = new JLabel("");
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(122)
							.addComponent(btnEnterToThe))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(172)
							.addComponent(label))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addContainerGap()
							.addComponent(lblHiWelcomeTo)))
					.addContainerGap(38, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblHiWelcomeTo)
					.addGap(33)
					.addComponent(label)
					.addGap(47)
					.addComponent(btnEnterToThe)
					.addContainerGap(113, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
