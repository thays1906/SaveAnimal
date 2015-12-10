import java.awt.Font;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;
import java.awt.FlowLayout;
import  javax.swing.ButtonGroup;
import javax.swing.SwingUtilities;

public class Frm_amigos extends JPanel {


	/**
	 * 
	 */
	private static final long serialVersionUID = 2427775509692175315L;
	JFrame frame = new JFrame ("Save Animal");
	JTextField txtcor;
	JTextField txtidade;
	JTextField txtporte;
	JTextField txtnome;
	JTextField txtpeso;
	JTextField txtnumero;
	JTextField txtcep;
	JTextField txtcomport;
	JTextField txtraca;
		public Frm_amigos(){
			
	try {
				
			
			this.setLayout(null);
			JLabel lbltitulo = new JLabel("Cadastro de Amigos",JLabel.CENTER);
			lbltitulo.setBounds(200, 20, 400, 40);
			lbltitulo.setFont(new Font("Serif", Font.BOLD, 24));
			this.add(lbltitulo);
			
			//label nome
			JLabel lblnome = new JLabel("Nome:",JLabel.LEFT);
			lblnome.setBounds(20,130,100,20);
			lblnome.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblnome);
			
			//textbox nome
			txtnome= new JTextField();
			txtnome.setBounds(150, 130, 300, 25);
			txtnome.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtnome);
			
			//label raça
			JLabel lblraca = new JLabel("Raça:", JLabel.LEFT);
			lblraca.setBounds(20, 160, 100, 20);
			lblraca.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblraca);
			
			//textbox raça
			JTextField txtraca = new JTextField();
			txtraca.setBounds(150, 160, 200, 25);
			txtraca.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtraca);
			
			//label idade
			JLabel lblidade = new JLabel("Idade:",JLabel.LEFT);
			lblidade.setBounds(20, 190, 150, 20);
			lblidade.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblidade);
			
			//textbox idade
			JTextField txtidade = new JTextField();
			txtidade.setBounds(150, 190, 88, 25);
			txtidade.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtidade);
			
			//label cor
			JLabel lblfone = new JLabel("Cor:",JLabel.LEFT);
			lblfone.setBounds(20, 220, 100, 20);
			lblfone.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblfone);

			//textbox cor
			JTextField txtcor = new JTextField();
			txtcor.setBounds(150, 220, 150, 25);
			txtcor.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcor);
			
			//lbl porte
			JLabel lblporte = new JLabel("Porte:",JLabel.LEFT);
			lblporte.setBounds(20, 250, 100, 20);
			lblporte.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblporte);
			
			//textbox porte
			txtporte= new JTextField();
			txtporte.setBounds(150, 250, 200, 25);
			txtporte.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtporte);
			
			//labelpeso
			JLabel lblpeso = new JLabel("Peso:",JLabel.LEFT);
			lblpeso.setBounds(20, 280, 100, 20);
			lblpeso.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblpeso);
			
			//textbox peso
			txtpeso = new JTextField();
			txtpeso.setBounds(150, 280, 200, 25);
			txtpeso.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtpeso);
			
			//label castrado
			JLabel lblcastrado = new JLabel("Castrado:",JLabel.LEFT);
			lblcastrado.setBounds(20, 400, 100, 20);
			lblcastrado.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcastrado);
			
			JRadioButton sim = new JRadioButton();
			JRadioButton nao = new JRadioButton();
		
			sim.setBounds(110, 400, 50, 24);
			sim.setText("Sim");
			sim.setFont( new Font("", Font.BOLD, 14));
			nao.setText("Não");
			nao.setFont( new Font("", Font.BOLD, 14));
			nao.setBounds(160, 400, 100, 24);
			this.add(sim);
			this.add(nao);
			
			//label sexo
			JLabel lblsexo = new JLabel("Sexo:",JLabel.LEFT);
			lblsexo.setBounds(20, 350, 200, 23);
			lblsexo.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblsexo);
		
			JRadioButton macho = new JRadioButton();
			JRadioButton femea = new JRadioButton();
			
			macho.setBounds(100, 350, 100, 23);
			macho.setFont( new Font("", Font.BOLD, 14));
			macho.setText("Macho");
			femea.setText("Femêa");
			femea.setFont( new Font("", Font.BOLD, 14));
			femea.setBounds(200, 350, 200, 23);
			this.add(macho);
			this.add(femea);
			
			//label comportamento
			JLabel lblcomport = new JLabel("Comportamento:",JLabel.LEFT);
			lblcomport.setBounds(20, 310, 150, 25);
			lblcomport.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcomport);
			
			//textbox comportamento
			JTextField txtcomport = new JTextField();
			txtcomport.setBounds(165, 310, 185, 25);
			txtcomport.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcomport);
			
			
			
			
			
			
			
		
			

			//btn cadastrar
			JButton btncadastrar = new JButton("Cadastrar Dados");
			btncadastrar.setBounds(30, 600, 200, 30);
			btncadastrar.addActionListener( new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					LimparCampos();
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
				}
			});
			this.add(btncadastrar);
			
			
				//btn limpar
			JButton btnlimpar = new JButton("Limpar");
			btnlimpar.setBounds(290, 600, 200, 30);
			this.add(btnlimpar);
			btnlimpar.addActionListener(new ActionListener() {
		
				@Override
				public void actionPerformed(ActionEvent e) {
					LimparCampos();
				}
			});
			
			//btn voltar
			JButton btnvoltar = new JButton("Voltar");
			btnvoltar.setBounds(550, 600, 200, 30);
			this.add(btnvoltar);
			
			btnvoltar.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);
					
				}
			});
			
			}
	catch(Exception e)
	{
		
	}
}
		public void LimparCampos()
		{
			txtnome.setText("");
			txtidade.setText("");
			txtcor.setText("");
			txtpeso.setText("");
			txtporte.setText("");
			txtraca.setText("");
			txtnumero.setText("");
			txtcep.setText("");
			txtcomport.setText("");
			
		}
	
		
		public  void montarTela (String[] args) {       
	          
	        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
	        frame.setSize(800,800);
	        frame.getContentPane().add (this);  
	        //frame.pack(); diminui a tela   
	        frame.setVisible (true);              
	    }      
}
