package JavaLang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio3 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String arquivo;
        int conta_vogais = 0, conta_consoantes = 0;

        System.out.print("Informe o nome do arquivo para abrir: ");
        arquivo = teclado.nextLine();

        try{
            Scanner ler = new Scanner(new FileInputStream(arquivo));

            while (ler.hasNextLine()){
                String linha = ler.nextLine();
                if (linha.charAt(0) == 'a' || linha.charAt(0) == 'A' || linha.charAt(0) == 'e' || linha.charAt(0) == 'E'
                        || linha.charAt(0) == 'i' || linha.charAt(0) == 'I' || linha.charAt(0) == 'o'
                        || linha.charAt(0) == 'O' || linha.charAt(0) == 'u' || linha.charAt(0) == 'U'){
                    conta_vogais = conta_vogais + 1;
                } else {
                    conta_consoantes = conta_consoantes + 1;
                }
            }
            ler.close();
            System.out.println("O arquivo possui " + conta_vogais + " vogais.");
            System.out.println("O arquivo possui " + conta_consoantes + " consoantes.");

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }
        teclado.close();
    }
}
