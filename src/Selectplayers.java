import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import java.awt.Color;

public class Selectplayers extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Selectplayers frame = new Selectplayers();
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
	public Selectplayers() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
// 		nds(100, 100, 450, 300);
// 		contentPane = new JPanel();
// 		contentPane.setBackground(Color.GRAY);
// 		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
// 		setContentPane(contentPane);
		
		JButton btnPlayers = new JButton("Heads");
		btnPlayers.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				
				Inputplayers mn= new Inputplayers();
			    
				dispose();
				mn.setVisible(true);
				
			}
		});
		JButton btnPlayers_1 = new JButton("Tails");
		btnPlayers_1.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent ae) {
			
			Inputplayers mn= new Inputplayers();
		    
			dispose();
			mn.setVisible(true);
			
		}
	});
		
		JLabel lblTossTime = new JLabel("Toss time");
		
		JButton btnEnterTheMatch = new JButton("Enter the Match");
		btnEnterTheMatch.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				MainScore mn= new MainScore();
				dispose();
				mn.indscore=mn.t1p1;
				mn.setVisible(true);
				
				
			}
		});
		Toolkit t=Toolkit.getDefaultToolkit();  
        Image i=t.getImage("Toolkit t=Toolkit.getDefaultToolkit();  \n" + 
        		"        Image i=t.getImage(\"p3.gif\");  \n" + 
        		"        g.drawImage(i, 120,100,this);  \n" + 
        		"");  

		
		JLabel lblTeamPlease = new JLabel("Team 1 please choose");
		
	
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addGap(34)
					.addComponent(btnPlayers)
					.addPreferredGap(ComponentPlacement.RELATED, 203, Short.MAX_VALUE)
					.addComponent(btnPlayers_1)
					.addGap(47))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(272, Short.MAX_VALUE)
					.addComponent(lblTossTime)
					.addGap(177))
				.addGroup(Alignment.TRAILING, gl_contentPane.createSequentialGroup()
					.addContainerGap(225, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(btnEnterTheMatch)
						.addComponent(lblTeamPlease))
					.addGap(135))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblTossTime)
					.addGap(18)
					.addComponent(lblTeamPlease)
					.addPreferredGap(ComponentPlacement.RELATED, 118, Short.MAX_VALUE)
					.addComponent(btnEnterTheMatch)
					.addGap(57))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(107)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnPlayers_1)
						.addComponent(btnPlayers))
					.addContainerGap(128, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
	}

}
