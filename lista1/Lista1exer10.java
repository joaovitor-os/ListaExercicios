import java.util.Scanner;

public class Lista1exer10{
    public static void main(String[] args) {
        Scanner string = new Scanner(System.in);

        System.out.println("Digite a primeira string: ");
        String first = string.nextLine();
        System.out.println("Digite a segunda string: ");
        String second = string.nextLine();
        string.close();
        
        if(first.equals(second)){
            System.out.println("As strings são iguais");
        }
        else{
            System.out.println("As strings são diferentes");
        }
    }
}