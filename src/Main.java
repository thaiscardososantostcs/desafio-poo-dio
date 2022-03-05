import br.com.dio.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(16);

        Conteudo conteudo = new Curso();

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descricao mentoria java");
        mentoria.setData(LocalDate.now());


       /* System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(mentoria);*/

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devThais = new Dev();
        devThais.setNome("Thais");
        devThais.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devThais.getConteudosInscritos());

        devThais.progredir();
        devThais.progredir();
        devThais.progredir();
        System.out.println("Conteúdos Inscritos" + devThais.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devThais.getConteudosConcluidos());
        System.out.println("XP: " + devThais.calcularTotalXp());

        System.out.println("***************");

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());

        devCamila.progredir();
        devCamila.progredir();
        System.out.println("Conteúdos Inscritos" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos" + devCamila.getConteudosConcluidos());
        System.out.println("XP: " + devCamila.calcularTotalXp());

    }
}
