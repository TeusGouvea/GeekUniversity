package RecursosAvancados;

import java.util.ArrayList;
import java.util.List;

//Streams
/*
Streams são fluxos de dados/objetos utilizados para que possamos trabalhar com esses dados de forma mais criteriosa.

- Quando trabalhamos com streams, os métodos aplicados a este stream não afeta a coleção original.
*/
public class Programa76 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritos e Lógicade Programação", 200));
        cursos.add(new Curso("Programação em Java", 0));
        cursos.add(new Curso("Batismo em Java", 170));
        cursos.add(new Curso("Java 10x", 120));

        //Como fazer para imprimir somente os cursos com mais de 100 alunos?
//        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(c -> System.out.println(c.getNome()));
        cursos.stream().filter(c -> c.getAlunos() >= 100).forEach(System.out::println);


    }
}
