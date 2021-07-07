package Model;

import java.util.Date;

public class Usuario {

	private int id;

	private String Nome;

	private String Sobrenome;

	private int Idade;

	private Date DataDCriacao;

	private Date UltimaAtualizacao;

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

	public Date getDataDCriacao() {
		return DataDCriacao;
	}

	public void setDataDCriacao(Date dataDCriacao) {
		DataDCriacao = dataDCriacao;
	}

	public Date getUltimaAtualizacao() {
		return UltimaAtualizacao;
	}

	public void setUltimaAtualizacao(Date ultimaAtualizacao) {
		UltimaAtualizacao = ultimaAtualizacao;
	}

}
