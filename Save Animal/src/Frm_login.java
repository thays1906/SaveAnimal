import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;


public class Frm_login extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2427775509692175315L;
	JFrame frame = new JFrame ("Save Animal");

	JTextField txtusuario;
	JTextField txtsenha;
	
		public Frm_login(){
			
	try {
				
			
			this.setLayout(null);
			JLabel lbltitulo = new JLabel("Login",JLabel.CENTER);
			lbltitulo.setBounds(20, 20, 400, 40);
			lbltitulo.setFont(new Font("Serif", Font.BOLD, 24));
			this.add(lbltitulo);
			
			//label usuario
			JLabel lblusuario = new JLabel("Usuário:",JLabel.LEFT);
			lblusuario.setBounds(20,130,150,20);
			lblusuario.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblusuario);
			
			//textbox usuario
			txtusuario= new JTextField();
			txtusuario.setBounds(110, 130, 150, 23);
			txtusuario.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtusuario);
			
			//label senha
			JLabel lblsenha = new JLabel("Senha:", JLabel.LEFT);
			lblsenha.setBounds(20, 160, 100, 20);
			lblsenha.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblsenha);
			
			//textbox senha
			JPasswordField txtsenha = new JPasswordField(11);
			//txtsenha= new JTextField();
			txtsenha.setBounds(110, 160, 150, 23);
			txtsenha.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtsenha);
			
			//btn login
			JButton btnlogin = new JButton("Fazer Login");
			btnlogin.setBounds(100, 250, 180, 28);
			btnlogin.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent arg0) {
					
					String nome = txtusuario.getText();
					if(nome=="Alan"){
						JOptionPane.showMessageDialog(null, "ok");
					}
					else{
						JOptionPane.showMessageDialog(null, "erro");
					}
					
				}
			});
			this.add(btnlogin);
	}
	catch(Exception e)
	{
		
	}
	
		}
		public  void montarTela (String[] args) {       
	          
	        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
	        frame.setSize(400,400);
	        frame.getContentPane().add (this);  
	        //frame.pack(); diminui a tela   
	        frame.setVisible (true); 
	        frame.setLocation(50, 50);
	        frame.setResizable(false);
	    }      
}
