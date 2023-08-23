/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ejercicio013;
import Entidades.Curso;
import Servicios.ServicioCurso;

public class Ejercicio013 {
public static void main(String[] args) {
       
        ServicioCurso sc = new ServicioCurso();
        
        System.out.println("A continuación vamos a crear un curso");
        System.out.println("Ingrese los datos correspondientes");
        System.out.println("-------------------------------------");
        Curso c1 = sc.crearCurso();
        System.out.println("La cantidad a cobrar por semana es $" + sc.calcularGananciaSemanal(c1));
        System.out.println("----------------------------------------");
        sc.mostrar(c1);
}
}
