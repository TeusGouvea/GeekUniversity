package Collections;

import java.util.ArrayList;
import java.util.Collections;

public class Programa46 {

    public static void main(String[] args) {
        ArrayList<Integer> numeros = new ArrayList<Integer>();

        numeros.add(42);
        numeros.add(100);
        numeros.add(1);
        numeros.add(55);
        numeros.add(87);
        numeros.add(5);

//        System.out.println(numeros.get(0));

        Collections.sort(numeros);

        for (int i = 0; i < numeros.size(); i++){
            System.out.println(numeros.get(i));
        }
    }
}
