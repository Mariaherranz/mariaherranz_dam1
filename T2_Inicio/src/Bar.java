import java.util.Scanner;
public class Bar {

    public static void main(String[] args){
         Scanner teclado = new Scanner (System.in);
         /*
         bebidas a 1,25 y los bocadillos a 2,05
        ENTRADA
        Numero de bebida :3
        Numero de bocadillos :5
        SALIDA
        Coste de las bebidas :3.75
        Coste de los bocadillos:10.25
        Coste consumición:14.0
        */
         double facturaTotal;
        int numerobebidas,int numerobocadillos;
        final double preciobebida=1.25,preciobocadillo=2.05;

        System.out.println("Cuantas bebidas queréis:");
        numerobebidas =teclado.nextInt();
        System.out.println("Cuantas bocadillos queréis:");
        numerobocadillos =teclado.nextInt();

        facturabebidas =(numerobebidas*preciobebida);
        factruabocadillos=(numerobocadillos*preciobocadillo);
         facturaTotal=( numerobebidas*preciobebida) +(numerobocadillos*preciobocadillo);
        System.out.printf("El precio total de la cuenta es :%.2f%n",facturaTotal);
        System.out.printf("El precio total de la cuenta es :%.2f%n",facturaTotal);
        System.out.printf("El precio total de la cuenta es :%.2f%n",facturaTotal);




    }
}
