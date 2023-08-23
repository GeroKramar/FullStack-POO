
package ejercicio014;
import Entidades.Movil;
import Servicios.MovilServicio;

public class Ejercicio014 {

    public static void main(String[] args) {
        MovilServicio ms = new MovilServicio();
        Movil m = ms.cargarCelular();
        ms.mostrarMovil(m);
    }
}
