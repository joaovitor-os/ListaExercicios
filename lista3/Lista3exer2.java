import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Lista3exer2{
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.printf("Informe o Nome de Arquivo Texto:");
        String nome = leitura.nextLine();

        System.out.printf("Conteúdo do Arquivo Texto:");
        try {
            FileReader arq = new FileReader(nome);
            BufferedReader lerArq = new BufferedReader(arq);

            String linha = lerArq.readLine();
            while (linha != null) {
                System.out.printf("%s\n", linha);

                linha = lerArq.readLine(); // lê da segunda até a última linha
            }
            arq.close();

        } catch (IOException e) {
            System.err.printf("Erro na abertura do arquivo: %s.\n", e.getMessage());
        }
        leitura.close();
        System.out.println();
    }
}