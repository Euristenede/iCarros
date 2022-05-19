package bemvindo;

/**
 *
 * @author euris
 */
public class Mensagem {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String produto;
        double valor;
        
        produto = "Mouse";
        valor = 45.35;
        
        System.out.println("Olá seja bem vindo ao nosso primeiro sistema em JAVA!!!");
        
        //permite fazer a impresão em tela, porem sem salto de linha
        System.out.print("Olá boa noite");
        System.out.print("Seja bem vindo");
        
        //Comando println permite fazer a impresão em tela, porem ele faz um salto de linha para cada comando
        System.out.println("Utilizando o printls");
        System.out.println("Para mostrar o seu retorno em tela");
        System.out.println("O nome do produto é "+produto+" e o seu preço é: "+valor);
        
        //comando printf permite vincular o conteudo de variaveis na tela de forma diferenciada
        System.out.printf("O nome do produto é %s",produto);
    }
    
}
