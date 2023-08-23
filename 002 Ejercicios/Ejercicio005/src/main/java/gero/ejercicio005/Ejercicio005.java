
package gero.ejercicio005;
import Entidades.CuentaBancaria;
import Servicios.ServiciosCuentaBnacaria;


public class Ejercicio005 {

    public static void main(String[] args) {
              
        ServiciosCuentaBnacaria scv = new ServiciosCuentaBnacaria();
        
        CuentaBancaria cBank1 = scv.crearCuenta();
        scv.ingreso(0, cBank1);
        scv.retiro(0, cBank1);
        scv.extraccion(0, cBank1);
        scv.saldo(cBank1);
        scv.datos(cBank1);
    }
}
