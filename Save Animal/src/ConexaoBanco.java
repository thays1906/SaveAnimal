import java.awt.List;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Map;

import javax.swing.JOptionPane;

public class ConexaoBanco {
	
	static Connection conn;
	static PreparedStatement stm;
	String url = "jdbc:sqlserver://localhost:1433;databaseName=SaveAnimal;user=sa;password=qweasd";

	public void AbrirConexao(){
		try
		{
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			conn = DriverManager.getConnection(url);
			
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e.getMessage());
		}

	}
	public ConexaoBanco(){
		 AbrirConexao();
	}
	
	public boolean ExecuteNowQuery(String query, Map<String, String> parameters){
		try{
			stm = conn.prepareStatement(query);
			if(parameters != null)
			{
				int i = 0;
				for(Map.Entry<String, String> x : parameters.entrySet()){
					
					JOptionPane.showMessageDialog(null, x.getValue());
					i = i+1;
				}
			}
			
			 ResultSet retorno =  stm.executeQuery();
			 
			 while (retorno.next())
			 {
				 JOptionPane.showMessageDialog(null, retorno.getString("nSoltc"));
			 }
			return true;
		}
		catch(Exception e){
			JOptionPane.showMessageDialog(null,e.getMessage());
			return false;
		}
	}
	
	public ResultSet ResultSet(String query)
	{
		 try{
	 		 ResultSet retorno =  stm.executeQuery(query);
	  
	 		return retorno;
		 	}
		 	catch(Exception e){
		 		JOptionPane.showMessageDialog(null, e.getMessage());
		 		return null;
		 	}
	}
	
	
	

}
