import java.util.Scanner;

public class Lista4exer4{
    public static void main(String[] args){
        final int tamanho = 10;
        Scanner scanner = new Scanner(System.in);      
        int valor[] = new int[tamanho];

        for(int i=0; i< tamanho; i++){
            System.out.println("Digite o " + (i+1) + "° valor para o array: \n");
            valor[i] = scanner.nextInt();
            if (valor[i]%2==0){
                System.out.println(valor[i] + " esse numero é par");
            }
            else{
                System.out.println(valor[i] + " esse numero é impar");
            }
        }
        scanner.close();
        
        //ver se é par ou impar
        for(int i=0; i< tamanho; i++){
            if (valor[i]%2==0){
                System.out.println(valor[i] + " esse numero é par");
            }
            else{
                System.out.println(valor[i] + " esse numero é impar");
            }
        }
    }
}