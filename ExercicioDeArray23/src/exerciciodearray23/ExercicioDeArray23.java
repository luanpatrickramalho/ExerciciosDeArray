package exerciciodearray23;

/*
 @author Luan Patrick Ramalho
 Tarefa:Elabore um algoritmo que leia os vetores A e B de números  reais de 4,  
 calcule a média ponderada. Armazene a média em um terceiro vetor e,no final, 
 imprima na ordem inversa este terceiro vetor,com duas casas decimais. 
 Peso A é 4 e peso B é 6.
 */
import java.util.Scanner;

public class ExercicioDeArray23 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 4;
        double vetorDeA[] = new double[contador];
        double vetorDeB[] = new double[contador];
        double vetorMedia[] = new double[contador];
        double pesoDeA = 4;
        double pesoDeB = 6;

        for (int i = 0; i < contador; i++) {
            System.out.printf("Informe o %dº valor da primeira sequência:\n",
                    i + 1);
            vetorDeA[i] = teclado.nextDouble();
        }
        for (int i = 0; i < contador; i++) {
            System.out.printf("Informe o %dº valor do segunda sequência:\n",
                    i + 1);
            vetorDeB[i] = teclado.nextDouble();
            vetorMedia[i] = ((vetorDeA[i] * pesoDeA) + (vetorDeB[i] * pesoDeB))
                    / (pesoDeA + pesoDeB);
        }
        for (int j = contador - 1; j >= 0; j--) {
            System.out.printf("\nO valor da %d média ponderada é: %.2f", j + 1,
                    vetorMedia[j]);
        }
    }
}
