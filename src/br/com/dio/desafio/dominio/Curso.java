package br.com.dio.desafio.dominio;

public class Curso {
    private String titulo;// aqui está sendo realizado o encapsulamento dos atributos da classe.
    private String descricao; // o encapsulamento faz com que se tenha acesso à esses atrbutos somente pelos getters e setters.
    private int cargaHoraria;

    public String getTitulo() { //Ao modificar o acesso neste método de public para private ou protected estariamos também encapsulando esse método.
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + titulo + '\'' +
                ", descricao='" + descricao + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}