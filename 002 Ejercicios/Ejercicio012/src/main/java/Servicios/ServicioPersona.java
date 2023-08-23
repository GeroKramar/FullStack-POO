package Servicios;

import Entidades.Persona;
import java.util.Calendar;
import java.util.Scanner;


public class ServicioPersona {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona per = new Persona();

        System.out.print("Ingerse su nombre: ");
        per.setNombre(leer.next());
        System.out.println("Ingrese su fecha de nacimiento para:");
        System.out.print("Día: ");
        int dia = leer.nextInt();
        System.out.print("Mes: ");
        int mes = leer.nextInt();
        System.out.print("Año: ");
        int anio = leer.nextInt();
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(anio, mes-1, dia);
        per.setNacimiento(fecha);

        return per;
    }

    public int calcularEdad(Persona per) {
        Calendar fechaActual = Calendar.getInstance();
        int resultado = fechaActual.get(Calendar.YEAR) - per.getNacimiento().get(Calendar.YEAR);
        return resultado;
    }
    
    public boolean menorQue(Persona per, Persona per2){
        boolean opc=false;
        
        if(per2.getNacimiento().get(Calendar.YEAR)<per.getNacimiento().get(Calendar.YEAR)){
            opc=true;
        }
        
        return opc;
    }
    
    public void mostrar(Persona p){
        System.out.println("Nombre: " + p.getNombre());
        System.out.println("Fecha: " + p.getNacimiento().getTime());
    }

}