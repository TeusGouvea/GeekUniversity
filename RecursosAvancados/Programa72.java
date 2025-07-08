package RecursosAvancados;

import java.util.ArrayList;
import java.util.List;

//Lambda
public class Programa72 {

    public static void main(String[] args) {

        List<String> palavras = new ArrayList<String>();

        palavras.add("Matheus");
        palavras.add("Geek");
        palavras.add("Auto Arremate");
        palavras.add("Arremaq");
        palavras.add("Java");
        palavras.add("Fiasco");

        //Forma 1
//        palavras.sort((s1,s2) -> {
//            if (s1.length() < s2.length()){
//                return -1;
//            }
//            if (s1.length() > s2.length()){
//                return 1;
//            }
//            return 0;
//        });

        //Forma 2
        palavras.sort((s1, s2) -> Integer.compare(s1.length(),s2.length()));

        palavras.forEach(s -> System.out.println(s));

    }
}
