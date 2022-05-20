/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tabuada;

import java.util.Scanner;

/**
 *
 * @author euris
 */
public class ProcessaTabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numero;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Entre com um número: ");
            numero = input.nextInt();

            if (numero < 1 || numero > 9) {
                System.out.println("Digite um número entre 0 e 9.");
            } else {
                System.out.println("A tabuada desse número é: ");
                for (int j = 1; j < 11; j++) {
                    System.out.println(numero + " x " + j + " = " + j * numero);
                }
                break;
            }
        }

    }

}
