import java.util.Scanner;

public class Formatopersonas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        // Nombre y apellidos =Maria Herranz
        //Edad= 19
        //Altura = 1.68
        //Carnet=False
        //Letra=T

        int edad ;
        String nombreapellido;
        double altura;
        String letraDNI;
        boolean carnet;

        System.out.println("Introduce nombre-apellido");
        nombreapellido = teclado.next();
        System.out.println("Introduce Edad");
        edad =teclado.nextInt();
        System.out.println("Introduce altura");
        altura=teclado.nextDouble();
        System.out.println("Introduce carnet ");
        carnet =teclado.nextBoolean();
        System.out.println("Introduce letra DNI");
        letraDNI = teclado.next();
        //string %s
        //letra %c
        //numero sin ,%d
        //numero con , %.2f
        //boolean %b
        //salto de linea %n

        System.out.println("NOMBRE\t\t\t EDAD\t\t\tAltura\t\t\tCarnet\t\t\t Letra ");
        System.out.printf("%s\t\t\t%d\t\t\t%.2f\t\t\t%b\t\t\t %S%n",nombreapellido,edad,altura,carnet,letraDNI);



    }
}
