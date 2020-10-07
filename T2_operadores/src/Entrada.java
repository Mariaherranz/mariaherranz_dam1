public class Entrada {
    public static void main(String[] args){
        String MINOMBRE ="María";
        System.out.println("Programa de operadores"+ MINOMBRE);

        //Aritméticos: +,-,*,/,%

        int operadorUno = 50;
        int operadorDos = 3;
        int suma = operadorUno + operadorDos;
        int resta = operadorUno - operadorDos;
        int multiplicacion = operadorUno * operadorDos;
        int division =operadorUno / operadorDos;
        int modulo = operadorUno % operadorDos;

        System.out.println("El resultado de la suma es: "+suma);
        System.out.println("El resultado de la resta es: "+resta);
        System.out.println("El resultado de la multiplicación es: "+multiplicacion );
        System.out.println("El resultado de la división es: "+division);
        System.out.println("El resultado del módulo es:" + modulo);

        //Unarios: ++, --, => contador

        int operadorUnirio =10;
        System.out.println("El valor de operadorUnario es "+operadorUnirio);
        operadorUnirio++;
        operadorUnirio++;
        operadorUnirio++;
        operadorUnirio--;
        System.out.println("El valor de operadorUnario es "+operadorUnirio);

        // aritmeticos y unarios => acumuladores

        int op1=10;
        int op2=5;
       // op1 = op1 +op2;
        op1 += op2;
        // op1 = 15
        // 15 -5
        System.out.println("Suma contraida: "+op1);

        op1 -=op2;
        // op1 = -1
        // op1 *= op2;
        // op1 =110
       // op1 /= op2;
        // op1 %=op2;
        System.out.println("Resta contraida: "+op1);
        op1 *= op2;
        System.out.println("Multiplicaicón contraida: "+op1);
        op1 /=op2;
        System.out.println("Divisón contraida: "+op1);
        op1 %=op2;
        System.out.println("Módulo contraida: "+op1);


        // Operadores comparadores >, >=, <=, <, 1== "1" (1==="1")
        int numeroCompararUno = 5;
        int numeroCompararDos = 5;
        //10>5???
        boolean resultadoComparacion = numeroCompararUno > numeroCompararDos;
        System.out.println("Comparación mayor que: "+resultadoComparacion);
        //10 >= 5???
        resultadoComparacion = numeroCompararUno >= numeroCompararDos;
        System.out.println("Comparación mayor-igual que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno < numeroCompararDos;
        System.out.println("Comparación menor que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno <= numeroCompararDos;
        System.out.println("Comparación menor-igual que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno == numeroCompararDos;
        System.out.println("Comparación igual que: "+resultadoComparacion);
        resultadoComparacion = numeroCompararUno != numeroCompararDos;
        System.out.println("Comparación diferente que: "+resultadoComparacion);


        //Inversos
        int inverso = -5;
        boolean inversobool= false ;
        inversobool = !inversobool;
        System.out.println("El inverso del "+inverso+" es: "+ -inverso);
        System.out.println("El inverso del "+inversobool+" es: "+ !inversobool);
        System.out.println("El valor de inversoBool es :"+inversobool);

        //Comparaciones con letras
        String palabraUno = "Hola";
        String palabraDos ="hola";
        boolean palabrasIguales = palabraUno.equalsIgnoreCase(palabraDos);
        System.out.println("Las palabras son iguales? "+palabrasIguales);

        // Operadores lógicos
        //AND --> &&
        //op1 op2 res
        // 0  0   0
        // 0  1   0
        // 1  0   0
        // 1  1   1
        // n1 = 1 n2 = 10
        // (n1 >= 0 && n2 >= 10) -> V

        //OR --> ||
        //op1 op2 res
        // 0  0   0
        // 0  1   1
        // 1  0   1
        // 1  1   1

        //((C1 AND C2 AND C3) OR C4 OR C5) -->




















    }
}
