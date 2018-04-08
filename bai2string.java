import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class bai2string {

	private JFrame frame;
	private JTextField tfnhapchuoi;
	private JTextField tf1;
	private JTextField tf2;
	private JTextField tfresult;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2string window = new bai2string();
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
	public bai2string() {
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
		
		JLabel lblNhpChui = new JLabel("Nh\u1EADp chu\u1ED7i");
		lblNhpChui.setBounds(25, 46, 71, 14);
		panel.add(lblNhpChui);
		
		tfnhapchuoi = new JTextField();
		tfnhapchuoi.setBounds(124, 43, 209, 20);
		panel.add(tfnhapchuoi);
		tfnhapchuoi.setColumns(10);
		
		JLabel lblChuiCon = new JLabel("Chu\u1ED7i con 1");
		lblChuiCon.setBounds(25, 81, 71, 14);
		panel.add(lblChuiCon);
		
		tf1 = new JTextField();
		tf1.setBounds(124, 74, 86, 20);
		panel.add(tf1);
		tf1.setColumns(10);
		
		JLabel lblChuiCon_1 = new JLabel("Chu\u1ED7i con 2 ");
		lblChuiCon_1.setBounds(25, 116, 71, 14);
		panel.add(lblChuiCon_1);
		
		tf2 = new JTextField();
		tf2.setBounds(124, 113, 86, 20);
		panel.add(tf2);
		tf2.setColumns(10);
		
		tfresult = new JTextField();
		tfresult.setBounds(124, 154, 209, 20);
		panel.add(tfresult);
		tfresult.setColumns(10);
		
		JLabel lblResult = new JLabel("RESULT");
		lblResult.setBounds(29, 157, 46, 14);
		panel.add(lblResult);
		
		JButton btnReplace = new JButton("REPLACE");
		btnReplace.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String chuoibandau =tfnhapchuoi.getText();
				String chuoi1=tf1.getText();
				int dodaichuoi1=chuoi1.length();
				String chuoi11=chuoi1.substring(0,1).toUpperCase()+chuoi1.substring(1,dodaichuoi1);
				String chuoi2=tf2.getText();
				int dodaichuoi2=chuoi1.length();
				String chuoi22=chuoi2.substring(0,1).toUpperCase()+chuoi2.substring(1,dodaichuoi2);
				String chuoisaukhithaythe=chuoibandau.replaceAll(chuoi11, chuoi22);
				tfresult.setText(String.valueOf(chuoisaukhithaythe));
			}
		});
		btnReplace.setBounds(150, 205, 89, 23);
		panel.add(btnReplace);
	}
}
