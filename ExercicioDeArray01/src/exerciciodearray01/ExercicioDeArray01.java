package exerciciodearray01;
/*
 @author Luan Patrick Ramalho
 Tarefa: Faça um Programa que leia um vetor de 5 números inteiros e mostre-os.
 */

import java.util.Scanner;

public class ExercicioDeArray01 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int numero[];
        numero = new int[5];

        for (int i = 0; i < numero.length; i++) {
            System.out.println("Digite o " + (1 + i) + "o numero:");
            numero[i] = teclado.nextInt();
        }

        for (int numeros : numero) {
            System.out.println("Numero: " + numeros);
        }
    }
}
