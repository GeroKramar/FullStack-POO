package Servicios;

import Entidades.Cadena;
import java.util.Scanner;

public class CadenaServicio {

    public final Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Cadena pedirFrase() {
        Cadena frase = new Cadena();
        System.out.println("Ingrese una frase");
        frase.setCadena(leer.next());
        frase.setLongitud(frase.getCadena().length());
        return frase;
    }

    public char[] llenarVector(char[] vec, Cadena frase) {
        for (int i = 0; i < frase.getLongitud(); i++) {
            vec[i] = frase.getCadena().charAt(i);
        }
        return vec;
    }

    public int mostrarVocales(char[] vec, Cadena frase) {
        int cont = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (vec[i] == 'a' || vec[i] == 'e' || vec[i] == 'i' || vec[i] == 'o' || vec[i] == 'u' || vec[i] == 'A' || vec[i] == 'E' || vec[i] == 'I' || vec[i] == 'O' || vec[i] == 'U') {
                cont++;
            }

        }

        return cont;

    }

    public void invertirFrase(char[] vec, Cadena frase) {

        System.out.println("La frase invertida es:");
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            System.out.print(vec[i]);
        }
        System.out.println("");

    }

    public int vecesRepetido(char[] vec, Cadena frase) {
        int cont = 0;
        char var;
        System.out.print("Ingrese un caracter para buscarlo en la frase: ");
        var = leer.next().charAt(0);
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            if (vec[i] == var) {
                cont++;
            }
        }
        return cont;
    }

    public void compararLongitud(Cadena frase) {
        System.out.println("Ingrese una nueva frase a comparar");
        String frase2 = leer.next();
        if (frase2.length() == frase.getLongitud()) {
            System.out.println("Las longitudes son iguales!!!");
        } else {
            System.out.println("Las longitudes son distintas");
        }
        System.out.println("Longitud frase 1: " + frase.getLongitud());
        System.out.println("Longitud frase 2: " + frase2.length());
    }
    
    public void unirFrases(Cadena frase){
        System.out.println("Ingrese una nueva frase a unir con la anterior");
        String frase2 = leer.next();
        System.out.println(frase.getCadena()+frase2);
    }
    
    public void reemplazar(Cadena frase){
        System.out.println("Ingrese un caracter para reemplazar tolas las 'a' de la frase actual");
        String caracter = leer.next();
        frase.setCadena(frase.getCadena().replace("a",caracter).replace("A",caracter));
        System.out.println("La nueva frase es:");
        System.out.println(frase.getCadena());
    }
    
    public boolean contiene(char[] vec, Cadena frase) {
        
        char var;
        boolean bandera=false;
        System.out.print("Ingrese un caracter para buscarlo en la frase: ");
        var = leer.next().charAt(0);
        for (int i = frase.getLongitud() - 1; i >= 0; i--) {
            if (vec[i] == var) {
                bandera = true;
            }
        }
        return bandera;
    }

}