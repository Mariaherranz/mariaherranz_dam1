import java.util.Scanner;

public class Entrada1 {
    public static void main(String[] args) {
        //numero sin decimal
        byte numeroByte = -126;
        short numeroShort =12;
        int numeroint = 8;
        long numeroLong = 2;
        //numero con decimal
        double numeroDouble= 2.5;
        float numeroFloat= 13.8f;

        String miNombre ="Maria Herranz";

        final String EMPRESA = "CES JPII";
        //System.out.println(numeroByte);
        //System.out.println(numeroByte);
        //Numero Byte: xxxxx Valor minimo: xxxxxx Valor máximo:xxxx

        //System.out.println("Número Byte:\t " +numeroByte +"\tloquesea );
        //System.out.println("Número Byte:\t "+numeroShort);

        System.out.println("Número Byte: "+numeroByte+"\tValor mínimo: "+Byte.MIN_VALUE+"\tValor máximo: "+Byte.MAX_VALUE);

        System.out.println("numeroByte");
        System.out.println("Máximo Byte");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Byte");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(numeroShort);
        System.out.println("Máximo Short");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Short");
        System.out.println(Byte.MIN_VALUE);
        System.out.println("numeroInteger");
        System.out.println("Máximo Integer");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Integer");
        System.out.println(Byte.MIN_VALUE);
        System.out.println("numeroLong");
        System.out.println("Máximo Long");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Long");
        System.out.println(Byte.MIN_VALUE);
        System.out.println(numeroDouble);
        System.out.println("Máximo Double");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Double");
        System.out.println(Byte.MIN_VALUE);
        System.out.println("numeroFloat");
        System.out.println("Máximo Float");
        System.out.println(Byte.MAX_VALUE);
        System.out.println("Mínimo Float");
        System.out.println(Byte.MIN_VALUE);
        System.out.println("valorVerdadero");
        System.out.println("valorFalso");

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

        System.out.println();


    }
}
