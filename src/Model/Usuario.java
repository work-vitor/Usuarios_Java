package Model;

import java.time.LocalDateTime;

public class Usuario {

	private int id;

	private String Nome;

	private String Sobrenome;

	private int Idade;

	private LocalDateTime DataDCriacao;

	private LocalDateTime UltimaAtualizacao;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	public int getIdade() {
		return Idade;
	}

	public void setIdade(int idade) {
		Idade = idade;
	}

	public LocalDateTime getDataDCriacao() {
		return DataDCriacao;
	}

	public void setDataDCriacao(LocalDateTime dataDCriacao) {
		DataDCriacao = dataDCriacao;
	}

	public LocalDateTime getUltimaAtualizacao() {
		return UltimaAtualizacao;
	}

	public void setUltimaAtualizacao(LocalDateTime ultimaAtualizacao) {
		UltimaAtualizacao = ultimaAtualizacao;
	}

}
