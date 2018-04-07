import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.awt.event.ActionEvent;

public class bai2mang {

	private JFrame frame;
	private JTextField tfa;
	private JTextField tfb;
	private JTextField tfkq;
    String a;
    String b;
    String [] arraystringa;
    String [] arraystringb;
    int[] arrayinta;
    int[] arrayintb;
    int lenghta,lenghtb;
    private JTextField tfsapxep;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					bai2mang window = new bai2mang();
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
	public bai2mang() {
		initialize();
	}
    public void tach() {
    	a=tfa.getText();
    	b=tfb.getText();
    	arraystringa=a.split(",");
    	arraystringb=b.split(",");
    	lenghta=arraystringa.length;
    	lenghtb=arraystringb.length;
    	arrayinta = new int[lenghta];
    	arrayintb = new int[lenghtb];
    	for(int i=0;i<lenghta;i++) {
    		arrayinta[i]=Integer.parseInt(arraystringa[i]);
    	}
    	for(int i=0;i<lenghtb;i++) {
    		arrayintb[i]=Integer.parseInt(arraystringb[i]);
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
		panel.setBounds(10, 23, 414, 227);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lbla = new JLabel("M\u1EA3ng A");
		lbla.setBounds(25, 41, 46, 14);
		panel.add(lbla);
		
		JLabel lblb = new JLabel("M\u1EA3ng B");
		lblb.setBounds(25, 66, 46, 14);
		panel.add(lblb);
		
		tfa = new JTextField();
		tfa.setBounds(89, 38, 221, 20);
		panel.add(tfa);
		tfa.setColumns(10);
		
		tfb = new JTextField();
		tfb.setBounds(89, 63, 221, 20);
		panel.add(tfb);
		tfb.setColumns(10);
		
		JButton btnTm = new JButton("T\u00CCM");
		btnTm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tach();
				int c = 0;
				for(int i=0;i<lenghta;i++) {
					for(int j=0;j<lenghtb;j++) {
							if(arrayinta[i]==arrayintb[j]) {
								c=arrayinta[i];
							}
						
					}
				}
				tfkq.setText(String.valueOf(c));
			}
		});
		btnTm.setBounds(106, 193, 89, 23);
		panel.add(btnTm);
		
		JLabel lblkq = new JLabel("K\u1EBFt qu\u1EA3");
		lblkq.setBounds(25, 97, 46, 14);
		panel.add(lblkq);
		
		tfkq = new JTextField();
		tfkq.setBounds(89, 94, 223, 20);
		panel.add(tfkq);
		tfkq.setColumns(10);
		
		JLabel lblSpXpA = new JLabel(" S\u1EAFp x\u1EBFp A");
		lblSpXpA.setBounds(25, 122, 61, 14);
		panel.add(lblSpXpA);
		
		tfsapxep = new JTextField();
		tfsapxep.setBounds(89, 119, 221, 20);
		panel.add(tfsapxep);
		tfsapxep.setColumns(10);
		
		JButton btnSpXp = new JButton("S\u1EAEP X\u00CAP");
		btnSpXp.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				tach();
				int c ;
				for(int i=0;i<lenghta-1;i++) {
					for(int j=i+1;j<lenghta;j++) {
							if(arrayinta[i]>arrayinta[j]) {
								c=arrayinta[i];
								arrayinta[i]=arrayinta[j];
								arrayinta[j]=c;
								
							}
						
					}
				}
				tfsapxep.setText(Arrays.toString(arrayinta));
			}
		});
		btnSpXp.setBounds(246, 193, 89, 23);
		panel.add(btnSpXp);
		
	}
}
