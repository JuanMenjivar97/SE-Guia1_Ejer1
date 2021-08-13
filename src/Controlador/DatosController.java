
package Controlador;
import Modelo.DatosBean;
import java.util.Scanner;

public class DatosController {

    private static String nombre;
    private static int edad;
    
    public static void main(String[] args) {
        Scanner info = new Scanner(System.in);
        
        System.out.println("Por favor, ingrese su nombre: ");
        nombre = info.nextLine();
        System.out.println("Ingrese su edad: ");
        edad = info.nextInt();
        
        System.out.println("Su nombre es: "+ nombre);
        System.out.println("Su edad es: " + edad);
    }
    
}
