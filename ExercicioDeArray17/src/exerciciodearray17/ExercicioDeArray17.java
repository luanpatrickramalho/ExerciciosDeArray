package exerciciodearray17;

/*
 @author lupar
 Tarefa:Faça algoritmo que carregue um vetor com 15 posições, calcule e mostre:
 a) O maior elemento do vetor e em que posição esse elemento se encontra.
 b) O menor elemento do vetor e em que posição esse elemento se encontra.
 */
import java.util.Scanner;

public class ExercicioDeArray17 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 15;
        int numeros[] = new int[contador];
        int maiorNumero = 0;
        int menorNumero = 0;
        int posicaoMaior = 0;
        int posicaoMenor = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número:%n", i + 1);
            numeros[i] = teclado.nextInt();
            if (i == 0) {
                maiorNumero = numeros[i];
                posicaoMaior = i;
                menorNumero = numeros[i];
                posicaoMenor = i;
            } else if (numeros[i] > maiorNumero) {
                maiorNumero = numeros[i];
                posicaoMaior = i;
            } else if (numeros[i] < menorNumero) {
                menorNumero = numeros[i];
                posicaoMenor = i;
            }
        }

        System.out.printf("%nO MAIOR número é %d. "
                + "e ele se encontra na posição %d do vetor.", maiorNumero, posicaoMaior);
        System.out.printf("%nO MENOR número é %d. "
                + "e ele se encontra na posição %d do vetor.", menorNumero, posicaoMenor);
    }
}
