package exerciciodearray08;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um Programa que peça a idade e a altura de 5 pessoas, 
 armazene cada informação no seu respectivo vetor.
 Imprima a idade e a altura na ordem inversa a ordem lida.
 */
import java.util.Scanner;

public class ExercicioDeArray08 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 5;
        int[] idades = new int[contador];
        float[] alturas = new float[contador];

        System.out.println("Informe a idade e altura das " + contador + " pessoas abaixo:");
        for (int i = 0; i < idades.length; i++) {
            System.out.printf("Digite a Idade da %dª pessoa:%n", 1 + i);
            idades[i] = teclado.nextInt();
            System.out.printf("Digite a Altura da %dª pessoa:%n", 1 + i);
            alturas[i] = teclado.nextFloat();
        }

        for (int j = (idades.length - 1); j >= 0; j--) {
            System.out.printf("Pessoa %d: Idade = %d e Altura = %.2f.%n", 1 + j, idades[j], alturas[j]);
        }
    }
}
