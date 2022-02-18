package exerciciodearray12;

/*
 @author Luan Patrick Ramalho
 Tarefa:Foram anotadas as idades e alturas de 30 alunos. 
 Faça um Programa que determine quantos alunos com mais de 13 anos possuem 
 altura inferior à média de altura desses alunos.
 */
import java.util.Scanner;

public class ExercicioDeArray12 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contador = 30;
        int idade[] = new int[contador];
        float altura[] = new float[contador];
        float somaAlturas = 0;
        float mediaAlturas;
        int totalAlunosBaixos = 0;

        System.out.println("Informe a idade e altura dos " + contador + " alunos abaixo:");
        for (int i = 0; i < idade.length; i++) {
            System.out.printf("Digite a IDADE do %dº aluno:%n", 1 + i);
            idade[i] = teclado.nextInt();
            System.out.printf("Digite a ALTURA do %dº aluno:%n", 1 + i);
            altura[i] = teclado.nextFloat();
            somaAlturas += altura[i];
        }

        mediaAlturas = somaAlturas / altura.length;

        for (int i = 0; i < idade.length; i++) {
            if (idade[i] > 13) {
                if (altura[i] < mediaAlturas) {
                    totalAlunosBaixos++;
                }
            }
        }

        System.out.printf("O total de Alunos, maior de 13 anos,"
                + "que tem altura menor que a média geral de %.2fm, "
                + "é de: %n%d Alunos.", mediaAlturas, totalAlunosBaixos);
    }
}
