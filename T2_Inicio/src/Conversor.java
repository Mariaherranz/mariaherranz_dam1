import java.util.Scanner;
public class Conversor {

    /*
    *Crea un conversor entre euros,dolares,libras y yens.
    * Para ello crea una variable para cada convesión y muestra
    * por pantalla el valor pedido de euro en todas las monedas
    * con el siguiente formato:
    *
    * 1 euro=1,18 dollar
    * 1 euro= 124,74 yenes
    * 1 euro= 0,91 libras
    * System.out.printf()
    * */
    public static void main(String[] args) {
      double valorDollar =1.18;
      double valorYen = 124.74 ;
      double valorLibras =0.91;
       double euros;
              Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce los euros que quieras convertir");
        euros= teclado.nextDouble();
        System.out.printf("El valor euros - dollar es %.2fn", euros*valorDollar);
        System.out.printf("El valor euros - yenes es %.2fn", euros*valorYen);
        System.out.printf("El valor euros - libras es %.2fn", euros*valorLibras);




    }

}
