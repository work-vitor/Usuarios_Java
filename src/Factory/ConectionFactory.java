package Factory;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectionFactory {
	
	//Nome do usuario mysql
	private static final String USERNAME = "root";
	//Senha do banco 
	private static final String PASSWORD = "123456";
	//Link do banco
	private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/agenda?useTimezone=true&serverTimezone=UTC";
	private static final String driver = "com.mysql.cj.jdbc.Driver";
	
	//Metodo que cria a conexão
	public static Connection ConnectionToMySQL() throws Exception{
		
		Class.forName(driver);
		
		Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
		
		return connection;
	}
	
	public static void main(String[] args) throws Exception {
		
		//Recuperar a conexão
		Connection con = ConnectionToMySQL();
		
		//Testar a conexão
		try {
			
			if (con != null) {
				System.out.println("Conectado com sucesso");
				con.close();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}
	
}
