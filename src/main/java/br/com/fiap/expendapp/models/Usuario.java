package br.com.fiap.expendapp.models;

import java.time.LocalDate;

public class Usuario {

	private String nome;
	private String email;
	private String senha;
	private LocalDate dataNascimento;

	public Usuario(String nome, String email, String senha, LocalDate dataNascimento) {
		this.nome = nome;
		this.email = email;
		this.senha = senha;
		this.dataNascimento = dataNascimento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public LocalDate getDatanascimento() {
		return dataNascimento;
	}

	public void setDatanascimento(LocalDate datanascimento) {
		this.dataNascimento = datanascimento;
	}

	@Override
	public String toString() {
		return "Usuario [nome=" + nome + ", email=" + email + ", senha=" + senha + ", datanascimento=" + dataNascimento
				+ "]";
	}

}
