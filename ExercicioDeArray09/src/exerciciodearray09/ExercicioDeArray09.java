package exerciciodearray09;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um Programa que leia um vetor A com 10 números inteiros, 
 calcule e mostre a soma dos quadrados dos elementos do vetor.
 */
import java.util.Scanner;

public class ExercicioDeArray09 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        double[] numeros = new double[contador];
        double[] numeroQuadrados = new double[contador];
        double soma = 0;

        System.out.println("Digite " + contador + " números:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.println((1 + i) + "º número:");
            numeros[i] = teclado.nextDouble();
            numeroQuadrados[i] = Calculadora.multiplicacao(numeros[i], numeros[i]);
            soma += numeroQuadrados[i];
        }

        System.out.println("A soma dos quadrados de todos os números digitados é: " + soma);
    }
}
