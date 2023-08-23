
package gero.ejercicio003;
import Entidades.Operacion;
public class Ejercicio003 {

    public static void main(String[] args) {
         Operacion op1 = new Operacion();
        
        System.out.println("");
        op1.crearOperacion(0,0);
        System.out.println("Sus números son " + op1.getNum1() + " y " + op1.getNum2());
        System.out.println("");
        System.out.println("La suma es " + op1.sumar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La resta es " + op1.restar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La multiplicación es " + op1.multiplicar(op1.getNum1(),op1.getNum2()));
        System.out.println("");
        System.out.println("La división es " + op1.dividir(op1.getNum1(),op1.getNum2()));
        System.out.println("");
    }
}
