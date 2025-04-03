package HerancaePolimorfismo;

//Herança


public class Programa28 {

    public static void main(String[] args) {

//     //   Pessoa p1 = new Pessoa("Matheus Gouvêa", 1995, "eu@mail.com");
//
//        System.out.println(p1);
//        System.out.println(p1.getNome());
        System.out.println();

        Aluno a1 = new Aluno("Diana de Paula", 2022,"didi@mail.com", "123456");

        System.out.println(a1);
        System.out.println(a1.getNome());
        System.out.println();

        Professor prof1 = new Professor("Pedro da Silva", 1976, "profe@mail.com", "ABC987");

        System.out.println(prof1);
        System.out.println(prof1.getNome());
        System.out.println();

    }

}
