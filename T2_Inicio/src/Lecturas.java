import java.util.Scanner;

public class Lecturas {



    Scanner teclado = new Scanner(System.in);
    String lectura = teclado.next();
    System.out.println(lectura);
    /*
     *Introduce tu nombre
     * Maria
     * Introduce tu apellido
     * Herranz
     * Introduce tu edad
     * 19
     * Hola Maria Herranz tu edad es 19
     */

    public static void main(String[] args){
    Scanner teclado = new Scanner(System.in);
    System.out.println("Introduce tu nombre");
    String nombre = teclado.next();
    System.out.println("Introduce tu apellido");
    String apellido = teclado.next();
    System.out.println("Introduce la edad");
    int edad = teclado.nextInt();

    System.out.println("Hola "+ nombre + " " +apellido+ "tienes "+edad + " años");

}
