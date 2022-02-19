package exerciciodearray22;

/*
 @author Luan Patrick Ramalho
 Tarefa:Elabore um algoritmo que  dado  três  vetores  reais  de  5  posições,
 leia estes vetores,calcule a expressão( (vetor1  *  vetor3) / vetor2),
 utilizando os valores da mesma posição,armazenando em um quarto vetor,também de
 números reais de 5 posições. No final, imprima os números do quarto vetor.
 */
import java.util.Scanner;

public class ExercicioDeArray22 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 5;
        double primeiroVetor[] = new double[contador];
        double segundoVetor[] = new double[contador];
        double terceiroVetor[] = new double[contador];
        double vetorResultado[] = new double[contador];

        System.out.println("\nPrimeira sequência");
        for (int i = 0; i < contador; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor da primeira sequência:");
            primeiroVetor[i] = teclado.nextDouble();
        }
        System.out.println("\nSegunda sequência");
        for (int i = 0; i < contador; i++) {
            System.out.println("informe o " + (i + 1) + "º valor da segunda sequência:");
            segundoVetor[i] = teclado.nextInt();
            while (segundoVetor[i] == 0) {
                System.out.println("Não pode ser zero, digite outro valor:");
                segundoVetor[i] = teclado.nextInt();
            }
        }
        System.out.println("\nTerceira sequência");
        for (int i = 0; i < contador; i++) {
            System.out.println("Informe o " + (i + 1) + "º valor da terceira sequência:");
            terceiroVetor[i] = teclado.nextInt();
            vetorResultado[i] = (primeiroVetor[i] * segundoVetor[i]) / terceiroVetor[i];
        }
        System.out.println("\nA sequencia resultante da equação posicional das anteriores é:");
        for (int i = 0; i < contador; i++) {
            System.out.printf("Posição %d: ((%.2f * %.2f) / %.2f) = %.2f%n", i,
                    primeiroVetor[i], terceiroVetor[i], segundoVetor[i], vetorResultado[i]);
        }
    }
}
