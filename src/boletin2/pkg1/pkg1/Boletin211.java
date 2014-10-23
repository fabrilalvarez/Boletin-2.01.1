// Diseña un algoritmo que calcule el area de un triangulo con entrada de datos.
package boletin2.pkg1.pkg1;

import java.util.Scanner;

public class Boletin211 {

    public static void main(String[] args) {
        // Codigo de la aplicación.
        float b, h, a;
        a = calcular();
        imprimir(a);

    }

    public static float calcular() {
        float b;
        float h;
        float a;
        //b=base h=altura a=area
        System.out.println("Introduzca sus datos para calcular el area de un Triángulo");
        System.out.println("Base: ");
        Scanner dato = new Scanner(System.in);
        b = dato.nextFloat();
        System.out.println("Altura");
        h = dato.nextFloat();
        a = (b * h) / 2;
        return a;
    }

    private static void imprimir(float a) {
        
        System.out.println("Area del triángulo: " + a);
    }
  

}
