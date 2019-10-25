import java.util.Scanner;

// INCOMPLETO
public class Lista4exer9{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final int tamanho = 1;
        int vet[] = new int[tamanho];
        int arr[] = new int[tamanho];
        
        
        for(int i=0; i< tamanho; i++){
            System.out.println("Digite " + (i+1) +"° valor pro array um:");
            vet[i] = scanner.nextInt();
            }
        for(int i=0; i< tamanho; i++){
            System.out.println("Digite " + (i+1) +"° valor pro array um:");
            arr[i] = scanner.nextInt();
        }
        int mer[] = new int[tamanho*2];
        int k=0;
        for(int i=0; i<(tamanho*2); i++){
            mer[i]=vet[k];
            i++;
            mer[i]=arr[k];
            k++;
        }
        scanner.close();
    }
}