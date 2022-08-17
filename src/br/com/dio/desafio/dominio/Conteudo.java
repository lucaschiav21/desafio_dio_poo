package br.com.dio.desafio.dominio;

public abstract class Conteudo { // abstract faz com que a classe não possa instanciar um novo objeto.
     protected static final double XP_PADRAO = 10d;

     private String Titulo;
     private String Descricao;

     public abstract double calcularXp();

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getDescricao() {
        return Descricao;
    }

    public void setDescricao(String descricao) {
        Descricao = descricao;
    }
}