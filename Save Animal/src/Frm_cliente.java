import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.MaskFormatter;

public class Frm_cliente extends JPanel {

	/**
	 * 
	 */
	// private static final long serialVersionUID = 2427775509692175315L;
	JFrame frame = new JFrame("Save Animal");
	JFormattedTextField txtcpf;
	JFormattedTextField txtdata;
	JFormattedTextField txtfone;
	JTextField txtemail;
	JTextField txtnome;
	JTextField txtPesquisanome;

	JTextField txtendereco;
	JTextField txtnumero;
	JFormattedTextField txtcep; // JTextField txtcep;
	JTextField txtbairro;
	JTextField txtcidade;
	JComboBox comboestado;
	JPanel cadastrar = new JPanel();
	JPanel pesquisar = new JPanel();
	JTable tableCLiente;
	JTextField codigoCliente;

	JButton btnExcluirPesquisa;
	JButton btnEditarPesquisa;
	
	DefaultTableModel aMOdel;
	
	public Frm_cliente() {

		try {

			this.setLayout(null);
			codigoCliente = new JTextField();
			MostrarPesquisar();
			// MostrarCadastrar();
		} catch (Exception e) {

		}
	}

	public void PesquisarCliente() {

		try {

			String query = "SELECT TOP 10 Codigo,NomeCliente,Cpf FROM Cliente WHERE NomeCliente LIKE ?";

			ArrayList<Object> objetos = new ArrayList<>();

			objetos.add("%" + txtPesquisanome.getText() + "%");

			btnExcluirPesquisa.setEnabled(false);
			btnEditarPesquisa.setEnabled(false);
			
			ConexaoBanco banco = new ConexaoBanco();
			tableCLiente = new JTable();
			tableCLiente.setBounds(300, 300, 800, 300);
			ResultSet retorno;
			retorno = banco.ExecuteScalar(query, objetos);
			ResultSetMetaData metaData = retorno.getMetaData();

			String[] colunaName = { "Codigo", "NomeCliente", "Cpf" };
			aMOdel = null;
			aMOdel= new DefaultTableModel(null, colunaName);
			aMOdel.setColumnIdentifiers(colunaName);
			int x = 1;
			int numberColuna = metaData.getColumnCount();

			while (retorno.next()) {
				Object[] objetosColunas = new Object[numberColuna];

				for (int i = 0; i < numberColuna; i++) {
					objetosColunas[i] = retorno.getObject(i + 1);
				}
				aMOdel.addRow(objetosColunas);
				// String name = retorno.getString("NomeCliente");

			}
			tableCLiente.repaint();
			tableCLiente.setModel(aMOdel);
			tableCLiente.getColumnModel().getColumn(0).setPreferredWidth(100);
			tableCLiente.getColumnModel().getColumn(1).setPreferredWidth(300);
			tableCLiente.getColumnModel().getColumn(2).setPreferredWidth(200);
			
			
			// JTable tabela = new JTable(dados,colunas);
			tableCLiente.setVisible(true);
			JScrollPane scroll = new JScrollPane();
			scroll.setViewportView(tableCLiente);
			scroll.setVisible(true);
			scroll.setBounds(50, 250, 600, 200);

			tableCLiente.addMouseListener(new MouseListener() {

				@Override
				public void mouseReleased(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mousePressed(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseExited(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseEntered(MouseEvent e) {
					// TODO Auto-generated method stub

				}

				@Override
				public void mouseClicked(MouseEvent e) {
					// tableCLiente.setColumnSelectionAllowed(true);
					tableCLiente.setRowSelectionAllowed(true);
					String codigo = tableCLiente.getModel().getValueAt(tableCLiente.getSelectedRow(), 0).toString();
					codigoCliente = new JTextField();
					codigoCliente.setText(codigo);
					btnExcluirPesquisa.setEnabled(true);
					btnEditarPesquisa.setEnabled(true);
					// TODO Auto-generated method stub

				}
			});
			pesquisar.add(scroll);
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public void MostrarPesquisar() {
		cadastrar.setVisible(false);
		pesquisar.setVisible(true);
		JLabel lbltitulo = new JLabel("Pesquisa de Clientes", JLabel.CENTER);
		lbltitulo.setBounds(200, 20, 400, 40);
		lbltitulo.setFont(new Font("Serif", Font.BOLD, 24));
		// this.add(lbltitulo);
		pesquisar.setLayout(null);
		pesquisar.setBounds(0, 0, 800, 800);
		pesquisar.add(lbltitulo);

		// label cliente
		JLabel lblnome = new JLabel("Cliente:", JLabel.LEFT);
		lblnome.setBounds(20, 130, 100, 20);
		lblnome.setFont(new Font("Sans Serif", Font.BOLD, 17));
		// this.add(lblnome);
		pesquisar.add(lblnome);

		// textbox cliente
		txtPesquisanome = new JTextField();
		txtPesquisanome.setBounds(150, 130, 300, 23);
		txtPesquisanome.setFont(new Font("Sans Serif", Font.PLAIN, 17));
		// this.add(txtnome);
		pesquisar.add(txtPesquisanome);

		JButton btnPesqui = new JButton("Pesquisar");
		btnPesqui.setBounds(50, 600, 100, 80);
		btnPesqui.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				PesquisarCliente();

			}
		});

		pesquisar.add(btnPesqui);
		JButton btnCadas = new JButton("Cadastrar");
		btnCadas.setBounds(180, 600, 100, 80);
		btnCadas.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				pesquisar.setVisible(false);
				codigoCliente.setText("");
				MostrarCadastrar();

			}
		});
		pesquisar.add(btnCadas);

		btnExcluirPesquisa = new JButton("Excluir");
		btnExcluirPesquisa.setBounds(300, 600, 100, 80);
		btnExcluirPesquisa.setEnabled(false);
		btnExcluirPesquisa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				if (JOptionPane.showConfirmDialog(null, "Deseja excluir este Cliente?") == JOptionPane.YES_OPTION) {
					String queryDelete = "DELETE Cliente WHERE Codigo = ?";
					ConexaoBanco banco = new ConexaoBanco();
					ArrayList<Object> obj = new ArrayList<>();
					obj.add(codigoCliente.getText());

					if (banco.ExecuteNowQuery(queryDelete, obj)) {
						
						
						
						int rows = aMOdel.getRowCount();
						while (rows > 0) {
							aMOdel.removeRow(0);
						       rows = aMOdel.getRowCount(); // this is very important
						}
						
						JOptionPane.showMessageDialog(null, "Cliente Excluído"); // pesquisar.setVisible(false);
						txtPesquisanome.setText("");
						tableCLiente = null;
						PesquisarCliente();
					} else {
						JOptionPane.showMessageDialog(null, "Erro ao excluir"); // pesquisar.setVisible(fa
					}
				}

				// MostrarCadastrar();

			}
		});
		pesquisar.add(btnExcluirPesquisa); 
		
		btnEditarPesquisa = new JButton("Editar");
		btnEditarPesquisa.setBounds(450, 600, 100, 80);
		btnEditarPesquisa.setEnabled(false);
		btnEditarPesquisa.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
					EditarCliente();
			}
		});
		pesquisar.add(btnEditarPesquisa);
		
		this.add(pesquisar);

	}

	public void EditarCliente()
	{
		try
		
		{
			
		pesquisar.setVisible(false);
		//cadastrar.setVisible(true);
		MostrarCadastrar();
		ResultSet ret;
		String query = "SELECT NomeCliente,Cpf,convert(varchar,DataNasc, 103) as DataNasc,Telefone,Email,Endereco,Num,CEP,Bairro,Cidade,Estado FROM Cliente Where Codigo = ? ";
		ArrayList<Object> objetos = new ArrayList<>();
		
		ConexaoBanco banco = new ConexaoBanco();
		String cod = codigoCliente.getText();
		
		objetos.add(cod);
		ret = banco.ExecuteScalar(query, objetos);
		while(ret.next()){
			txtnome.setText(ret.getString("NomeCliente"));
			txtcpf.setText(ret.getString("Cpf"));
			txtdata.setValue(ret.getString("DataNasc"));
			txtfone.setValue(ret.getString("Telefone"));
			txtemail.setText(ret.getString("Email"));
			txtendereco.setText(ret.getString("Endereco"));
			txtnumero.setText(ret.getString("Num"));
			txtcep.setValue(ret.getString("CEP"));
			txtbairro.setText(ret.getString("Bairro"));
			txtcidade.setText(ret.getString("Cidade"));
			comboestado.setSelectedItem(ret.getString("Estado"));
		   //Estado
			
			
			
			
		}
		}
		catch(Exception e){
			
		}
		
		this.add(cadastrar);
	}
	public void MostrarCadastrar() {
		try {

			pesquisar.setVisible(false);
			JLabel lbltitulo = new JLabel("Cadastro de Cliente", JLabel.CENTER);
			lbltitulo.setBounds(200, 20, 400, 40);
			lbltitulo.setFont(new Font("Serif", Font.BOLD, 24));
			// this.add(lbltitulo);
			cadastrar.setLayout(null);
			cadastrar.setBounds(0, 0, 800, 800);
			cadastrar.add(lbltitulo);

			// label cliente
			JLabel lblnome = new JLabel("Cliente:", JLabel.LEFT);
			lblnome.setBounds(20, 130, 100, 20);
			lblnome.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblnome);
			cadastrar.add(lblnome);

			// textbox cliente
			txtnome = new JTextField();
			txtnome.setBounds(150, 130, 300, 23);
			txtnome.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtnome);
			cadastrar.add(txtnome);

			// label cpf
			JLabel lblcpf = new JLabel("CPF:", JLabel.LEFT);
			lblcpf.setBounds(20, 160, 100, 20);
			lblcpf.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblcpf);
			cadastrar.add(lblcpf);

			// textbox cpf
			MaskFormatter MascaraCpf = new MaskFormatter(" ###.###.###-##");
			txtcpf = new JFormattedTextField(MascaraCpf);
			txtcpf.setBounds(150, 160, 200, 23);
			txtcpf.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtcpf);
			cadastrar.add(txtcpf);

			// label data de nasc.
			JLabel lbldatanasc = new JLabel("Data de nasc.:", JLabel.LEFT);
			lbldatanasc.setBounds(20, 190, 150, 20);
			lbldatanasc.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lbldatanasc);
			cadastrar.add(lbldatanasc);

			// textbox data de nasc.
			MaskFormatter MascaraData = new MaskFormatter("##/##/####");
			MascaraData.setPlaceholderCharacter('_');
			txtdata = new JFormattedTextField(MascaraData);
			txtdata.setBounds(150, 190, 88, 25);
			txtdata.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtdata);
			cadastrar.add(txtdata);

			// label fone
			JLabel lblfone = new JLabel("Telefone:", JLabel.LEFT);
			lblfone.setBounds(20, 220, 100, 20);
			lblfone.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblfone);
			cadastrar.add(lblfone);

			// textbox fone
			MaskFormatter MascaraFone = new MaskFormatter(" (##) #####-####");
			MascaraFone.setPlaceholderCharacter('_');
			txtfone = new JFormattedTextField(MascaraFone);
			txtfone.setBounds(150, 220, 150, 25);
			txtfone.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtfone);
			cadastrar.add(txtfone);

			// lbl email
			JLabel lblemail = new JLabel("Email:", JLabel.LEFT);
			lblemail.setBounds(20, 250, 100, 20);
			lblemail.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblemail);
			cadastrar.add(lblemail);

			// textbox email
			txtemail = new JTextField();
			txtemail.setBounds(150, 250, 200, 23);
			txtemail.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtemail);
			cadastrar.add(txtemail);

			// label endereço
			JLabel lblendereco = new JLabel("Endereço:", JLabel.LEFT);
			lblendereco.setBounds(20, 280, 100, 20);
			lblendereco.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblendereco);
			cadastrar.add(lblendereco);

			// textbox endereço
			txtendereco = new JTextField();
			txtendereco.setBounds(150, 280, 200, 23);
			txtendereco.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtendereco);
			cadastrar.add(txtendereco);

			// label numero
			JLabel lblnumero = new JLabel("Nº", JLabel.LEFT);
			lblnumero.setBounds(500, 280, 100, 20);
			lblnumero.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblnumero);
			cadastrar.add(lblnumero);

			// textbox numero
			txtnumero = new JTextField();
			txtnumero.setBounds(520, 280, 42, 24);
			txtnumero.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtnumero);
			cadastrar.add(txtnumero);

			// label cep
			JLabel lblcep = new JLabel("CEP:", JLabel.LEFT);
			lblcep.setBounds(20, 310, 100, 20);
			lblcep.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblcep);
			cadastrar.add(lblcep);

			// textbox cep
			MaskFormatter MascaraCep = new MaskFormatter(" #####-###");
			MascaraCep.setPlaceholderCharacter('_');
			txtcep = new JFormattedTextField(MascaraCep);
			txtcep.setBounds(150, 310, 90, 25);
			txtcep.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtcep);
			cadastrar.add(txtcep);

			// label bairro
			JLabel lblbairro = new JLabel("Bairro:", JLabel.LEFT);
			lblbairro.setBounds(20, 340, 100, 20);
			lblbairro.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblbairro);
			cadastrar.add(lblbairro);

			// textbox bairro
			txtbairro = new JTextField();
			txtbairro.setBounds(150, 340, 200, 23);
			txtbairro.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtbairro);
			cadastrar.add(txtbairro);

			// label cidade
			JLabel lblcidade = new JLabel("Cidade:", JLabel.LEFT);
			lblcidade.setBounds(20, 370, 100, 20);
			lblcidade.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblcidade);
			cadastrar.add(lblcidade);

			// txt cidade
			txtcidade = new JTextField();
			txtcidade.setBounds(150, 370, 200, 23);
			txtcidade.setFont(new Font("Sans Serif", Font.PLAIN, 17));
			// this.add(txtcidade);
			cadastrar.add(txtcidade);

			// label estado
			JLabel lblestado = new JLabel("Estado:", JLabel.LEFT);
			lblestado.setBounds(500, 370, 100, 20);
			lblestado.setFont(new Font("Sans Serif", Font.BOLD, 17));
			// this.add(lblestado);
			cadastrar.add(lblestado);

			String[] estados = { " ", "Acre", "Alagoas", "Amapá", "Amazonas", "Bahia", "Ceará", "Distrito Federal",
					"Espírito Santo", "Goiás", "Maranhão", "Mato Grosso", "Mato Grosso do Sul", "Minas Gerais", "Pará",
					"Paraíba", "Paraná", "Pernambuco", "Piauí", "Rio de Janeiro", "Rio Grande do Norte",
					"Rio Grande do Sul", "Rondônia", "Roraima", "Santa Catarina", "São Paulo", "Sergipe", "Tocantins" };
			// textbox estado
			comboestado = new JComboBox(estados);
			comboestado.setBounds(570, 370, 150, 23);
			// this.add(comboestado);
			cadastrar.add(comboestado);

			// btn cadastrar
			JButton btncadastrar = new JButton("Cadastrar Dados");
			btncadastrar.setBounds(30, 600, 200, 30);
			btncadastrar.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE, 16));
			btncadastrar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					// LimparCampos();
					CadastrarSql();
					JOptionPane.showMessageDialog(null, "Cadastrado com sucesso!");
					MostrarPesquisar();
				}
			});
			// this.add(btncadastrar);
			cadastrar.add(btncadastrar);

			// btn limpar
			JButton btnlimpar = new JButton("Limpar");
			btnlimpar.setBounds(290, 600, 200, 30);
			btnlimpar.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE, 16));
			// this.add(btnlimpar);
			cadastrar.add(btnlimpar);
			btnlimpar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					LimparCampos();
				}
			});

			// btn voltar
			JButton btnvoltar = new JButton("Voltar");
			btnvoltar.setFont(new Font("Sans Serif", Font.ROMAN_BASELINE, 16));
			btnvoltar.setBounds(550, 600, 200, 30);
			// this.add(btnvoltar);
			cadastrar.add(btnvoltar);

			btnvoltar.addActionListener(new ActionListener() {

				@Override
				public void actionPerformed(ActionEvent e) {
					frame.setVisible(false);

				}
			});

			cadastrar.setVisible(true);
			this.add(cadastrar);

		} catch (Exception e) {

		}
	}

	public boolean CadastrarSql() {
		// String query = "INSERT INTO
		// Cliente(NomeCliente,Cpf,DataNasc,Telefone,Email,Endereco,Num,CEP,Bairro,Cidade,Estado)"
		// +
		// "VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		
		String query = "";
		if (codigoCliente.getText() == "" || codigoCliente.equals(""))
		{
		query = "INSERT INTO Cliente(NomeCliente,Cpf,DataNasc,Telefone,Email,Endereco,Num,CEP,Bairro,Cidade,Estado)VALUES(?,?,?,?,?,?,?,?,?,?,?)";
		}
		else
		{
			query = "UPDATE  Cliente "
					+ "SET NomeCliente = ?, "
					+ "    Cpf         = ?, "
					+ "    DataNasc    = ?, "
					+ "    Telefone    = ?, "
					+ "    Email       = ?, "
					+ "    Endereco    = ?, "
					+ "    Num         = ?, "
					+ "    CEP         = ?, "
					+ "    Bairro      = ?, "
					+ "    Cidade      = ?, "
					+ "    Estado      = ?  "
					+ "Where Codigo = ? ";
		}
		

		ArrayList<Object> objetos = new ArrayList<>();

		objetos.add(txtnome.getText());
		objetos.add(txtcpf.getText());

		SimpleDateFormat formatDate = new SimpleDateFormat("dd/MM/yyyy");
		String data = "";
		data = txtdata.getValue().toString();
		java.util.Date invoiceDate = null;
		try {
			invoiceDate = formatDate.parse(data);
			String test = formatDate.format(invoiceDate);
			invoiceDate = formatDate.parse(test);

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		java.sql.Date sqlDate = new Date(invoiceDate.getTime());

		objetos.add(sqlDate);
		objetos.add(txtfone.getText());
		objetos.add(txtemail.getText());
		objetos.add(txtendereco.getText());
		objetos.add(txtnumero.getText());
		objetos.add(txtcep.getValue());
		objetos.add(txtbairro.getText());
		objetos.add(txtcidade.getText());
		objetos.add(comboestado.getSelectedItem());

		if(codigoCliente.getText()!= "")
		{
			objetos.add(codigoCliente.getText());
			codigoCliente.setText("");
		}
		ConexaoBanco banco = new ConexaoBanco();
		banco.ExecuteNowQuery(query, objetos);

		return true;

	}

	public void LimparCampos() {
		txtnome.setText("");
		txtdata.setText("");
		txtfone.setText("");
		txtemail.setText("");
		txtendereco.setText("");
		txtcpf.setText("");
		txtnumero.setText("");
		txtcep.setText("");
		txtcidade.setText("");
		txtbairro.setText("");
		comboestado.setSelectedIndex(0);
	}

	public void montarTela(String[] args) {

		frame.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		frame.setSize(800, 800);
		frame.getContentPane().add(this);
		// frame.pack(); diminui a tela
		frame.setVisible(true);
	}
}
