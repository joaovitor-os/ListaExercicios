package lista3;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Lista3exer1 {
    public static void main(String[] args) throws IOException {
        Scanner tabtxt = new Scanner(System.in);

        int tab; 
        int ini_tab;
        int fim_tab;

        System.out.println("Informe a Tabuada de qual valor deseja: ");
        tab = tabtxt.nextInt();
        System.out.println("Informe o inicio da tabuada: ");
        ini_tab = tabtxt.nextInt();
        System.out.println("Informe o fim da tabuada: ");
        fim_tab = tabtxt.nextInt();

        FileWriter tabuada = new FileWriter("tabuada.txt");
        PrintWriter gravarArq = new PrintWriter(tabuada);

        gravarArq.printf("---Resultado---%n");
        for (int i = ini_tab; i <= fim_tab; i++) {
            System.out.println(" " + tab + " x " + i + " = " + tab * i);

            gravarArq.printf(" %2d X %d = %2d %n", tab, i, (tab * i));
        }
        gravarArq.close();

        tabtxt.close();
    }
}