import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.crypto.CipherInputStream;
import javax.swing.ImageIcon;
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
	
	
	
	JFrame frame = new JFrame("Save Animal");
	ImageIcon imgicon = new ImageIcon("images/casasimbolo.fw.png");
	ImageIcon imglogin = new ImageIcon("images/usuarionovo.fw.png");
	
	JTextField txtusuario;
	JTextField txtsenha;
	JFrame _jframePai;

	public Frm_login() {

		try {
			
			this.setLayout(null);
			
			frame.setIconImage(imgicon.getImage());
			Image img1 = imglogin.getImage();
			Image newimg = img1.getScaledInstance(100, 100, java.awt.Image.SCALE_SMOOTH);
			JLabel lblimg = new JLabel(new ImageIcon(newimg));
			lblimg.setBounds(160, 60, 100, 100);
			this.add(lblimg);
			JLabel lbltitulo = new JLabel("Login", JLabel.CENTER);
			lbltitulo.setBounds(10, 10, 400, 40);
			lbltitulo.setFont(new Font("Serif", Font.BOLD, 26));
			this.add(lbltitulo);

			// label usuario
			JLabel lblusuario = new JLabel("Usuário:", JLabel.LEFT);
			lblusuario.setBounds(60, 180, 150, 20);
			lblusuario.setFont(new Font("Sans Serif", Font.BOLD, 20));
			this.add(lblusuario);

			// textbox usuario
			txtusuario = new JTextField();
			txtusuario.setBounds(150, 180, 150, 25);
			txtusuario.setFont(new Font("Sans Serif", Font.PLAIN, 18));
			this.add(txtusuario);

			// label senha
			JLabel lblsenha = new JLabel("Senha:", JLabel.LEFT);
			lblsenha.setBounds(60, 210, 100, 20);
			lblsenha.setFont(new Font("Sans Serif", Font.BOLD, 20));
			this.add(lblsenha);

			// textbox senha
			JPasswordField txtsenha = new JPasswordField(11);
			// txtsenha= new JTextField();
			txtsenha.setBounds(150, 210, 150, 25);
			txtsenha.setFont(new Font("Sans Serif", Font.PLAIN, 18));
			this.add(txtsenha);

			// btn login
			JButton btnlogin = new JButton("Fazer Login");
			btnlogin.setBounds(110, 300, 180, 50);
			btnlogin.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE, 16));
			btnlogin.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent arg0) {

					FazerLogin(txtusuario.getText(), txtsenha.getText());
				}
			});
			this.add(btnlogin);
		} catch (Exception e) {

		}

	}

	public void FazerLogin(String nome, String senha) {
		try {

			String query = "SELECT * FROM Usuario WHere usuar = ? and senha= ?";
			ConexaoBanco banco = new ConexaoBanco();
			ResultSet resul;

			ArrayList<Object> objetos = new ArrayList<>();

			objetos.add(nome);
			objetos.add(senha);
			resul = banco.ExecuteScalar(query, objetos);
			if (!resul.next()) {
				JOptionPane.showMessageDialog(null, "Usuário o senha inválida");
			}
			else
			{
				JOptionPane.showMessageDialog(null, "Bem Vindo");
				frame.setVisible(false);
				_jframePai.setEnabled(true);
				
			}
		} catch (Exception e) {
		}

	}

	public void montarTela(String[] args,JFrame jframePai) {

		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		_jframePai = jframePai;

		frame.addWindowListener(new WindowListener() {
			
			@Override
			public void windowOpened(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowIconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeiconified(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowDeactivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosing(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
			
			@Override
			public void windowClosed(WindowEvent e) {
				// TODO Auto-generated method stub
				_jframePai.setVisible(false);
				
			}
			
			@Override
			public void windowActivated(WindowEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		frame.setSize(400, 400);
		frame.getContentPane().add(this).setBackground(Color.decode("#CAE1FF"));
		//frame.getContentPane().
		// frame.pack(); diminui a tela
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
	}
}
