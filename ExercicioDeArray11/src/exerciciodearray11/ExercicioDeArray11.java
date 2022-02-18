package exerciciodearray11;

/*
 @author Luan Patrick Ramalho
 Tarefa:Altere o programa anterior, intercalando 3 vetores de 10 elementos cada.
 */
import java.util.Scanner;

public class ExercicioDeArray11 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        String[] primeiroVetor = new String[contador];
        String[] segundoVetor = new String[contador];
        String[] terceiroVetor = new String[contador];
        String[] vetorFinal = new String[(primeiroVetor.length
                + segundoVetor.length + terceiroVetor.length)];

        System.out.println("\nPrimeira sequência de elementos.");
        for (int i = 0, j = 0; i < primeiroVetor.length; i++) {
            System.out.printf("Informe o %dº elemento da primeira sequência:%n", 1 + i);
            primeiroVetor[i] = teclado.nextLine();
            vetorFinal[j] = primeiroVetor[i];
            j = j + 3;
        }

        System.out.println("\nSegunda sequência de elementos.");
        for (int i = 0, j = 1; i < primeiroVetor.length; i++) {
            System.out.printf("Informe o %dº elemento da segunda sequência:%n", 1 + i);
            segundoVetor[i] = teclado.nextLine();
            vetorFinal[j] = segundoVetor[i];
            j = j + 3;
        }

        System.out.println("\nTerceira sequência de elementos.");
        for (int i = 0, j = 2; i < terceiroVetor.length; i++) {
            System.out.printf("Informe o %dº elemento da terceira sequência:%n", 1 + i);
            terceiroVetor[i] = teclado.nextLine();
            vetorFinal[j] = terceiroVetor[i];
            j = j + 3;
        }

        System.out.println("\nIntercalando as sequências acima, temos:");
        for (String vetor : vetorFinal) {
            System.out.println(vetor);
        }
    }

}
