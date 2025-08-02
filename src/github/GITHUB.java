package github;
import java.util.Scanner;

/**
 *
 * @author Gabriel y Huevandro
 */
public class GITHUB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre, edad;
        Scanner lector=new Scanner(System.in);
        System.out.println("ingrese su nombre ");
        nombre=lector.next();
        System.out.println("Ingrese su edad");
        edad=lector.next();       
    }
}