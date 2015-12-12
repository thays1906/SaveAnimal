
import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.TableModel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;


public class Adoção extends JFrame{
	JFrame adocao = new JFrame("Adoção");
	public Adoção(){ 
	 setSize(400, 400);
     setDefaultCloseOperation(EXIT_ON_CLOSE);
     setLocationRelativeTo(null);
     getContentPane().setLayout(null);

     setVisible(true);
 }
	public  void montarTela (String[] args) {       
        
       adocao.setDefaultCloseOperation (JFrame.HIDE_ON_CLOSE);
        adocao.setSize(800,800);
        adocao.getContentPane().add (this);  
        //frame.pack(); diminui a tela   
        adocao.setVisible (true);              
    }      
}