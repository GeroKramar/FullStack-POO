

package ejercicio11;
import java.util.Calendar;
import java.util.Scanner;


public class Ejercicio11 {

    
       
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);

        int dia, mes, anio;
        
        System.out.print("Ingrese su día de nacimiento: ");
        dia = leer.nextInt();
        System.out.print("Ingrese su mes de nacimiento: ");
        mes = leer.nextInt();
        System.out.print("Ingrese su año de nacimiento: ");
        anio = leer.nextInt();
       
        Calendar fechaNacimiento = Calendar.getInstance();
        Calendar fechaActual = Calendar.getInstance();
        fechaNacimiento.set(anio, mes - 1, dia);
        
        System.out.println("Fecha actual: " + fechaActual.getTime());
        System.out.println("Fecha de nacimiento: " + fechaNacimiento.getTime());

        int YEAR = fechaActual.get(Calendar.YEAR) - fechaNacimiento.get(Calendar.YEAR);
        System.out.println("La diferencia de años es " + YEAR);
        
    }
    }

