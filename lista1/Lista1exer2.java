package lista1;

import java.util.Scanner;

public class Lista1exer2{
    public static void main(String[] args) {
        Scanner ar = new Scanner(System.in);

        System.out.println("Digite o comprimento: ");
        double comprimento = ar.nextDouble();
        System.out.println("Digite a largura: ");
        double largura = ar.nextDouble();
        double area = comprimento *largura;
        System.out.println("A área é de: " + area + "m^2" );
        ar.close();
    }
}