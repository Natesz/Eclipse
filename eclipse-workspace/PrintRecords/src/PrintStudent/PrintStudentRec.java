package PrintStudent;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;
import java.awt.Color;
import javax.swing.JTextArea;
import javax.swing.JList;
import javax.swing.JScrollBar;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;

public class PrintStudentRec {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PrintStudentRec window = new PrintStudentRec();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public PrintStudentRec() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1360, 2500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(26, 11, 1284, 101);
		panel.setBorder(new LineBorder(new Color(0, 0, 0), 12));
		frame.getContentPane().add(panel);
		
		JLabel lblGameOfThrones = new JLabel("Game of Thrones Statisztika");
		
		lblGameOfThrones.setForeground(Color.BLACK);
		lblGameOfThrones.setFont(new Font("Tahoma", Font.BOLD, 18));
		panel.add(lblGameOfThrones);
		
	}
}
