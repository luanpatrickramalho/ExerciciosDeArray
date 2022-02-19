package exerciciodearray24;

/*
 @author Luan Patrick Ramalho
 Tarefa:Elabore um algoritmo que dado dois vetores inteiros de 3 posições, leia
 estes vetores, calcule a expressão(vetor1 - vetor2), utilizando os valores da 
 mesma posição, armazenando em um terceiro vetor,também de números inteiros de 3
 posições. No final, imprima os números ímpares do terceiro vetor.
 */
import java.util.Scanner;

public class ExercicioDeArray24 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 3;
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
            vetorResultado[i] = primeiroVetor[i] - segundoVetor[i];
        }
        System.out.println("\n Os valores ímpares resultantes da subtração posicional dos dois vetores são:");
        for (int resultado : vetorResultado) {
            if (resultado % 2 != 0) {
                System.out.printf("%d ", resultado);
            }
        }
    }
}
