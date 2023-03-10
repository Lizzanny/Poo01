/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guiapoo01;
import Entidades.Libro;
/**
 *
 * @author LizzW
 *
 * Crear una clase llamada Libro que contenga los siguientes atributos: ISBN,
 * Título, Autor, Número de páginas, y un constructor con todos los atributos
 * pasados por parámetro y un  vacío. Crearconstructor un método para cargar un
 * libro pidiendo los datos al usuario y luego informar mediante otro método el
 * número de ISBN, el título, el autor del libro y el numero de páginas.
 */
public class GuiaPoo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro primero = new Libro(9,"mi vida nada loca", "LizW", 1500);
        //primero.llenar();
        
        System.out.println(" "+primero.toString());
    }
    
    
}
