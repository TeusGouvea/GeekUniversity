package RecursosAvancados;

//Streams

import java.util.ArrayList;
import java.util.List;

public class Programa78 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritos e Lógicade Programação", 200));
        cursos.add(new Curso("Programação em Java", 0));
        cursos.add(new Curso("Batismo em Java", 170));
        cursos.add(new Curso("Java 10x", 120));

        int soma = cursos.stream()
                .filter(c -> c.getAlunos() >= 100)
                .mapToInt(Curso::getAlunos)
                .sum();
        System.out.println("A soma de todos os cursos com mais de 100 alunos é: " + soma);
    }
}
