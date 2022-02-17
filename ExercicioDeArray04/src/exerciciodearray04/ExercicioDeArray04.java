package exerciciodearray04;
/*
 @author Luan Patrick Ramalho
 Tarefa: Faça um Programa que leia um  vetor de 10  caracteres, e diga quantas  consoantes foram lidas. Imprima as consoantes.
 */

import java.util.Scanner;

public class ExercicioDeArray04 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        char[] consoante;
        consoante = new char[10];
        char caracter;
        int quantidadeConsoantes = 0;

        for (int i = 0; i < consoante.length; i++) {
            System.out.printf("Informe a %dª letra: %n", 1 + i);
            caracter = teclado.next().charAt(0);
            while ((caracter < 65) || (caracter > 90 && caracter < 97) || (caracter > 122)) {
                System.out.println("Operação invalida! O caractere deve ser uma letra. Tente novamente.");
                System.out.printf("Informe a %dª letra: %n", 1 + i);
                caracter = teclado.next().charAt(0);
            }
            switch (caracter) {
                case 'a':
                case 'e':
                case 'i':
                case 'o':
                case 'u':
                case 'A':
                case 'E':
                case 'I':
                case 'O':
                case 'U':
                    consoante[i] = 0;
                    break;
                default:
                    consoante[i] = caracter;
                    quantidadeConsoantes++;
            }
        }

        System.out.printf("A quantidade de Consoantes digitadas é: %d%n", quantidadeConsoantes);

        for (char consoantes : consoante) {
            if (consoantes != 0) {
                System.out.printf("%s ", consoantes);
            }
        }
    }
}
