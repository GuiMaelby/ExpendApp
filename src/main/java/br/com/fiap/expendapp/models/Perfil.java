package br.com.fiap.expendapp.models;

public class Perfil {

    private String nome;

    public Perfil(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "Perfil [nome=" + nome + "]";
    }

}
