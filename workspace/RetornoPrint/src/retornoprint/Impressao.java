package retornoprint;

/**
 *
 * @author euris
 */
public class Impressao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nome = "Givanildo Vidal Marques";
        String endereco = "Rua Deus me Chama, 1000";
        Integer idade = 35;
        String estado = "SP";
        String email = "giva@gama.com.br";
        
        System.out.println(nome);
        System.out.println(endereco);
        System.out.println(idade);
        System.out.println(estado);
        System.out.println(email);
        
        System.out.printf(nome);
        System.out.printf(endereco);
        System.out.printf("%d",idade);
        System.out.printf(estado);
        System.out.printf(email);
    }
    
}
