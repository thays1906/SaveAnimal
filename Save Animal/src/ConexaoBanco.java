import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ConexaoBanco {

	static Connection conn;
	static PreparedStatement stm;
	String url = "jdbc:sqlserver://localhost:1433;databaseName=SaveAnimal; user=sa;password=qweasd";

	public void AbrirConexao() {
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);

		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
		}

	}

	public ConexaoBanco() {
		AbrirConexao();
	}

	public ResultSet ExecuteScalar(String query, ArrayList<Object> objetos){
		try{
			ResultSet result;
			
			stm = conn.prepareStatement(query);
			if(objetos != null)
			{
				for(int x = 0; x< objetos.size(); x++)
				{
					stm.setObject(x+1,objetos.get(x));	
				}
			}
			result =  stm.executeQuery();
			return result;
			
		}catch(Exception e){
		return null;
		}
	}

	public boolean ExecuteNowQuery(String query, ArrayList<Object> objetos) {
		try {
			stm = conn.prepareStatement(query);
			if (objetos != null) {
				for (int x = 0; x < objetos.size(); x++) {
					stm.setObject(x + 1, objetos.get(x));
				}
			}
			stm.executeQuery();
			return true;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, e.getMessage());
			return false;
		}
	}
}
