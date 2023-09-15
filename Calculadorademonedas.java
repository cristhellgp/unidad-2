
package calculadorademonedas;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Calculadorademonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("ingresa una cantidad a convertir en otra moneda");
        double pesos= lectura.nextDouble();
        double euros=18.21;
        double dolares=17.07;
        double yen =0.12;
        double libras = 21.18;
        System.out.println("la cantidad en euros es " + pesos/euros);
        System.out.println("la cantidad de dolares es " + pesos/dolares);
        System.out.println("la cantidad de yen es " + pesos/yen);
        System.out.println("la cantidad de libras es" + pesos/libras);
        
                
        // TODO code application logic here
    }
    
}
