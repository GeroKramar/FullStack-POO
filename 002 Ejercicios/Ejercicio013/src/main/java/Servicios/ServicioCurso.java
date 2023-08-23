package Servicios;

import Entidades.Curso;
import java.util.Scanner;


public class ServicioCurso {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Curso crearCurso() {
        Curso cur = new Curso();

        System.out.print("Nombre del Curso: ");
        cur.setNombreCurso(leer.next());
        System.out.println("-------------------------------------");
        System.out.print("Cantidad de horas por día: ");
        cur.setCantidadHorasPorDia(leer.nextInt());
        System.out.println("-------------------------------------");
        System.out.print("Cantidad de días por semana: ");
        cur.setCantidadDiasPorSemana(leer.nextInt());
        System.out.println("-------------------------------------");
        cur.setTurno(validar());
        System.out.println("-------------------------------------");
        System.out.print("Precio por hora: ");
        cur.setPrecioPorHora(leer.nextInt());
        System.out.println("-------------------------------------");
        cur.setAlumnos(cargarAlumnos());
        return cur;
    }
    
    public String validar(){
        System.out.print("Turno 1. Mañana 2. Tarde: ");
        int opc;
        do {
            opc = leer.nextInt();
            if (opc < 1 || opc > 2) {
                System.out.println("Error, vuelva a ingresar");
            }
        } while (opc < 1 || opc > 2);
        String validar;
        switch (opc) {
            case 1:
                validar = "Mañana";
                break;
            default:
                validar = "Tarde";
        }
        return validar;
    }

    public String[] cargarAlumnos() {
        String[] vec = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("Ingrese nombre del alumno " + (i+1) + ": ");
            vec[i] = leer.next();
        }
        return vec;
    }
    
    public int calcularGananciaSemanal(Curso cur){
        int precio = 5*cur.getCantidadDiasPorSemana()*cur.getCantidadHorasPorDia()*cur.getPrecioPorHora();      
        return precio;
    }
    
    public void mostrar(Curso cur){
        System.out.println("Los datos del curso son:");
        System.out.println("Nombre del Curso: " + cur.getNombreCurso());
        System.out.println("Cantidad de horas por día: " + cur.getCantidadHorasPorDia());
        System.out.println("Cantidad de días por semana: " + cur.getCantidadDiasPorSemana());
        System.out.println("Turno: " + cur.getTurno());
        System.out.println("Precio por hora: " + cur.getPrecioPorHora());
        mostrarAlumnos(cur);
    }
    
    public void mostrarAlumnos(Curso cur) {
        String[] vec = cur.getAlumnos();
        for (int i = 0; i < 5; i++) {
            System.out.println("Alumno " + (i+1) + ": " + vec[i]);
        }
    }
    
}