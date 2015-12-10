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
	JTextField txtemail;
	JTextField txtnome;
	JTextField txtendereco;
	JTextField txtnumero;
	JTextField txtcep;
	JTextField txtbairro;
	JTextField txtcidade;
	JTextField txtestado;
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
			txtnome.setBounds(150, 130, 300, 23);
			txtnome.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtnome);
			
			//label raça
			JLabel lblcpf = new JLabel("Raça:", JLabel.LEFT);
			lblcpf.setBounds(20, 160, 100, 20);
			lblcpf.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcpf);
			
			//textbox raça
			JTextField txtraca = new JTextField();
			txtraca.setBounds(150, 160, 200, 23);
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
			JLabel lblfone = new JLabel("Cor",JLabel.LEFT);
			lblfone.setBounds(20, 220, 100, 20);
			lblfone.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblfone);

			//textbox fone
			JTextField txtcor = new JTextField();
			txtcor.setBounds(150, 220, 150, 25);
			txtcor.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcor);
			
			//lbl email
			JLabel lblemail = new JLabel("Porte",JLabel.LEFT);
			lblemail.setBounds(20, 250, 100, 20);
			lblemail.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblemail);
			
			//textbox email
			txtemail= new JTextField();
			txtemail.setBounds(150, 250, 200, 23);
			txtemail.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtemail);
			
			//label endereço
			JLabel lblendereco = new JLabel("Peso:",JLabel.LEFT);
			lblendereco.setBounds(20, 280, 100, 20);
			lblendereco.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblendereco);
			
			//textbox endereço
			txtendereco = new JTextField();
			txtendereco.setBounds(150, 280, 200, 23);
			txtendereco.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtendereco);
			
			//label numero
			JLabel lblnumero = new JLabel("Castrado ?",JLabel.LEFT);
			lblnumero.setBounds(500, 280, 100, 20);
			lblnumero.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblnumero);
			
			//textbox numero
			JRadioButton sim = new JRadioButton();
			JRadioButton nao = new JRadioButton();
			//txtnumero = new JTextField();
			//txtnumero.setBounds(520, 280, 42, 24);
			//txtnumero.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		//	this.add(txtnumero);
			sim.setBounds(600, 280, 50, 24);
		//	sim.setVisible(true);
			sim.setText("Sim");
			sim.setFont( new Font("", Font.BOLD, 14));
			nao.setText("Não");
			nao.setFont( new Font("", Font.BOLD, 14));
			nao.setBounds(650, 280, 100, 24);
			this.add(sim);
			this.add(nao);
			//label cep
			JLabel lblcep = new JLabel("Sexo:",JLabel.LEFT);
			lblcep.setBounds(20, 310, 100, 20);
			lblcep.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcep);
		
			//textbox cep
			//txtcep.setBounds(150, 310, 90, 25);
			//txtcep.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			//this.add(txtcep);
			JRadioButton macho = new JRadioButton();
			JRadioButton femea = new JRadioButton();
			macho.setBounds(150, 310, 90, 25);
			macho.setFont( new Font("", Font.BOLD, 14));
			macho.setText("Macho");
			femea.setText("Femêa");
			femea.setFont( new Font("", Font.BOLD, 14));
			femea.setBounds(250, 310, 90, 25);
			this.add(macho);
			this.add(femea);
			
			//label bairro
			JLabel lblbairro = new JLabel("Comportamento:",JLabel.LEFT);
			lblbairro.setBounds(20, 340, 100, 20);
			lblbairro.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblbairro);
			
			//textbox bairro
			JTextField txtcomport = new JTextField();
			txtcomport.setBounds(150, 340, 200, 23);
			txtcomport.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcomport);
			
			//label cidade
			JLabel lblcidade = new JLabel("Cidade:",JLabel.LEFT);
			lblcidade.setBounds(20, 370, 100, 20);
			lblcidade.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcidade);
			
			//txt cidade
			JTextField txtcidade = new JTextField();
			txtcidade.setBounds(150, 370, 200, 23);
			txtcidade.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcidade);
			
			//label estado
			JLabel lblestado = new JLabel("Estado:",JLabel.LEFT);
			lblestado.setBounds(500, 370, 100, 20);
			lblestado.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblestado);
			
			
			String[] estados = { " ","Acre","Alagoas","Amapá","Amazonas","Bahia","Ceará","Distrito Federal","Espírito Santo","Goiás","Maranhão","Mato Grosso","Mato Grosso do Sul","Minas Gerais","Pará","Paraíba","Paraná","Pernambuco","Piauí","Rio de Janeiro","Rio Grande do Norte","Rio Grande do Sul","Rondônia","Roraima","Santa Catarina","São Paulo","Sergipe","Tocantins"}; 
			//textbox estado
			JComboBox comboestado = new JComboBox(estados);
			comboestado.setBounds(570, 370, 150, 23);
			this.add(comboestado);
		
			

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
			txtemail.setText("");
			txtendereco.setText("");
			txtraca.setText("");
			txtnumero.setText("");
			txtcep.setText("");
			txtcidade.setText("");
			txtbairro.setText("");
			txtestado.setText("");
		}
	
		
		public  void montarTela (String[] args) {       
	          
	        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
	        frame.setSize(800,800);
	        frame.getContentPane().add (this);  
	        //frame.pack(); diminui a tela   
	        frame.setVisible (true);              
	    }      
}
