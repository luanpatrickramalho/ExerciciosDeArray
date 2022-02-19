package exerciciodearray16;

/*
 @author lupar
 Tarefa:Faça um algoritmo que, dado um vetor de 50 números, imprimi-lo 
 na ordem inversa à da leitura.
 */
import java.util.Scanner;

public class ExercicioDeArray16 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 50;
        int numeros[] = new int[contador];

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %d numero:%n", i + 1);
            numeros[i] = teclado.nextInt();
        }
        System.out.println("Os " + numeros.length
                + " informados, em ordem inversa, são:");
        for (int j = numeros.length - 1; j >= 0; j--) {
            System.out.printf("%d ", numeros[j]);
        }
    }
}
