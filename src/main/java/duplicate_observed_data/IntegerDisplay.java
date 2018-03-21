package duplicate_observed_data;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IntegerDisplay extends JFrame implements ActionListener {

	private JPanel contentPane;
	private JButton btnIncrement;
	private JButton btnDecrement;
	
	private int value;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IntegerDisplay frame = new IntegerDisplay();
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
	public IntegerDisplay() {
		setTitle("IntegerDisplay");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 300, 200);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(new GridLayout(0, 2, 0, 0));
		
		JLabel titleOctal = new JLabel("Octal:");
		contentPane.add(titleOctal);
		
		JLabel lblOctal = new JLabel("0");
		contentPane.add(lblOctal);
		
		JLabel titleDecimal = new JLabel("Decimal:");
		contentPane.add(titleDecimal);
		
		JLabel lblDecimal = new JLabel("0");
		contentPane.add(lblDecimal);
		
		JLabel titleHexadecimal = new JLabel("Hexadecimal:");
		contentPane.add(titleHexadecimal);
		
		JLabel lblHexadecimal = new JLabel("0");
		contentPane.add(lblHexadecimal);
		
		btnIncrement = new JButton("+");
		btnIncrement.addActionListener(this);
		contentPane.add(btnIncrement);
		
		btnDecrement = new JButton("-");
		contentPane.add(btnDecrement);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==btnIncrement) {
			setValue(value +1);
		}
		if (e.getSource()==btnDecrement) {
			setValue(value-1);
		}
	}
	
	private void setValue(int value) {
		// TODO Auto-generated method stub
		
	}

	public int getValue() {
		return value;
	}
}
