package cadastronotas;

import java.util.Scanner;

/**
 *
 * @author euris
 */
public class ProcessaNotas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeAluno[] = new String[3];
        Float notaAluno[][] = new Float[3][2];
        float media;

        Scanner input = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            System.out.println("Digito o nome do aluno: ");
            nomeAluno[i] = input.nextLine();
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.println("Digita a " + (j + 1) + "º nota do aluno " + nomeAluno[i] + ": ");
                notaAluno[i][j] = input.nextFloat();
            }
        }

        for (int i = 0; i < 3; i++) {
            System.out.println("Aluno: " + nomeAluno[i]);
            media = 0;
            for (int j = 0; j < 2; j++) {
                System.out.println("Nota " + (j+1) + " = " + notaAluno[i][j]);
                media += notaAluno[i][j];
            }
            if ((media / 2) < 5) {
                System.out.println("Media: " + (media / 2) + " Reprovado");
            } else if ((media / 2) == 5) {

                System.out.println("Media: " + (media / 2) + " Recuperação");
            } else {
                System.out.println("Media: " + (media / 2) + " Aprovado");
            }
        }
    }

}
