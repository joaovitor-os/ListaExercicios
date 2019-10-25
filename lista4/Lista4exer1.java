import java.util.Scanner;

public class Lista4exer1{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informa a quantidade de notas");
        int quantidade = scanner.nextInt();

        double[] notas = new double[quantidade];

        for (int i = 0; i < quantidade; i++){
            System.out.println("informe a "+ (i + 1) +" nota");
            notas[i] = scanner.nextDouble();
        }
        double media = notas[i] / quantidade;
        scanner.close();
    }
}