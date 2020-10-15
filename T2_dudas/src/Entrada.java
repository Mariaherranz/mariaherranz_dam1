import java.util.Scanner;

public class Entrada {
    public static void main(String[] args) {
        //tipo nombre =valor
        //tipo nombre;
        //final tipo NOMBRE=valor
        //final tipo NOMBRE;

       /* byte varbyte=123;
        Byte varByteCompleja =123;
        short varshort=2345;
        int varInt=1234;
        long varLong=1234;
        //DECIMALES con comas
        double varDouble=1234.;
        float varFloat;

        boolean acierto= false;
        char letra= 'a';
        String palabra ="ejemplo";
        Scanner teclado =new Scanner(System.in);

        varInt = teclado.nextInt();
        palabra = teclado.next();
        letra = teclado.next().charAt(0);

        System.out.printf("La primera lectura es un numero : %d%n"+"La segunda lectura es una palabra %s%n+ "+
                "La tercea lectura es una letra :%c%n",varInt,palabra,letra); */


        // operaciones aritmeticas + - * / %

         int suma = 1+3;
         int resta =1-5;
         double multiplicacion= 4*7.56;
         double division= (double) 14/ (double)3;

        System.out.println(division);

        //unarias ++,--
        int numeroIncremento=6;
        numeroIncremento++;
        numeroIncremento++;

        numeroIncremento=numeroIncremento *2;
        numeroIncremento--;
        numeroIncremento--;

        System.out.println(numeroIncremento);
//aritmetico y aginacion
        int numeroCombinado =67;
        numeroCombinado= numeroCombinado+10;
        numeroCombinado -=10;
        numeroCombinado *=10;
        numeroCombinado /=10;
        numeroCombinado %=10;

        //relacionales < <= > >= == != -->boolean
        int numeroCumpleUno=50, numeroCumpleDos=40;
        String palabraCompararUno="asD",palabraCompararDos = "asd";
        boolean cumple; numeroCumpleUno> numeroCumpleDos;
        cumple =numeroCumpleUno<numeroCumpleDos;
        cumple = numeroCumpleUno=numeroCumpleDos;
        cumple= palabraCompararUno.equals(palabraCompararDos);


        //logicas AND(&&)--> false si una de las condiciones es falsa OR (||) VERDADERO SI UNA DE LAS DOS ES VERDADERA
        //op1 op2 AND (y)-->false --->resultado falso
        //op1 op2 OR (o)-->false --->resultado true
        cumple = numeroCumpleUno>0 ||numeroCumpleDos !=9;
































        /*System.out.println("Primera salida por consola");
        System.out.println("El primer dato es"+4);
        System.out.println("El primer dato es "+4+"El segundo dato es"+6);
        System.out.printf("El %s dato es %d el segundo dato es %d y un numero con coma es %.2f","primer",4,6,4.543);+*/




    }
}
