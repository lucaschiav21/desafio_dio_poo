import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso; // Todas as vezes que se instancia uma objeto ou todas as vezes que vai imprimir determinadas (cont, proxima linha)
import br.com.dio.desafio.dominio.Developer;
import br.com.dio.desafio.dominio.Mentoria;// característica de um objeto, no método main, se importa a classe para manipluar os objetos (cont, prox. linha)
                                            // dessa classe.

import java.time.LocalDate;

public class Main {
    public static void main (String [] args){
        Curso curso1 = new Curso(); //instanciando um objeto, onde um curso dentro de uma Classe chamda Curso, onde há vários cursos de ações e atributos parecidos.

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Aqui você aprenderá sobre tudo a linguagem Java, desde o básico, passando por arrays, collections até JPA.");
        curso1.setCargaHoraria(15);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Aprenda Python desde o básico, até lidar com tkinter, panda e entre outras funcionalidades.");
        curso2.setCargaHoraria(12);

        System.out.println(curso2);

        Mentoria mentoria1 = new Mentoria();
        mentoria1.setTitulo("Gerenciamento básico de Gradle & Maven");
        mentoria1.setDescricao("Aprenda a fazer um gerenciamento do seu projeto Java, com Gradle e depois com Maven.");
        mentoria1.setData(LocalDate.now());

        System.out.println(mentoria1);

        Mentoria mentoria2 = new Mentoria(); // criando ou instanciando um objeto mentoria1 da classe Mentoria, onde há mentorias de estrutura (leia-se ações e características) parecidas.
        mentoria2.setTitulo("Segurança de Dados");
        mentoria2.setDescricao("Aprenda como elaborar sistemas de defesa com Python capazes de abater os mais variados tipos de ataques cibernéticos.");
        mentoria2.setData(LocalDate.now()); // o LocalDate.now mostra a data e o horário em tempo real em que se faz determinada operação.

        System.out.println(mentoria2);

        Curso curso3 = new Curso();
        curso3.setTitulo("Curso Django");
        curso3.setDescricao("Aprenda a tecnologia Django e potencialize seus projetos em Python");
        curso3.setCargaHoraria(8);


        Curso curso4 = new Curso();
        curso4.setTitulo("Curso Spring Boot");
        curso4.setDescricao("Aprenda a tecnologia Spring Boot e simplifique projetos Java.");
        curso4.setCargaHoraria(8);

        System.out.println(curso4);

        Curso curso5 = new Curso();
        curso5.setTitulo("Curso Microsserviços com Java");
        curso5.setDescricao("Aprenda a desenvolver e escalonar projetos de microsserviços em Java.");
        curso5.setCargaHoraria(7);

        System.out.println(curso5);

        Bootcamp bootcamp1 = new Bootcamp();
        bootcamp1.setNome("Bootcamp Java Developer");
        bootcamp1.setDescricao("Cursos e mentoria sobre a tecnologia Java e correlatas.");
        bootcamp1.getConteudos().add(curso1);
        bootcamp1.getConteudos().add(curso4);
        bootcamp1.getConteudos().add(curso5);
        bootcamp1.getConteudos().add(mentoria1);


        Bootcamp bootcamp2 = new Bootcamp();
        bootcamp2.setNome("Bootcamp Python Developer");
        bootcamp2.setDescricao("Cursos e mentoria sobre a tecnologia Python e correlatas.");
        bootcamp2.getConteudos().add(curso2);
        bootcamp2.getConteudos().add(curso3);
        bootcamp2.getConteudos().add(mentoria2);


        Developer devLucas = new Developer();
        devLucas.setNome("Lucas");
        devLucas.inscreverBootcamp(bootcamp1);

        System.out.println("Conteúdos Inscritos Lucas : " + devLucas.getConteudosInscritos());
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();
        devLucas.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Lucas : " + devLucas.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Lucas : " + devLucas.getConteudosConcluidos());
        System.out.println("XP : " +devLucas.calcularTotalXp());
        System.out.println("----------");

        Developer devDaniella = new Developer();
        devDaniella.setNome("Daniella");
        devDaniella.inscreverBootcamp(bootcamp2);

        System.out.println("Conteúdos Inscritos Daniella : " + devDaniella.getConteudosInscritos());
        devDaniella.progredir();

        System.out.println("-");
        System.out.println("Conteúdos Inscritos Daniella : " + devDaniella.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Daniella : " + devDaniella.getConteudosConcluidos());
        System.out.println("XP : " +devDaniella.calcularTotalXp());
        System.out.println("----------");

    }
}
