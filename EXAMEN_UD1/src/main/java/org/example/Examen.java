package org.example;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Examen {
    public static void ejercicio1(){
        Scanner entrada = new Scanner(System.in); //Importo la utilidad Scanner
        int num = 0; //Creo la variable num y le doy el valor 0
        boolean seguir= false; //Creo un número booleano llamado seguir y le doy el valor false para usarlo en un bucle while

        while(!seguir) { //Creo un bucle while en el que mientras la variable seguir sea false entraremos en un Try-Catch para comprobar errores.
            try {
                System.out.println("Introduce un número:");
                num = Integer.parseInt(entrada.nextLine()); //Compruebo que num sea una variable int y no una cadena string
                seguir = true; //Si la variable num es un número entero, seguir cambiará su valor a true y saldrá del bucle
            } catch (InputMismatchException | NumberFormatException err) {
                System.out.println("ERROR. Introduce un número válido"); //Si el error que queremos cazar en el catch existe, saltará un error y
                // volverá a pedir la variable num hasta que sea un número entero
            }
        }
        if (num < 0) {
            num = num * (-1);
            System.out.println("El valor absoluto de " + "-" + num + " es " + num); //Si num es menor que 0 se multiplicará por (-1)
            //para poder sacar el valor absoluto de num. Seguidamente mostraremos el mensaje anterior con el valor absoluto.
        }
        else {
            System.out.println("El valor absoluto de " + num + " es " + num); //Si num es mayor que 0 se mostrará por pantalla el anterior mensaje
            //con el valor absoluto de num. En este caso num no se alterará.
        }


    }
    public static void ejercicio2(){

        System.out.println("Introduce tu nombre:");
        Scanner entrada = new Scanner(System.in);
        String nom = entrada.next(); //Solicitamos el nombre del usuario en variable de cadena nom

        System.out.println("La obra de " + nom); //Imprimimos texto con la variable nom
        System.out.println("Introduce el ancho de la pared...");
        int anch = entrada.nextInt(); //Solicitamos y escribimos el ancho de la pared

        System.out.println("Introduce el largo de la pared...");
        int larg = entrada.nextInt(); //Solicitamos y escribimos el largo de la pared

        System.out.println("Introduce el ancho del azulejo...");
        int anch_a = entrada.nextInt(); //Solicitamos y escribimos el ancho del azulejo

        System.out.println("Introduce el largo del azulejo...");
        int larg_a = entrada.nextInt(); //Solicitamos y escribimos el largo del azulejo

        if (anch_a == larg_a) {
            System.out.println("El azulejo no puede ser cuadrado."); //Si el ancho y largo del azulejo son iguales
            //(azulejo cuadrado) nos salta un error y termina el programa
        }

        double pared = anch * larg; //Sacamos con decimales el tamaño total de la pared
        double azul = anch_a * larg_a; //Sacamos con decimales el tamaño total del azulejo

        if (pared < azul) {
            System.out.println("El azulejo no puede ser más grande que la pared."); //Si el azulejo es más grande que la pared
            //nos salta un error y termina el programa.
        }
        if (anch_a != larg_a && pared >= azul) {

            double num_azul = pared / azul;

            System.out.println("Se necesitan " + num_azul + " azulejos."); //Si ninguno de los errores anteriores se cumple
            //dividimos el ancho de la pared entre el del azulejo para sacar la cantidad de azulejos que necesitamos en decimal.
        }

    }
}
