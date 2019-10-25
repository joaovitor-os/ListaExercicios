import java.util.Scanner;

public class Lista1exer8{
    public static void main(String[] args) {
        Scanner parimpar=new Scanner(System.in);

        System.out.println("Digite um valor: ");
        int numero=parimpar.nextInt();

        if(numero %2 ==0){
            System.out.println("O numero é par" );
        }
        else{
            System.out.println("O numero é impar" );
        }
        parimpar.close();
    }
}