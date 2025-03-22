package exercicios;

public class Exercicio18 {

    public static void main(String[] args) {

        Televisao tv = new Televisao();

        tv.liga_desliga();

        tv.aumentar_canal();
        tv.aumentar_canal();

        tv.mudar_canal(42);

        tv.diminuir_canal();

        tv.aumentar_volume();
        tv.aumentar_volume();
        tv.aumentar_volume();

        tv.diminuir_volume();
        tv.diminuir_volume();

        tv.liga_desliga();

    }

}
