/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkia_dami_c13;

/**
 *
 * @author dmorenoar
 */
public class LINKIA_DAMI_C13 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        //Ahora puedo empezar a crear videojuegos
        /* NombreClase nombreQueQuieroPoner = new Constructor() */
        Game superMario = new Game();
        
        superMario.setMarca("Nintendo");
        
        System.out.println("¿Qué marca tiene super Mario? " + superMario.getMarca());
        
        /*PREGUNTAMOS LOS ATRIBUTOS QUE TIENE EL OBJETO*/
        System.out.println("Año de salida de super Mario: " + superMario.getAnyoSalida());
        System.out.println("Nombre del videojuego: " + superMario.getNombre());
        
        //MODIFICO EL ATRIBUTO NOMBRE DEL OBJETO
        superMario.setNombre("Super Mario Bros");
        //Y SI LE VUELVO A PREGUNTAR PODEMOS VER QUE EL OBJETO SE HA MODIFICADO, PERO ADEMAS EL SOLO
        System.out.println("Nombre del videojuego: " + superMario.getNombre());
        
        
        //Creamos un nuevo videojuego
        Game metalGear = new Game();
        metalGear.setMarca("PlayStation");
        /*metalGear.setNombre("Metal Gear");
        metalGear.setAnyoSalida(1999);*/
        
        System.out.println("¿Que marca tiene Metal Gear Solid? " + metalGear.getMarca());
        
        
        System.out.println("Año de salida de Metal Gear " + metalGear.getAnyoSalida());
        System.out.println("Nombre del videojuego: " + metalGear.getNombre());
        
        
        //Creamos un 3er objeto con todos los atributos utilizando el constructor completo
        Game pikmin = new Game("Nintendo", 2001, "Pikmin");
        
        System.out.println("Dime tu marca: " + pikmin.getMarca());
        System.out.println("Dime tu año: " + pikmin.getAnyoSalida());
        System.out.println("Dime tu nombre: " + pikmin.getNombre());
        
        //Creo un 4to videojuego
        Game medievil = new Game("Medievil");
        
        System.out.println("Dime tu marca: " + medievil.getMarca());
        System.out.println("Dime tu año: " + medievil.getAnyoSalida());
        System.out.println("Dime tu nombre: " + medievil.getNombre());
        
        medievil.setMarca("Playstation");
        System.out.println("Dime tu marca ahora: " + medievil.getMarca());
        
        medievil.gritoGuerra();
    }
    
}
