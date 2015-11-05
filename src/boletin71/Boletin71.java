

package boletin71;

/**
 *
 * @author jpatriciodasilva
 */
public class Boletin71 {

    
    public static void main(String[] args) {
        int numero1,numero2;
        
        NewClass71 obx= new NewClass71 ();
        
        numero1= obx.pedirNumeroEnteiro();
        numero2= obx.pedirNumeroEnteiro();
        
        obx.comparar(numero1, numero2);
        
       
    }
    
}
