package pegandoinformacoesteclado;

import java.util.Scanner;

/**
 *
 * @author euris
 */
public class Teclado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declaração das variaveis
        String nome;
        int anoAtual, anoNacimento, resultado;
        
        anoAtual = 2022;
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Digite o nome do funcionário: ");
        nome = teclado.nextLine();
        
        System.out.println("Digite o ano de nascimento: ");
        anoNacimento = teclado.nextInt();
        
        resultado = anoAtual - anoNacimento;
        
        System.out.println("Seja bem vindo "+nome);
        System.out.println("A sua idade é "+resultado+" anos.");
        
    }
    
}
