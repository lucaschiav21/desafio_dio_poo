import br.com.dio.desafio.dominio.Curso; // Todas as vezes que se instancia uma objeto ou todas as vezes que vai imprimir determinadas (cont, proxima linha)
import br.com.dio.desafio.dominio.Mentoria;// característica de um objeto, no método main, se importa a classe para manipluar os objetos (cont, prox. linha)
                                            // dessa classe.

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
        Curso curso1 = new Curso(); //instanciando um objeto, onde um curso dentro de uma Classe chamda Curso, onde há vários cursos de ações e atributos parecidos.

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Intensivão de Java, Teoria & Prática.");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Intensivão de Python, Teoria & Prática, com bônus de Cybersegurança.");
        curso2.setCargaHoraria(12);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria(); // criando ou instanciando um objeto mentoria1 da classe Mentoria, onde há mentorias de estrutura (leia-se ações e características) parecidas.
        mentoria1.setTitulo("Segurança de Dados");
        mentoria1.setDescricao("Aprenda como elaborar sistemas de defesa com Python capazes de abater os mais variados tipos de ataques cibernéticos.");
        mentoria1.setData(LocalDate.now()); // o LocalDate.now mostra a data e o horário em tempo real em que se faz determinada operação.

        System.out.println(mentoria1);
    }
}

