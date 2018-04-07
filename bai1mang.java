import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.JPanel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.awt.event.ActionEvent;

public class bai1mang {

	private JFrame frame;
	private JTextField tfnhap;
	private JTextField tfmin;
	private String s;
	private int [] mangso;
	private int lenght;
	private  String[] mangchuoi;
	private JTextField tfsum;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai1mang window = new bai1mang();
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
	public bai1mang() {
		initialize();
	}
  public void tachchuoi() {
     s=tfnhap.getText();
     mangchuoi=s.split(",");
     lenght=mangchuoi.length;
     mangso = new int[lenght];
     for(int i=0;i<lenght;i++) {
    	 mangso[i]=Integer.parseInt(mangchuoi[i]);
    	 
     }
	
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
		panel.setBounds(29, 32, 369, 193);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
	
		JLabel lblNhpMng = new JLabel("NH\u1EACP M\u1EA2NG");
		lblNhpMng.setBounds(24, 40, 81, 14);
		panel.add(lblNhpMng);
		
		tfnhap = new JTextField();
		tfnhap.setBounds(115, 37, 203, 20);
		panel.add(tfnhap);
		tfnhap.setColumns(10);
		
		JLabel lblMin = new JLabel("MIN");
		lblMin.setBounds(34, 71, 46, 14);
		panel.add(lblMin);
		
		tfmin = new JTextField();
		tfmin.setBounds(115, 68, 203, 20);
		panel.add(tfmin);
		tfmin.setColumns(10);
		
		JButton btnmin = new JButton("S\u1ED1 nh\u1ECF nh\u1EA5t");
		btnmin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tachchuoi();
				int min=mangso[0];
				for(int i=0;i<lenght;i++) {
						if(mangso[i]<min) {
							min=mangso[i];
							
						}
					}
				tfmin.setText(String.valueOf(min));
				}
		
		});
		btnmin.setBounds(44, 144, 123, 23);
		panel.add(btnmin);
		
		JButton btntinh = new JButton("T\u00CDNH T\u1ED4NG");
		btntinh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			tachchuoi();
			int sum=0;
			for(int i=0;i<lenght;i++) {
				sum+=mangso[i];
			}
				tfsum.setText(String.valueOf(sum));
			}
		});
		btntinh.setBounds(188, 144, 130, 23);
		panel.add(btntinh);
		
		JLabel lblSum = new JLabel("SUM");
		lblSum.setBounds(24, 102, 46, 14);
		panel.add(lblSum);
		
		tfsum = new JTextField();
		tfsum.setBounds(115, 99, 203, 20);
		panel.add(tfsum);
		tfsum.setColumns(10);
		TitledBorder tt=new TitledBorder(" ARRAY ");
		panel.setBorder(tt);
	    
	}
}
