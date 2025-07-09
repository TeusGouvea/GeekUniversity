package RecursosAvancados;

//Revisão
/*
- Classes anônimas
- Lambda Expressions
- Method References
*/

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Programa75 {

    public static void main(String[] args) {
        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritos e Lógicade Programação", 200));
        cursos.add(new Curso("Programação em Java", 0));
        cursos.add(new Curso("Batismo em Java", 170));
        cursos.add(new Curso("Java 10x", 120));

//      cursos.sort(Comparator.comparing(c -> c.getAlunos())); //Lambda
        cursos.sort(Comparator.comparing(Curso::getAlunos)); //Method References

//      cursos.forEach(c -> System.out.println(c.getNome())); //Lambda
        cursos.forEach(System.out::println); //Method References
    }
}
