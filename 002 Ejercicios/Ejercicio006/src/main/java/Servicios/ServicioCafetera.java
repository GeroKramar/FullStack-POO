package Servicios;
import Entidades.Cafetera;
import java.util.Scanner;
public class ServicioCafetera {
public final Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public  Cafetera llenarCafetera(){
        
        Cafetera caf =  new Cafetera();
        
        System.out.println("");
        System.out.print("Ingrese la capacidad máxima de la cafetera en cc: ");
        caf.setCapacidadMaxima(leer.nextDouble());
        caf.setCapacidadActual(caf.getCapacidadMaxima());
        System.out.println("");
        
        return caf;
    }
    
    public void servirTaza(Cafetera caf){
        
        System.out.print("Ingrese la cantidad a servir en cc: ");
        double servir = leer.nextDouble();
        if(caf.getCapacidadActual()>=servir){
            caf.setCapacidadActual(caf.getCapacidadActual()-servir);
            System.out.println("Queda en la cafetera " + caf.getCapacidadActual() + " cc de café.");
        } else {
            System.out.println("No alcanzamos a servir la taza completa.");
            System.out.println("Se le sirvió " + caf.getCapacidadActual() + " cc de café.");
            caf.setCapacidadActual(0);
        }
        
    }
    
    public void vaciarCafetera(Cafetera caf){
        caf.setCapacidadActual(0);
    }
    
    public void agregarCafe(Cafetera caf){
        System.out.print("Ingrese la cantidad en cc de café a agregar a la cafetera: ");
        double cant = leer.nextDouble();
        if (cant>(caf.getCapacidadMaxima()-caf.getCapacidadActual())){
            System.out.println("La cantidad supera la cafetera, se añadirá café hasta que la misma se llene");
            caf.setCapacidadActual(caf.getCapacidadMaxima());
        } else {
            caf.setCapacidadActual(caf.getCapacidadActual()+cant);
        }
    }
}
