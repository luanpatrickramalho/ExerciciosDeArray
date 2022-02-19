package exerciciodearray14;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um algoritmo que carregue um vetor de seis elementos numéricos 
 inteiros, calcule e mostre:
 a) A quantidade de números pares;
 b) Quais os números pares;
 c) A quantidade de números ímpares;
 d) Quais os números ímpares.
 */
import java.util.Scanner;

public class ExercicioDeArray14 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 6;
        int numeros[] = new int[contador];
        int pares[];
        int impares[];
        int quantidadePar = 0;
        int quantidadeImpar = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o %dº número:%n", i + 1);
            numeros[i] = teclado.nextInt();
            teclado.nextLine();
            if (numeros[i] % 2 == 0) {
                quantidadePar++;
            } else {
                quantidadeImpar++;
            }
        }

        pares = new int[quantidadePar];
        impares = new int[quantidadeImpar];
        int j = 0;
        int k = 0;
        for (int numero : numeros) {
            if (numero % 2 == 0) {
                pares[j] = numero;
                j++;
            } else {
                impares[k] = numero;
                k++;
            }
        }

        System.out.printf("%n Os %d números PARES digitados foram:%n", pares.length);
        for (int par : pares) {
            System.out.printf("%d ", par);
        }

        System.out.printf("%n Os %d números IMPARES digitados foram:%n", impares.length);
        for (int impar : impares) {
            System.out.printf("%d ", impar);
        }
    }
}
