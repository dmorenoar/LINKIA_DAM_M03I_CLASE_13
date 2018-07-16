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

//Definición de la clase
public class Game {
    
    //Atributos o Características
    private String marca = "No tengo";
    private int anyoSalida = 1999;
    private String nombre = "Desconocido";
    private int[] puntuaciones = new int[4];
    
    //Constructor
    public Game(){ }
    
    //Constructor completo que recibe todos los parámetros.
    public Game(String marcaNueva, int anyoSalidaNuevo, String nombreNuevo){
        marca = marcaNueva;
        anyoSalida = anyoSalidaNuevo;
        nombre = nombreNuevo;
    }
    
    //Constructor con un único argumento, el resto los coge por defecto
    public Game(String nombreNuevo){
        nombre = nombreNuevo;
    }
    
    
    //Métodos getters y setters
    public String getMarca(){
        return marca;
    }
    
    public int getAnyoSalida(){
        return anyoSalida;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setMarca(String marcaNueva){
        if(marcaNueva.equals("Ninte")){
            System.out.println("ERORR");
        }else{
            marca = marcaNueva;
        }
    }
    
    public void setAnyoSalida(int nuevoAnyo){
        anyoSalida = nuevoAnyo;
    }
    
    public void setNombre(String nuevoNombre){
        nombre = nuevoNombre;
    }
    
    //Métodos específicos
    public void gritoGuerra(){
        System.out.println("COBABUNGA!!");
    }
}
