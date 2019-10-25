import java.util.Scanner;

public class lista1exer3{
    public static void main(String[] args) {
        Scanner vol = new Scanner(System.in);

        System.out.println("Digite a largura: ");
        double largura = vol.nextDouble();
        System.out.println("Digite a altura: ");
        double altura = vol.nextDouble();
        System.out.println("Digite a profundidade: ");
        double profundidade = vol.nextDouble();
        double volume=largura*altura*profundidade;
        System.out.println("O volume é de: " +volume+ "m^3");
        vol.close();
    }
}