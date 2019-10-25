import java.util.HashSet;
import java.util.Scanner;

public class Lista3exer5{
    public static void main(String[] args) {
        HashSet<String> alea = new HashSet<String>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o " + (i + 1) + "º Nome: ");
            String nom = scanner.nextLine();
            alea.add(nom);
        }

        System.out.println(alea); // imprime os nomes 
        scanner.close();
        alea.clear();
    }
}