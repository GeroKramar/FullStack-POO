package Servicios;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaServicio {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona per = new Persona();

        System.out.print("Ingrese el nombre: ");
        per.setNombre(leer.next());
        System.out.print("Ingrese la edad: ");
        per.setEdad(leer.nextInt());
        do {
            System.out.print("Ingrese el sexo M, F u O: ");
            per.setSexo(leer.next().charAt(0));
            if (per.getSexo() != 'M' && per.getSexo() != 'F' && per.getSexo() != 'O') {
                System.out.println("Sexo incorrecto");
            }
        } while (per.getSexo() != 'M' && per.getSexo() != 'F' && per.getSexo() != 'O');
        System.out.print("Ingrese el peso: ");
        per.setPeso(leer.nextFloat());
        System.out.print("Ingrese la altura: ");
        per.setAltura(leer.nextFloat());
        System.out.println("");

        return per;
    }

    public int calcularIMC(Persona per) {
        int valor = 0;
        int imc = (int) (per.getPeso() / (per.getAltura() * per.getAltura()));

        System.out.println("Calculando el IMC");
        if (imc < 20) {
            valor = -1;
        } else if (imc > 25) {
            valor = 1;
        }

        System.out.println("Su IMC es " + imc);

        return valor;
    }

    public void esMayorDeEdad(Persona per, int[] edad) {
        if (per.getEdad() < 18) {
            System.out.println("Eres menor de edad");
            edad[0]++;
        } else {
            System.out.println("Eres mayor de edad");
            edad[1]++;
        }
    }
    
    public void mostrarPorcentajes(int[] contEdad, int[] contImc){
        System.out.println("Porcentaje mayor de edad " + (contEdad[1] * 100 / 4) + "%");
        System.out.println("Porcentaje menor de edad " + (contEdad[0] * 100 / 4) + "%");
        System.out.println("Porcentaje debajo del peso ideal " + (contImc[0] * 100 / 4) + "%");
        System.out.println("Porcentaje PESO IDEAL " + (contImc[1] * 100 / 4) + "%");
        System.out.println("Porcentaje encima del peso ideal " + (contImc[2] * 100 / 4) + "%");
    }

}