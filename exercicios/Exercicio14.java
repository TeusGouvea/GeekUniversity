package exercicios;

public class Exercicio14 {

    static String data_texto(String data){
        String[] partes = data.split("/");
        String mex_txt = "";

        int dia= Integer.parseInt(partes[0]);
        int mes= Integer.parseInt(partes[1]);
        int ano= Integer.parseInt(partes[2]);

        if (mes == 1){
            mex_txt = "Janeiro";
        } else if (mes == 2) {
            mex_txt = "Fevereiro";
        } else if (mes == 3) {
            mex_txt = "Março";
        } else if (mes == 4) {
            mex_txt = "Abril";
        } else if (mes == 5) {
            mex_txt = "Maio";
        } else if (mes == 6) {
            mex_txt = "Junho";
        } else if (mes == 7) {
            mex_txt = "Julho";
        } else if (mes == 8) {
            mex_txt = "Agosto";
        } else if (mes == 9) {
            mex_txt = "Setembro";
        } else if (mes == 10) {
            mex_txt = "Outubro";
        } else if (mes == 11) {
            mex_txt = "Novembro";
        } else if (mes == 12) {
            mex_txt = "Dezembro";
        }


        return dia + " de " + mex_txt + " de " + ano;
    }

    public static void main(String[] args) {

        System.out.println(data_texto("15/03/2025"));
        System.out.println(data_texto("15/08/1995"));


    }

}
