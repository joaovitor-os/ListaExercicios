import java.util.Scanner;

public class Lista1exer7{
    public static void main(String[] args) {
        Scanner impost=new Scanner(System.in);

        System.out.println("Digite o faturamento: ");
        double faturamento=impost.nextDouble();
        System.out.println("Digite a quantidade de imposto: ");
        double qtdimposto=impost.nextDouble();
        double porcentual_impost=faturamento/qtdimposto;
        System.out.println("O porcentual de imposto foi de: " + porcentual_impost);
        impost.close();
    }
}