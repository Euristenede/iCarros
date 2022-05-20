package desenvolvendoarraylist;

import java.util.ArrayList;

/**
 *
 * @author euris
 */
public class ProcessandoArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<String> nomes = new ArrayList<>();
        nomes.add("Renan");
        nomes.add("Thais");
        nomes.add("Tales");
        nomes.add("Ricardo");
        nomes.add("Caio");
        nomes.add("Lucas");
        
        System.out.println(nomes);
        nomes.set(3, "Alexandre");
        System.out.println(nomes);
        nomes.remove(3);
        System.out.println(nomes);
        System.out.println(nomes.size());
    }
    
}
