package Servicios;

import Entidades.Raices;
import java.util.Scanner;


public class ServicioRaices {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public double[] vec = new double[2];

    public Raices crearRaices() {
        System.out.println("Ingrese 3 coeficientes a comparar");
        System.out.print("Coeficiente 1: ");
        double co1 = leer.nextDouble();
        System.out.print("Coeficiente 2: ");
        double co2 = leer.nextDouble();
        System.out.print("Coeficiente 3: ");
        double co3 = leer.nextDouble();
        Raices r = new Raices(co1, co2, co3);
        return r;
    }

    public double getDiscriminate(Raices R) {
        double dis = (Math.pow(R.getCoeficienteB(), 2)) - (4 * R.getCoeficienteA() * R.getCoeficienteC());
        return dis;
    }

    public boolean tieneRaices(Raices R) {
        boolean bool = false;
        if (getDiscriminate(R) >= 0) {
            bool = true;
        }
        return bool;
    }

    public boolean tieneRaiz(Raices R) {
        boolean bool = false;
        if (getDiscriminate(R) == 0) {
            bool = true;
        }
        return bool;
    }

    public double[] obtenerRaices(Raices R) {
        double[] vec = {0, 0};
        if (tieneRaices(R) == true) {
            vec[0] = (-R.getCoeficienteB() + Math.sqrt((Math.pow(R.getCoeficienteB(), 2)) - (4 * R.getCoeficienteA() * R.getCoeficienteC()))) / (2 * R.getCoeficienteA());
            vec[1] = (-R.getCoeficienteB() - Math.sqrt((Math.pow(R.getCoeficienteB(), 2)) - (4 * R.getCoeficienteA() * R.getCoeficienteC()))) / (2 * R.getCoeficienteA());
        }
        return vec;
    }

    public double obtenerRaiz(Raices R) {
        double vec = 0;
        if (tieneRaiz(R) == true) {
            vec = (-R.getCoeficienteB() + Math.sqrt((Math.pow(R.getCoeficienteB(), 2)) - (4 * R.getCoeficienteA() * R.getCoeficienteC()))) / (2 * R.getCoeficienteA());
        }
        return vec;
    }

    public void calcular(Raices R) {
        System.out.println("A continuaciñon se calcularán las raíces de 2º grado (si tiene)");
        if (tieneRaices(R) == true) {
            double[] vec = obtenerRaices(R);
            System.out.println("TIENE 2 SOLUCIONES!");
            System.out.println("Solución 1:" + vec[0]);
            System.out.println("Solución 2:" + vec[1]);
        } else if (tieneRaiz(R) == true) {
            System.out.println("TIENE 1 SOLUCIñON!");
            System.out.println("Solución 1:" + obtenerRaiz(R));
        } else System.out.println("NO TIENE SOLUCIÓN!");
    }

}