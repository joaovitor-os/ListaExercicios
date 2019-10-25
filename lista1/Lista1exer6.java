import java.util.Scanner;

public class Lista1exer6{
    public static void main(String[] args) {
        Scanner vel=new Scanner(System.in);

        System.out.println("Digite a distância em km: ");
        double distancia=vel.nextInt();
        System.out.println("Digite o tempo da viagem em horas: ");
        double tempo=vel.nextInt();
        double velocidademedia=distancia/tempo;
        System.out.println("A velocidade média foi de: " + velocidademedia + " km/h ");
        vel.close();
    }
}