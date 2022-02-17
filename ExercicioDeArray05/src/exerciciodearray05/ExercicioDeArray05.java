package exerciciodearray05;
/*
 @author Luan Patrick Ramalho
 Tarefa: Faça um Programa que leia 20 números inteiros e armazene-os num vetor.
 Armazene os números pares no vetor PAR e os números ÍMPARES no vetor ímpar.
 Imprima os três vetores.
 */

import java.util.Scanner;

public class ExercicioDeArray05 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int cont = 20;
        int cPar = 0;
        int cImpar = 0;
        int[] numero = new int[cont];

        for (int i = 0; i < cont; i++) {
            System.out.printf("Informe o %dº número inteiro:%n", 1 + i);
            numero[i] = teclado.nextInt();
            if (numero[i] % 2 == 0) {
                cPar++;
            } else {
                cImpar++;
            }
        }

        int[] par = new int[cPar];
        int[] impar = new int[cImpar];
        int j = 0;
        int k = 0;

        System.out.printf("Os números digitados são: %n");
        for (int numeros : numero) {
            System.out.printf("%d ", numeros);
            if (numeros % 2 == 0) {
                par[j] = numeros;
                j++;
            } else {
                impar[k] = numeros;
                k++;
            }
        }

        System.out.printf("%nOs numeros pares são:%n");
        for (int numeroPar : par) {
            System.out.printf("%d ", numeroPar);
        }
        System.out.printf("%nOs numeros impares são:%n");
        for (int numeroImpar : impar) {
            System.out.printf("%d ", numeroImpar);
        }
    }
}
