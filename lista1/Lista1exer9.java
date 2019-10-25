import java.util.Scanner;

public class Lista1exer9{
    public static void main(String[] args) {
        Scanner dobro = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1=dobro.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2=dobro.nextInt();

        if(numero1>numero2*numero2){
            System.out.println("O numero " + numero1 + " é maior que o dobro de outro valor");
        }
        else{
            System.out.println("O numero " + numero1 + " é menor que o dobro de outro valor");
        }
        dobro.close();
    }
}