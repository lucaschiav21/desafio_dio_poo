package br.com.dio.desafio.dominio;

public class Curso extends Conteudo{
    private int cargaHoraria; //aqui está sendo realizado o encapsulamento dos atributos da classe, o encapsulamento faz com que se tenha acesso à esses atrbutos somente pelos getters e setters.


    public int getCargaHoraria() {
        return cargaHoraria;
    }
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }
    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }

}