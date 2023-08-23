

package ejercicio002;
import Entidades.Circunferencia;

public class Ejercicio002 {

   
        
    public static void main(String[] args) {
       
        Circunferencia c1 = new Circunferencia();
        c1.crearCircunferencia();
        System.out.println(c1.area(c1.getRadio()));
        System.out.println(c1.perimetro(c1.getRadio()));
        
    }
    
}
