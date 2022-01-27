import br.com.br.desafio.dominio.Bootcamp;
import br.com.br.desafio.dominio.Course;
import br.com.br.desafio.dominio.Developer;
import br.com.br.desafio.dominio.Mentorship;
import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Course course1 = new Course();
        course1.setTitle("Introdução a Java");
        course1.setDescription("Descrição do Curso Introdução a Java");
        course1.setCargaHoraria(10);

        Course course2 = new Course();
        course2.setTitle("Java Orientado a Objeto");
        course2.setDescription("Descrição do Curso Java Orientado a Objeto");
        course2.setCargaHoraria(40);

        Mentorship mentoria = new Mentorship();
        mentoria.setTitle("Mentoria Java POO");
        mentoria.setDescription("Descrição da mentoria Java POO");
        mentoria.setData(LocalDate.now());

//      System.out.println(course.toString());
//        System.out.println(mentoria.toString());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Java POO Especialist");
        bootcamp.setDescription("Bootcampo que vai turbinar sua carreira em Java e POO");
        bootcamp.getContents().add(course1);
        bootcamp.getContents().add(course2);
        bootcamp.getContents().add(mentoria);

        Developer devJeff = new Developer();
        devJeff.setNome("Jeferson Gomes");
        devJeff.subscribeBootcamp(bootcamp);
        System.out.println("Conteudos inscritos " + devJeff.getSubscribedContent());
        devJeff.progress();
        System.out.println("Conteudos concluidos " + devJeff.getCompletedContent());

    }
}
