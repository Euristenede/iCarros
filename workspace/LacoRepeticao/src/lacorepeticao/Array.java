package lacorepeticao;

/**
 *
 * @author euris
 */
public class Array {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String[] frutas = {"Uva", "Melão", "Morango", "Laranja"};
        System.out.println("Tamanho do array: "+frutas.length);
        
        for(int i=0; i<=frutas.length-1;i++){
            System.out.println(i+1+" - "+frutas[i]);
        }
    }
    
}
