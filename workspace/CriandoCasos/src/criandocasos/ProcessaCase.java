package criandocasos;

/**
 *
 * @author euris
 */
public class ProcessaCase {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dia = 4;
        
        switch(dia){
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            default:
                System.out.println("Opção inválida");
        }
    }
    
}
