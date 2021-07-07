package Dao;

import java.sql.Connection;
import java.sql.Date;

import com.mysql.cj.jdbc.JdbcPreparedStatement;

import Factory.ConectionFactory;
import Model.Usuario;

public class UsuarioDAO {

	// Create
	public void Create(Usuario usuario) {

		String sql = "INSERT INTO Usuarios(Nome, Sobrenome, Idade, DatadCriacao, UltimaAtualizacao) VALUES (?, ?, ?, ?, ?)";

		Connection conn = null;
		JdbcPreparedStatement pstm = null;

		try {

			// Cria a conexao com o BD
			conn = ConectionFactory.ConnectionToMySQL();

			// PreparedStatement para executar a query
			pstm = (JdbcPreparedStatement) conn.prepareStatement(sql);

			// Adicionando os valores que serão inseridos no BD
			pstm.setString(1, usuario.getNome());
			pstm.setString(2, usuario.getSobrenome());
			pstm.setInt(3, usuario.getIdade());
			pstm.setDate(4, new Date(usuario.getDataDCriacao().getTime()));
			pstm.setDate(5, new Date(usuario.getUltimaAtualizacao().getTime()));
			

			// Executa a query
			pstm.execute();
			System.out.println("Usuario cadastrado com sucesso!");

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// Fechar conexão
			try {

				if (pstm != null && conn != null) {
					pstm.close();
					conn.close();
				}

			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}

	}

}
