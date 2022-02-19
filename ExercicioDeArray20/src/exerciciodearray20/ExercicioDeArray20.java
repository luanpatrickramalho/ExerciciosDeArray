package exerciciodearray20;

/*
 @author lupar
 Tarefa: Um time de basquete possui 12 jogadores.
 Elabore um algoritmo que, dados dois vetores NÚMERO e ALTURA,
 calcule e imprima o número do jogador mais alto e a sua altura.
 */
import java.util.Scanner;

public class ExercicioDeArray20 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 12;
        int numeros[] = new int[contador];
        float alturas[] = new float[contador];
        float maiorAltura = 0;

        System.out.println("Informe o número e altura dos " + contador + " jogadores:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o NUMERO do %dº jogador:%n", 1 + i);
            numeros[i] = teclado.nextInt();
            System.out.printf("Informe a ALTURA do %dº Jogador:%n", 1 + i);
            alturas[i] = teclado.nextFloat();
            if (i == 0 || alturas[i] > maiorAltura) {
                maiorAltura = alturas[i];
            }
        }

        System.out.println("\n Jogador(es) do time com a maior altura:");
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] == maiorAltura) {
                System.out.printf(" Número %s - Altura = %.2fm%n", numeros[i], alturas[i]);
            }
        }
    }
}
