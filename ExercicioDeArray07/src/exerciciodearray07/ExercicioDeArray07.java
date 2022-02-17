package exerciciodearray07;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um Programa que leia um vetor de 5 números inteiros, 
 mostre a soma, multiplicação e os números.
 */
import java.util.Scanner;

public class ExercicioDeArray07 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 5;
        double[] numeros = new double[contador];
        double totalSoma = 0;
        double totalMultiplica = 1;

        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Digite o %dº número:%n", 1 + i);
            numeros[i] = teclado.nextInt();
            totalSoma = Calculadora.soma(totalSoma, numeros[i]);
            totalMultiplica = Calculadora.multiplicacao(totalMultiplica, numeros[i]);
        }
        System.out.println("Os números digitados foram: ");
        for (double numero : numeros) {
            System.out.printf("%.0f ", numero);
        }
        System.out.printf("%nA soma destes números é: %.0f", totalSoma);
        System.out.printf("%nA multiplicação destes números é: %.0f", totalMultiplica);
    }
}
