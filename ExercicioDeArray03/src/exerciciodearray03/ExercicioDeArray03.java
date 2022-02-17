package exerciciodearray03;
/*
 @author Luan Patrick Ramalho
 Tarefa: Faça um Programa que leia 4 notas, mostre as notas e a média na tela.
 */

import java.util.Scanner;

public class ExercicioDeArray03 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double notaAluno[];
        notaAluno = new double[4];
        double total = 0;

        for (int i = 0; i < notaAluno.length; i++) {
            System.out.printf("Digite a %dº nota: %n", 1 + i);
            notaAluno[i] = teclado.nextFloat();
            total += notaAluno[i];
        }

        for (int j = 0; j < notaAluno.length; j++) {
            System.out.printf("A %dª nota foi: %.2f%n", 1 + j, notaAluno[j]);
        }

        System.out.printf("A média das notas informadas foi: %.2f", (total / notaAluno.length));
    }
}
