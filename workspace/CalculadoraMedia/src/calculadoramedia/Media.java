package calculadoramedia;

import java.util.Scanner;

/**
 *
 * @author euris
 */
public class Media {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nomeAluno;
        Float nota1, nota2, nota3, nota4, media;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Digite o nome do aluno: ");
        nomeAluno = teclado.nextLine();

        System.out.println("Digita a nota 1: ");
        nota1 = teclado.nextFloat();
        System.out.println("Digita a nota 2: ");
        nota2 = teclado.nextFloat();
        System.out.println("Digita a nota 3: ");
        nota3 = teclado.nextFloat();
        System.out.println("Digita a nota 4: ");
        nota4 = teclado.nextFloat();

        media = (nota1 + nota2 + nota3 + nota4) / 4;

        System.out.println("Olá " + nomeAluno + " suas notas são " + nota1 + ", " + nota2 + ", " + nota3 + ", " + nota4 + " com uma média de: " + media);
        
        if(media < 5){
            System.out.println("Aluno reprovado");
        }else if(media == 5){
            System.out.println("Aluno em recuperação");
        }else{
            System.out.println("Aluno aprovado");
        }
        
    }

}
