package HerancaePolimorfismo;

public class Exercicio2 {
    public static void main(String[] args) {

        Moto m = new Moto("Szuzki", "Intruder", "Preto");

        m.trocarMarcha(3);
        m.imprimir();
        m.trocarMarcha(-1);
    }
}
