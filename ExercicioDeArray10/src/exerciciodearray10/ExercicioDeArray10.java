package exerciciodearray10;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um Programa que leia dois vetores com 10 elementos cada.
 Gere um terceiro vetor de 20 elementos, cujos valores deverão ser 
 compostos pelos elementos intercalados dos dois outros vetores.
 */
import java.util.Scanner;

public class ExercicioDeArray10 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        String[] primeiroVetor = new String[contador];
        String[] segundoVetor = new String[contador];
        String[] vetorFinal = new String[(primeiroVetor.length + segundoVetor.length)];

        System.out.println("\nPrimeira sequência de elementos.");
        for (int i = 0, j = 0; i < primeiroVetor.length; i++) {
            System.out.printf("informe o %dº elemento da primeira sequência:%n", 1 + i);
            primeiroVetor[i] = teclado.nextLine();
            vetorFinal[j] = primeiroVetor[i];
            j += 2;
        }

        System.out.println("\nSegunda sequência de elementos.");
        for (int i = 0, j = 1; i < segundoVetor.length; i++) {
            System.out.printf("Informe o %dº elemento da segunda sequência:%n", 1 + i);
            segundoVetor[i] = teclado.nextLine();
            vetorFinal[j] = segundoVetor[i];
            j += 2;
        }

        System.out.println("\nIntercalando as sequências acima, temos:");
        for (String vetor : vetorFinal) {
            System.out.println(vetor);
        }
    }
}
