package tabuadatotal;

/**
 *
 * @author euris
 */
public class CalculaTabuada {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        for(int i=1; i<11; i++){
            System.out.println("Tabuada do: "+i);
            for(int j=1; j<11; j++){
                System.out.println(i+" x "+j+" = "+i*j);
            }
        }
    }
    
}
