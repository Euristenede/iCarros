package arraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author euris
 */
public class ProcessaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        int opcao;
        Scanner input = new Scanner(System.in);
        System.out.println("Digite 1 para cadastro");
        System.out.println("Digite 2 para consulta");
        System.out.println("Digite 3 para visualização");
        System.out.println("Digite 4 para exclusão");
        System.out.println("Digite 5 para modificar registro");
        opcao = input.nextInt();
        
        switch (opcao) {
            case 1:
                if (nomes.size() > 3) {
                    System.out.println("Não é possível cadastrar mais que 3 registros no array");
                } else {
                    for (int i = 0; i < 3; i++) {
                        System.out.println("Digite o nome que desesa cadastrar: ");
                        nomes.add(input.nextLine());
                    }
                }
                break;
            case 2:
                if (nomes.size() == 0) {
                    System.out.println("O Array está vazio");
                } else {
                    int posicao;
                    System.out.println("Digite a posicao que deseja consultar: ");
                    posicao = input.nextInt();
                    System.out.println(nomes.get(posicao));
                }
                break;
            case 3:
                if (nomes.size() == 0) {
                    System.out.println("O array está vazio");
                } else {
                    for (int i = 0; i < 3; i++) {
                        System.out.println(nomes.get(i));
                    }
                }
                break;
            case 4:
                if (nomes.size() == 0) {
                    System.out.println("O Array está vazio");
                } else {
                    int posicao;
                    System.out.println("Digite a posicao que deseja excluir: ");
                    posicao = input.nextInt();
                    nomes.remove(posicao);
                }
                break;
            case 5:
                if (nomes.size() == 0) {
                    System.out.println("O Array está vazio");
                } else {
                    int posicao;
                    String nome;
                    System.out.println("Digite a posicao que deseja modificar: ");
                    posicao = input.nextInt();
                    System.out.println("Digite a modificação: ");
                    nome = input.nextLine();
                    nomes.set(posicao, nome);
                }
                break;
            default:
                throw new AssertionError();
        }

    }

}
