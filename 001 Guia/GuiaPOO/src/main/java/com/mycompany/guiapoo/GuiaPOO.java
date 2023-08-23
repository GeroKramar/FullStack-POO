

package com.mycompany.guiapoo;
import Entidades.Persona;
import Servicios.PersonaServicios;
public class GuiaPOO {

   
        
    public static void main(String[] args) {

        PersonaServicios ps = new PersonaServicios();
        
        Persona p1 = ps.crearPersona();
        ps.mostrarPersona(p1);

    }
    
}
