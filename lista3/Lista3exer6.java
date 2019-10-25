import java.util.Scanner;

public class Lista3exer6{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double PI = 3.1416;

        System.out.println("Escreva o valor da circunferência");
        double circ = scan.nextDouble();
        double raio = circ / (2*PI);
        System.out.println("o Valor do raio é: " +raio);
        double area  = PI*(raio *raio);
        System.out.print("O valor da area é " + area);  
        scan.close();
    }
}