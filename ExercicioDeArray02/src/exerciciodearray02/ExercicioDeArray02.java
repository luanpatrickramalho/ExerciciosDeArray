package exerciciodearray02;
/*
 @author Luan Patrick Ramalho
 Tarefa: Faça um Programa que leia um vetor de 10 números reais e mostre-os na ordem inversa.
 */

import java.util.Scanner;

public class ExercicioDeArray02 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[];
        numero = new int[10];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (1 + i) + "o numero:");
            numero[i] = teclado.nextInt();
        }

        for (int j = numero.length - 1; j >= 0; j--) {
            System.out.println((j + 1) + "o numero digitado: " + numero[j]);
        }
    }
}
