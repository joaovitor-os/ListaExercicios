import java.util.Scanner;

public class lista1exer4{
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);

        System.out.println("Digite um numero: ");
        int numero1=imput.nextInt();
        System.out.println("Digite outro numero: ");
        int numero2=imput.nextInt();

            if(numero1>numero2*numero2){
                System.out.println("O numero " + numero1 + " é maior que o dobro do outro valor");
            }
            else{
                System.out.println("O numero " + numero1 + " é menor que o dobro do outro valor");
            }
        imput.close();
    }
}