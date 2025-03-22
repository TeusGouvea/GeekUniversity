package exercicios;

public class Exercicio17 {

    public static void main(String[] args) {

        Agenda  agenda = new Agenda();

        Contato contato1 = new Contato();
        contato1.setNome("Felicity Jones");
        contato1.setEmail("felicity@gmail.com");
        contato1.setTelefone("555-6789");

        System.out.println();

        Contato contato2 = new Contato();
        contato2.setNome("Angelina Jolie");
        contato2.setEmail("angellina@gmail.com");
        contato2.setTelefone("555-4325");

        System.out.println();

        Contato contato3 = new Contato();
        contato3.setNome("Ray Sychev");
        contato3.setEmail("ray@gmail.com");
        contato3.setTelefone("555-7699");

        System.out.println();

        //void armazenarContato
        agenda.armazenarContato(contato1);
        agenda.armazenarContato(contato2);
        agenda.armazenarContato(contato3);

        //void imprimeAgenda
        agenda.imprimeAgenda();

        //void imprimeContato
        agenda.imprimeContato(2);

        //int buscaContato
        System.out.println(agenda.buscaContato("Angelina Jolie"));

        //void removeContato
        agenda.removeContato(contato3);

        //void imprimeAgenda
        agenda.imprimeAgenda();
    }

}
