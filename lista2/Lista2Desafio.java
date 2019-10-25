import java.util.Scanner;

public class Lista2Desafio{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o valor a ser calculado");
        int valor = scanner.nextInt();

        int nota = 0;
        int valorNota = 0;
        int qtdNotas = 0;
        String mensagem = "";

        while (valor != 0){
            if (nota == 0){
                valorNota = 100;
            } else if (nota == 1) {
                valorNota = 50;
            } else if (nota == 2) {
                valorNota = 10;
            } else if (nota == 3) {
                valorNota = 5;
            } else {
                valorNota = 1;
            }

            qtdNotas = valor / valorNota;

            if (qtdNotas != 0){
                if(mensagem.length() > 0) {
                    mensagem += " e ";
                }
                mensagem += qtdNotas + " nota(s) de R$ " + valorNota;
                valor = valor % valorNota;
            }
            nota++;
        }

        System.out.println(mensagem);
        scanner.close();
    }
}