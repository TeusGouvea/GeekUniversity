package RecursosAvancados;

import java.util.ArrayList;
import java.util.List;

public class Programa79 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritos e Lógicade Programação", 200));
        cursos.add(new Curso("Programação em Java", 0));
        cursos.add(new Curso("Batismo em Java", 170));
        cursos.add(new Curso("Java 10x", 120));

        cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
//                .findAny() //Pega qualquer um de acordo com o filtro
                .findFirst()
                .ifPresent(System.out::println);
    }
}
