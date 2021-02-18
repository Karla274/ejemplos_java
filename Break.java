
package pkgbreak;

/**
 *
 * @author Desiree
 */
public class Break {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        for(int i=0; i<010; i++){
            System.out.println("Aun estas en el ciclo");
            if(i == 4){
                break;
        }
           System.out.println(" El valor de i es: "+i);
            
        }
        System.out.println(" Has dejado el ciclo for");
    }
    
}
