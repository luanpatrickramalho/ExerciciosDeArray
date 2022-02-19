package exerciciodearray18;

/*
 @author Luan Patrick Ramalho
 Tarefa:Elabore um algoritmo que leia um vetor A de 30 números inteiros e 
 imprima o maior valor.
 */
import java.util.Scanner;

public class ExercicioDeArray18 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 30;
        int vetorA[] = new int[contador];
        int maiorNumero = 0;

        for (int i = 0; i < vetorA.length; i++) {
            System.out.printf("Informe o %dº número:%n", i + 1);
            vetorA[i] = teclado.nextInt();
            if (i == 0) {
                maiorNumero = vetorA[i];
            } else if (vetorA[i] > maiorNumero) {
                maiorNumero = vetorA[i];
            }
        }

        System.out.printf("%n O MAIOR número é %d. ", maiorNumero);
    }
}
