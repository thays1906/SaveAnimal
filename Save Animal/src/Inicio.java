import java.awt.Color;
import java.awt.Font;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.text.AttributeSet.ColorAttribute;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JColorChooser;


public class Inicio {

	static Color azul = new Color(221, 183, 248);
	private static JMenuItem submenu_amigos;

	public static void main(String[] args) {
		
		//ConexaoBanco xx = new ConexaoBanco();
		//Map<String, String> parameters = new HashMap<String, String>();
		
		//parameters.put("jose", "String");
		//parameters.put("1", "Int");
		//xx.ExecuteNowQuery("SELECT  * FROM tSoltc where rCli like  '%?%'  and cSgmto = ? ", parameters);
		
		JFrame form= new JFrame("Save Animal");
		
		form.setLayout(null);
		
		JMenuBar bar= new JMenuBar();
		bar.setBackground(azul);
		
		JMenu menu1= new JMenu("                 Cadastro              ");
		menu1.setBackground(azul);
		menu1.setForeground(Color.WHITE);
		menu1.setFont(new Font("Sans Serif", Font.BOLD, 16));
		JMenuItem submenu_cliente = new JMenuItem("                  Cliente               ");
		
		ImageIcon imgcliente= new ImageIcon("images/Login Manager.png");
		
		
		submenu_cliente.setIcon(imgcliente);
		submenu_cliente.setForeground(Color.WHITE);
	    submenu_cliente.setFont(new Font("" ,Font.BOLD , 14));
	    submenu_cliente.setBackground(azul);
		submenu_cliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				   Frm_cliente frmcli = new Frm_cliente();
				   frmcli.montarTela(null);
				   
				   
			}
		});
		
		menu1.add(submenu_cliente);
		
		JMenuItem menu_amigos = new JMenuItem("                  Amigos               ");
	    menu_amigos.setForeground(Color.WHITE);
	    menu_amigos.setFont(new Font("" ,Font.BOLD , 14));
	    menu_amigos.setBackground(azul);
	    menu_amigos.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Frm_amigos frma = new Frm_amigos();
				frma.montarTela(null);
				
			}
		});
		
	    
	    menu1.add(menu_amigos);
		
		bar.add(menu1);
	
		
		
		
		JMenu menu2 = new JMenu("       Doação        ");
		menu2.setFont(new Font("Helvetica", Font.BOLD, 16));
		menu2.setForeground(Color.WHITE);
		bar.add(menu2);
		
		JMenu menu3 = new JMenu("       Adoção        ");	
		menu3.setFont(new Font("Helvetica", Font.BOLD, 16));
		menu3.setForeground(Color.WHITE);
		bar.add(menu3);
		
		form.setJMenuBar(bar);
		form.setSize(800, 800);
		form.setVisible(true);
		form.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel imglogo = new JLabel(new ImageIcon("images/casa.fw.png"));
		
		imglogo.setBounds(100, 100, 400, 400);
		
		form.add(imglogo);
		//form.setEnabled(false);
		
		//form.setEnabled(false);
		//Frm_login log = new Frm_login();
		//log.montarTela(null,form);
		
	}

}
