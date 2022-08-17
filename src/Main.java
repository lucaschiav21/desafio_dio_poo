import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main (String [] args){
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Intensivão de Java, Teoria & Prática.");
        curso1.setCargaHoraria(10);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Intensivão de Python, Teoria & Prática, com bônus de Cybersegurança.");
        curso2.setCargaHoraria(12);

        System.out.println(curso2);
    }
}
