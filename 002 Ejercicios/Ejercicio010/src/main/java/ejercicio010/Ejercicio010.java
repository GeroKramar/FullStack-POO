
package ejercicio010;
import Entidades.Arreglo;
import Servicios.ServicioArreglo;


public class Ejercicio010 {


    public static void main(String[] args) {
        ServicioArreglo sa = new ServicioArreglo(); 
        Arreglo ar = sa.iniciarArreglo();
        sa.ordenarA(ar);
        sa.mostrar(ar);
   
    }
    
}



