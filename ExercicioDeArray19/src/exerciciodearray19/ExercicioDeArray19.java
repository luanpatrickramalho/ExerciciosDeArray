package exerciciodearray19;

/*
 @author Luan Patrick Ramalho
 Tarefa:Elabore um algoritmo que, dados dois vetores inteiros de 10  posições,
 leia os dois vetores,some os valores da mesma posição e armazene em um terceiro
 vetor inteiro de 10 posições. No final imprima este terceiro vetor.
 */
import java.util.Scanner;

public class ExercicioDeArray19 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        int primeiroVetor[] = new int[contador];
        int segundoVetor[] = new int[contador];
        int vetorResultado[] = new int[contador];

        System.out.println("\n Primeira sequência");
        for (int i = 0; i < contador; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor da primeira sequência:");
            primeiroVetor[i] = teclado.nextInt();
        }
        System.out.println("\n Segunda sequência");
        for (int i = 0; i < contador; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor da segunda sequência:");
            segundoVetor[i] = teclado.nextInt();
            vetorResultado[i] = primeiroVetor[i] + segundoVetor[i];
        }
        System.out.println("\n A sequencia resultante da soma posicional das anteriores é:");
        for (int resultado : vetorResultado) {
            System.out.printf("%d%n", resultado);
        }
    }
}
