import br.com.br.desafio.dominio.Curso;
import br.com.br.desafio.dominio.Mentoria;

public class Main {

    public static void main(String[] args) {

        Curso curso = new Curso();
        Mentoria mentoria = new Mentoria();

        curso.setTitulo("Java Orientado a Objeto");
        curso.setDescricao("Descrição do Curso");
        curso.setCargaHoraria(50);

        System.out.println(curso.toString());

        System.out.println(mentoria.toString());


    }

}
