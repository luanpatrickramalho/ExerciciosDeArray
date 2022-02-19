package exerciciodearray21;

/*
 @author Luan Patrick Ramalho
 Tarefa:Utilizando a questão 7, elabore um algoritmo que calcule 
 a média de altura do time.
 */
import java.util.Scanner;

public class ExercicioDeArray21 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 4;
        int numeros[] = new int[contador];
        double alturas[] = new double[contador];
        double somaAltura = 0;
        double mediaAltura;

        System.out.println("Informe o número e altura dos " + contador + " jogadores:");
        for (int i = 0; i < numeros.length; i++) {
            System.out.printf("Informe o NUMERO do %dº jogador:%n", 1 + i);
            numeros[i] = teclado.nextInt();
            System.out.printf("Informe a ALTURA do %dº Jogador:%n", 1 + i);
            alturas[i] = teclado.nextDouble();
            somaAltura += alturas[i];
        }

        mediaAltura = Calculadora.divisao(somaAltura, contador);
        System.out.printf("\nAltura média do time: %.2f\n", mediaAltura);

        System.out.println("\nJogadores acima ou na média de altura:");
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] >= mediaAltura) {
                System.out.printf("Número %s - Altura = %.2fm%n", numeros[i], alturas[i]);
            }
        }
        System.out.println("\nJogadores abaixo da média de altura:");
        for (int i = 0; i < alturas.length; i++) {
            if (alturas[i] < mediaAltura) {
                System.out.printf("Número %s - Altura = %.2fm%n", numeros[i], alturas[i]);
            }
        }
    }
}
