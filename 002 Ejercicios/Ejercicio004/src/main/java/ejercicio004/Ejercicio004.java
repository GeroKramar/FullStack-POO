

package ejercicio004;
import Entidades.Rectangulo;

public class Ejercicio004 {

    public static void main(String[] args) {
        Rectangulo rec = new Rectangulo();
        
        System.out.println("Ingrese los siguientes datos para crear un rectángulo y operar con él");
        System.out.println("");
        
        rec.crearRectangulo(0,0);
        
        System.out.println("Su superficie es: " + rec.superficie(rec.getBase(), rec.getAltura()));
        System.out.println("");
        
        System.out.println("Su perímetro es: " + rec.perimetro(rec.getBase(), rec.getAltura()));
        System.out.println("");

        rec.dibujar(rec.getBase(), rec.getAltura());
    }
}
