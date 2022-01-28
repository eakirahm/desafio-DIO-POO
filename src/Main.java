import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);

        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria java");
        mentoria.setDescricao("descrição mentoria de java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devEduardo = new Dev();
        devEduardo.setNome("Eduardo");
        devEduardo.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Eduardo: " + devEduardo.getConteudosInscritos());

        devEduardo.progredir();
        devEduardo.progredir();

        System.out.println("Conteúdos inscritos Eduardo: " + devEduardo.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Eduardo: " + devEduardo.getConteudosConcluidos());
        System.out.println("XP: " + devEduardo.calcularTotalXp());

        System.out.println("----------------------------");

        Dev devCarol = new Dev();
        devCarol.setNome("Carol");
        devCarol.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos inscritos Carol: " + devCarol.getConteudosInscritos());

        devCarol.progredir();
        devCarol.progredir();
        devCarol.progredir();

        System.out.println("Conteúdos inscritos Carol: " + devCarol.getConteudosInscritos());
        System.out.println("Conteúdos concluídos Carol: " + devCarol.getConteudosConcluidos());
        System.out.println("XP: " + devCarol.calcularTotalXp());

    }
}
