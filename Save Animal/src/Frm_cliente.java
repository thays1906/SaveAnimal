import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class Frm_cliente extends JPanel {

	JFrame frame = new JFrame ("Save Animal");
	JFormattedTextField txtcpf;
	JFormattedTextField txtdata;
	JFormattedTextField txtfone;
	JTextField txtemail;
	JTextField txtnome;
	JTextField txtendereco;
	JTextField txtnumero;
	
		public Frm_cliente(){
			
	try {
				
			
			this.setLayout(null);
			JLabel lbltitulo = new JLabel("Cadastro de Cliente",JLabel.CENTER);
			lbltitulo.setBounds(200, 20, 400, 40);
			lbltitulo.setFont(new Font("Serif", Font.BOLD, 24));
			this.add(lbltitulo);
			
			//label cliente
			JLabel lblnome = new JLabel("Cliente:",JLabel.LEFT);
			lblnome.setBounds(20,130,100,20);
			lblnome.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblnome);
			
			//textbox cliente
			txtnome= new JTextField();
			txtnome.setBounds(150, 130, 300, 23);
			txtnome.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtnome);
			
			//label cpf
			JLabel lblcpf = new JLabel("CPF:", JLabel.LEFT);
			lblcpf.setBounds(20, 160, 100, 20);
			lblcpf.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcpf);
			
			//textbox cpf
			MaskFormatter MascaraCpf = new MaskFormatter(" ###.###.###-##");
			txtcpf= new JFormattedTextField(MascaraCpf);
			txtcpf.setBounds(150, 160, 200, 23);
			txtcpf.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcpf);
			
			//label data de nasc.
			JLabel lbldatanasc = new JLabel("Data de nasc.:",JLabel.LEFT);
			lbldatanasc.setBounds(20, 190, 150, 20);
			lbldatanasc.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lbldatanasc);
			
			//textbox data de nasc.
			MaskFormatter MascaraData = new MaskFormatter("##/##/####");
			MascaraData.setPlaceholderCharacter('_');
			txtdata = new JFormattedTextField(MascaraData);
			txtdata.setBounds(150, 190, 88, 25);
			txtdata.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtdata);
			
			//label fone
			JLabel lblfone = new JLabel("Telefone:",JLabel.LEFT);
			lblfone.setBounds(20, 220, 100, 20);
			lblfone.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblfone);

			//textbox fone
			MaskFormatter MascaraFone  = new MaskFormatter(" (##) #####-####");
			MascaraFone.setPlaceholderCharacter('_');
			txtfone = new JFormattedTextField(MascaraFone);
			txtfone.setBounds(150, 220, 150, 25);
			txtfone.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtfone);
			
			//lbl email
			JLabel lblemail = new JLabel("Email:",JLabel.LEFT);
			lblemail.setBounds(20, 250, 100, 20);
			lblemail.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblemail);
			
			//textbox email
			txtemail= new JTextField();
			txtemail.setBounds(150, 250, 200, 23);
			txtemail.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtemail);
			
			//label endereço
			JLabel lblendereco = new JLabel("Endereço:",JLabel.LEFT);
			lblendereco.setBounds(20, 280, 100, 20);
			lblendereco.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblendereco);
			
			//textbox endereço
			txtendereco = new JTextField();
			txtendereco.setBounds(150, 280, 200, 23);
			txtendereco.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtendereco);
			
			//label numero
			JLabel lblnumero = new JLabel("Nº",JLabel.LEFT);
			lblnumero.setBounds(500, 280, 100, 20);
			lblnumero.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblnumero);
			
			//textbox numero
			txtnumero = new JTextField();
			txtnumero.setBounds(520, 280, 42, 24);
			txtnumero.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtnumero);
			
			//label cep
			JLabel lblcep = new JLabel("CEP:",JLabel.LEFT);
			lblcep.setBounds(20, 310, 100, 20);
			lblcep.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblcep);
			
			//textbox cep
			MaskFormatter MascaraCep = new MaskFormatter(" #####-###");
			MascaraCep.setPlaceholderCharacter('_');
			JFormattedTextField txtcep = new JFormattedTextField(MascaraCep);
			txtcep.setBounds(150, 310, 90, 25);
			txtcep.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtcep);
			
			//label bairro
			JLabel lblbairro = new JLabel("Bairro:",JLabel.LEFT);
			lblbairro.setBounds(20, 340, 100, 20);
			lblbairro.setFont(new Font("Sans Serif", Font.BOLD, 17));
			this.add(lblbairro);
			
			//textbox bairro
			JTextField txtbairro = new JTextField();
			txtbairro.setBounds(150, 340, 200, 23);
			txtbairro.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			this.add(txtbairro);
			
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
			
			String[] petStrings = { "Bird", "Cat", "Dog", "Rabbit", "Pig" };
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
			txtdata.setText("");
			txtfone.setText("");
			txtemail.setText("");
			txtendereco.setText("");
			txtcpf.setText("");
			txtnumero.setText("");
		}
		public  void montarTela (String[] args) {       
	          
	        frame.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
	        frame.setSize(800,800);
	        frame.getContentPane().add (this);  
	        //frame.pack(); diminui a tela   
	        frame.setVisible (true);              
	    }      
}
