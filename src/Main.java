import br.com.br.desafio.dominio.Course;
import br.com.br.desafio.dominio.Mentorship;

public class Main {

    public static void main(String[] args) {

        Course course = new Course();
        Mentorship mentoria = new Mentorship();

        course.setTitle("Java Orientado a Objeto");
        course.setDescription("Descrição do Curso");
        course.setCargaHoraria(50);

        System.out.println(course.toString());

        System.out.println(mentoria.toString());


    }

}
