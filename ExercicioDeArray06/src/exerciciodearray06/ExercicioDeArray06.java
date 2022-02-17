package exerciciodearray06;
/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um Programa que peça as quatro notas de 10 alunos, 
 calcule e armazene num vetor a média de cada aluno,
 imprima o número de alunos com média maior ou igual a 7.0.
 */

import java.util.Scanner;

public class ExercicioDeArray06 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int quantidadeDeAlunos = 10;
        int quantidadeDeNotas = 4;
        String[] nomeDoAluno = new String[quantidadeDeAlunos];
        float[] mediaDoAluno = new float[quantidadeDeAlunos];
        float[] notaDoAluno = new float[quantidadeDeNotas];
        float totalDeNotas = 0;

        for (int i = 0; i < nomeDoAluno.length; i++) {
            System.out.println("Digite o nome do Aluno " + (1 + i) + ":");
            nomeDoAluno[i] = teclado.nextLine();
            System.out.println("Digite as notas do Aluno " + (1 + i) + ":");
            for (int j = 0; j < notaDoAluno.length; j++) {
                System.out.printf("%dº Bimestre:%n", 1 + j);
                notaDoAluno[j] = teclado.nextFloat();
                teclado.nextLine();
                totalDeNotas += notaDoAluno[j];
            }
            mediaDoAluno[i] = totalDeNotas / quantidadeDeNotas;
            totalDeNotas = 0;
        }

        System.out.println("Os alunos com média de 7.0 ou acima são:");
        for (int i = 0; i < nomeDoAluno.length; i++) {
            if (mediaDoAluno[i] >= 7.0) {
                System.out.printf("%s, com média de: %.1f%n", nomeDoAluno[i], mediaDoAluno[i]);
            }
        }

    }
}
