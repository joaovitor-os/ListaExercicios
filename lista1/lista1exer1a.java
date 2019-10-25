package lista1;

import java.util.Scanner;

public class lista1exer1a {
    public static void main(String[] args) {
        Scanner med = new Scanner(System.in);

        System.out.println("Digite a primeira nota: ");
        double n1 = med.nextDouble();
        System.out.println("Digite a segunda nota: ");
        double n2= med.nextDouble();
        System.out.println("Digite a terceira nota: ");
        double n3= med.nextDouble();
        double media= (n1+n2+n3)/3;
        System.out.println("A média foi de: " + media);
        med.close();
    }
}