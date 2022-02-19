package exerciciodearray15;

/*
 @author Luan Patrick Ramalho
 Tarefa:Faça um algoritmo  que  carregue  um  vetor  com  dez  números  reais,
 calcule  e  mostre  a  quantidade  de números negativos e a soma dos números
 positivos desse vetor.
 */
import java.util.Scanner;

public class ExercicioDeArray15 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 10;
        int numeros[] = new int[contador];
        int quantidadeNegativos = 0;
        int somaPositivos = 0;
        int quantidadeNulos = 0;

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Informe o número de sequência " + (i + 1));
            numeros[i] = teclado.nextInt();
            if (numeros[i] > 0) {
                somaPositivos += numeros[i];
            } else if (numeros[i] < 0) {
                quantidadeNegativos++;
            } else {
                quantidadeNulos++;
            }
        }

        System.out.printf("Foram informados %d números negativos.%n"
                + "A soma dos valores positivos informados é %d.%n", quantidadeNegativos, somaPositivos);
        if (quantidadeNulos > 0) {
            System.out.printf("%d números informados foram igual a zero.", quantidadeNulos);
        }
    }
}
