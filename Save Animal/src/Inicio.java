import java.awt.Color;
import java.awt.MenuItem;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;

public class Inicio {

	public static void main(String[] args) {
		JFrame form= new JFrame("Save Animal");
		JMenuBar bar= new JMenuBar();
		
		JMenu menu1= new JMenu("         Cadastro       ");
	
		JMenuItem submenu_cliente = new JMenuItem("       Cliente      ");
		submenu_cliente.setSize(100, 30);
		submenu_cliente.setBackground(Color.lightGray);
		submenu_cliente.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				   Frm_cliente frmcli = new Frm_cliente();
				   frmcli.montarTela(null);
				   
				   
			}
		});
		
		
		menu1.add(submenu_cliente);
		menu1.add(new JMenuItem("       Animais       "));
		bar.add(menu1);
		
		JMenu menu2 = new JMenu("       Doação        ");
		bar.add(menu2);
		
		JMenu menu3 = new JMenu("       Adoção        ");
		bar.add(menu3);
		
		form.setJMenuBar(bar);
		form.setSize(800, 800);
		form.setVisible(true);
		
	}

}
