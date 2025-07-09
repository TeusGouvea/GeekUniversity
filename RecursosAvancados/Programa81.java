package RecursosAvancados;

//Stream + Thread (paralelismo)
/*
Util, quando estamos trabalhando com milhões/bilhões de dados.

Não é recomendado para quantidade pequena de dados.
*/

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Programa81 {

    public static void main(String[] args) {

        List<Curso> cursos = new ArrayList<Curso>();

        cursos.add(new Curso("Programação para Leigos", 170));
        cursos.add(new Curso("Algoritos e Lógicade Programação", 200));
        cursos.add(new Curso("Programação em Java", 0));
        cursos.add(new Curso("Batismo em Java", 170));
        cursos.add(new Curso("Java 10x", 120));

        cursos.parallelStream()
                .filter(c -> c.getAlunos() >= 100)
                .collect(Collectors.toMap(
                        c -> c.getNome(),
                        c -> c.getAlunos()))
                .forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
    }
}
