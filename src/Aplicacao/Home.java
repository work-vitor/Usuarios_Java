package Aplicacao;

import java.util.Date;
import java.util.Scanner;

import Dao.UsuarioDAO;
import Model.Usuario;

public class Home {

	static Scanner in = new Scanner(System.in);

	static UsuarioDAO usuarioDAO = new UsuarioDAO();
	static Usuario DadosUsuario = new Usuario();

	public static void input() {

		System.out.print("Nome:");
		DadosUsuario.setNome(in.next());
		clearBuffer(in);

		System.out.print("Sobrenome:");
		DadosUsuario.setSobrenome(in.nextLine());
		

		System.out.print("Idade:");
		DadosUsuario.setIdade(in.nextInt());

		// Setando as datas de criacao
		DadosUsuario.setDataDCriacao(new Date());
		DadosUsuario.setUltimaAtualizacao(new Date());

	}

	// Metodo para limpar o buffer
	public static void clearBuffer(Scanner scanner) {
		if (scanner.hasNextLine()) {
			scanner.nextLine();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		input();

		usuarioDAO.Create(DadosUsuario);
		;

	}

}
