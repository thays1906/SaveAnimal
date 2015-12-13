import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.Locale;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.ImageIcon;

public class Inicio {

	
	static Color azul = new Color(0, 191, 255);

	private static JMenuItem submenu_amigos;

	public static void main(String[] args) {
		//KKK
		//ConexaoBanco xx = new ConexaoBanco();
		//Map<String, String> parameters = new HashMap<String, String>();
		
		//parameters.put("jose", "String");
		//parameters.put("1", "Int");
		//xx.ExecuteNowQuery("SELECT  * FROM tSoltc where rCli like  '%?%'  and cSgmto = ? ", parameters);
		ImageIcon imgicon = new ImageIcon("images/casasimbolo.fw.png");
		JFrame form= new JFrame("Save Animal");
		form.setIconImage(imgicon.getImage());

		form.setLayout(null);
		form.setExtendedState(JFrame.MAXIMIZED_BOTH);
		JLabel lblBack = new JLabel(new ImageIcon("images/imgback.fw.png"));
		lblBack.setBounds(50, 50, 100, 100);
		form.add(lblBack);
		JMenuBar bar= new JMenuBar();
		bar.setBackground(azul);
		bar.setBorder(new BevelBorder(BevelBorder.LOWERED));
		JMenu menu1= new JMenu("                 Cadastro              ");
		menu1.setBackground(azul);
		menu1.setForeground(Color.WHITE);
		menu1.setFont(new Font("Sans Serif", Font.BOLD, 21));
		
		JMenuItem submenu_cliente = new JMenuItem("   Cliente              ");
		
		ImageIcon imgcliente= new ImageIcon("images/Login Manager.png");
		
		submenu_cliente.setIcon(imgcliente);
		submenu_cliente.setForeground(Color.WHITE);
	    submenu_cliente.setFont(new Font("" ,Font.BOLD , 17));
	    submenu_cliente.setBackground(azul);
	   
		
			
			
		
		submenu_cliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				   Frm_cliente frmcli = new Frm_cliente();
				   frmcli.montarTela(null);
				   
				   
			}
		});
		
		menu1.add(submenu_cliente);
		
		JMenuItem menu_amigos = new JMenuItem("   Amigos  ");
	    menu_amigos.setForeground(Color.WHITE);
	    menu_amigos.setFont(new Font("" ,Font.BOLD , 17));
	    menu_amigos.setBackground(azul);
	    menu_amigos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frm_amigos aa = new Frm_amigos();
				aa.montarTela(null);
				
			}
		});
		
	    
	    menu1.add(menu_amigos);
		
		bar.add(menu1);
	
		
		
		
	
		
		JMenu menu3 = new JMenu("       Adoção        ");	
		menu3.setFont(new Font("Helvetica", Font.BOLD, 21));
		menu3.setForeground(Color.white);
		bar.add(menu3);
		
		JMenuItem submenu_adotar = new JMenuItem("  Realizar Adoção  ");
		submenu_adotar.setForeground(Color.WHITE);
	    submenu_adotar.setFont(new Font("" ,Font.BOLD , 17));
	    submenu_adotar.setBackground(azul);
	    
	    ImageIcon imggato = new ImageIcon("images/gato adotado.fw.png");
	    submenu_adotar.setIcon(imggato);
		menu3.add(submenu_adotar);
		
		JMenuItem submenu_relatorio = new JMenuItem("  Relatório de Adoções");
		submenu_relatorio.setForeground(Color.WHITE);
		submenu_relatorio.setFont(new Font("" ,Font.BOLD , 17));
		submenu_relatorio.setBackground(azul);
		
		ImageIcon imgrelatorio = new ImageIcon("images/relatorio.fw.png");
		submenu_relatorio.setIcon(imgrelatorio);
		menu3.add(submenu_relatorio);
		
		form.setJMenuBar(bar);
		form.setSize(800, 800);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel imglogo = new JLabel(new ImageIcon("images/casa.fw.png"));
		
		imglogo.setBounds(100, 100, 400, 400);
		
		//form.add(imglogo);
		String[] colunas = new String[]{"Nome","Idade","Sexo"};
		String[][] dados = new String[][]{
			{"Rodrigo","28","Masculino"},
			{"Maria","30","Feminino"}
		};
		
		
		JTable tabela = new JTable(dados,colunas);
		tabela.setVisible(true);
		JScrollPane scroll = new JScrollPane();
		scroll.setViewportView(tabela);
		scroll.setVisible(true);
		scroll.setBounds(20,20,200,200);
		
		tabela.addMouseListener(new MouseListener() {
			
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
				
				
				JOptionPane.showMessageDialog(null,tabela.getValueAt(tabela.getSelectedRow(), 0));
				
				
			}
		});
		
		
		form.add(scroll);
		form.getContentPane().setBackground(Color.decode("#CAE1FF"));
		//form.setEnabled(false);
		
		//form.setEnabled(false);
		Frm_login log = new Frm_login();
		log.montarTela(null,form);
		
	}

}
