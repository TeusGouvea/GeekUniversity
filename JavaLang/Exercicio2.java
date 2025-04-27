package JavaLang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercicio2 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String arquivo;
        int conta_linhas = 0;

        System.out.print("Informe o nome do arquivo para abrir: ");
        arquivo = teclado.nextLine();

        try{
            Scanner ler = new Scanner(new FileInputStream(arquivo));

            while (ler.hasNextLine()){
                conta_linhas = conta_linhas + 1;
                ler.nextLine();
            }
            ler.close();
            System.out.println("O arquivo possui " + conta_linhas + " linhas.");

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }
        teclado.close();
    }
}
