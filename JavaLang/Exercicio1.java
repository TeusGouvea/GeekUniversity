package JavaLang;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.FileOutputStream;
import java.util.Scanner;

public class Exercicio1 {

    static void escrever(){
        Scanner teclado = new Scanner(System.in);
        String msg;

        try{
            PrintStream escrever = new PrintStream(new FileOutputStream("arq.txt", true));

            do {
                System.out.print("Escreva algo ou 0 para sair: ");
                msg = teclado.nextLine();

                if (!msg.contains("0")){
                    escrever.println(msg);
                }
            } while (!msg.contains("0"));
            escrever.close();

        }catch (FileNotFoundException e){
            System.out.println("Não foi possível criar/encontrar o arquivo.");
        }

        teclado.close();
    }

    static void ler(){
        try{
            Scanner ler = new Scanner(new FileInputStream("arq.txt"));

            while (ler.hasNextLine()){
                String linha = ler.nextLine();
                System.out.println(linha);
            }
            ler.close();

        }catch (FileNotFoundException e){
            System.out.println("Arquivo não encontrado.");
        }
    }
    public static void main(String[] args) {
        escrever();

        ler();
    }
}
