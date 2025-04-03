package ClassesAbstratas;

//Template Method
/*
 - O padrão Template Method define o esqueleto de um algoritmo dentro de um metodo, transferindo alguns de seus passos para as subclasses.
 O template Method permite que as subclasses redefinam certos passos de um algoritmo sem alterar a estrutura do próprio algoritmo.

 - Algoritmos são "receitas" passo-a-passo para resolver algum problema.

 receber numero;
 retornar numero * numero;

 metodo_principal(){
    passo1();
    passo2();
    passo3();
}
*/

public class Programa32 {

    public static void main(String[] args) {

        TreinamentoInicioDaTemporada tit = new TreinamentoInicioDaTemporada();

        tit.treinoDiario();

        TreinamentoFimDaTemporada tft = new TreinamentoFimDaTemporada();

        tft.treinoDiario();
    }
}
