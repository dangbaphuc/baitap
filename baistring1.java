import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class baistring1 {

	private JFrame frame;
	private JTextField tfnhap;
	private JTextField tflenght;
	private JTextField tfthuong;
	private JTextField tfupercase;
	private JTextField tfresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					baistring1 window = new baistring1();
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
	public baistring1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 11, 414, 239);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblNhpChui = new JLabel("NH\u1EACP CHU\u1ED6I");
		lblNhpChui.setBounds(29, 60, 85, 14);
		panel.add(lblNhpChui);
		
		tfnhap = new JTextField();
		tfnhap.setBounds(131, 57, 237, 20);
		panel.add(tfnhap);
		tfnhap.setColumns(10);
		
		JLabel lblLenght = new JLabel("LENGHT");
		lblLenght.setBounds(29, 98, 56, 14);
		panel.add(lblLenght);
		
		tflenght = new JTextField();
		tflenght.setBounds(131, 95, 115, 20);
		panel.add(tflenght);
		tflenght.setColumns(10);
		
		JButton btnTnhDi = new JButton("T\u00EDnh \u0111\u1ED9 d\u00E0i");
		btnTnhDi.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
			String chuoi=tfnhap.getText();
			
				char kitu;
			int dodai=0;
				for(int i=0;i<chuoi.length();i++) {
					kitu=chuoi.charAt(i);
					if(Character.isSpace(kitu)) {
						dodai++;
					}
					
				}
				tflenght.setText(String.valueOf(chuoi.length()-dodai));
			}
		});
		btnTnhDi.setBounds(256, 95, 112, 20);
		panel.add(btnTnhDi);
		
		JLabel lblLowercape = new JLabel("LOWERCAPE");
		lblLowercape.setBounds(29, 129, 80, 14);
		panel.add(lblLowercape);
		
		tfthuong = new JTextField();
		tfthuong.setBounds(129, 126, 117, 20);
		panel.add(tfthuong);
		tfthuong.setColumns(10);
		
		JButton btnChThng = new JButton("LOWER");
		btnChThng.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoi=tfnhap.getText();
				String chuthuong=chuoi.toLowerCase();
				tfthuong.setText(String.valueOf(chuthuong));
			}
		});
		btnChThng.setBounds(256, 126, 112, 20);
		panel.add(btnChThng);
		
		JLabel lblUppercase = new JLabel("UPPERCASE");
		lblUppercase.setBounds(29, 154, 80, 14);
		panel.add(lblUppercase);
		
		tfupercase = new JTextField();
		tfupercase.setBounds(131, 151, 115, 20);
		panel.add(tfupercase);
		tfupercase.setColumns(10);
		
		JButton btnupper = new JButton("UPPER");
		btnupper.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoi=tfnhap.getText();
				String chuhoa=chuoi.toUpperCase();
				
				tfupercase.setText(String.valueOf(chuhoa));
			}
		});
		btnupper.setBounds(256, 152, 112, 18);
		panel.add(btnupper);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setBounds(29, 183, 66, 14);
		panel.add(lblResult);
		
		tfresult = new JTextField();
		tfresult.setBounds(131, 180, 115, 20);
		panel.add(tfresult);
		tfresult.setColumns(10);
		
		JButton btnNewButton = new JButton("REPLACE");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoi=tfnhap.getText();
				String chuoithaythe=chuoi.replace("d", "f");
				
				tfresult.setText(String.valueOf(chuoithaythe));
			}
		});
		btnNewButton.setBounds(254, 179, 114, 23);
		panel.add(btnNewButton);
		TitledBorder tt= new TitledBorder("STRING");
		panel.setBorder(tt);
	}
}
