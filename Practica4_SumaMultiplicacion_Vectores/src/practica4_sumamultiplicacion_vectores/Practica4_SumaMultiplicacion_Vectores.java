/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4_sumamultiplicacion_vectores;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica4_SumaMultiplicacion_Vectores {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int valor;
        do{
        
        System.out.println("Introduzca los valores un numero para una accion:");
        System.out.println("1. Sumar vectores" + "\n" +
                           "2. Multiplicar vectores" + "\n" +
                           "3. Salir" + "\n" +
                           "----------------------------------------");
        valor = input.nextInt();
        
        if(valor == 1){
        sumaVectores();
        
        }
        
        if(valor == 2){
        multiplicacionVectores();
        
        }
        if(valor <= 0 && valor > 3){
            System.out.println("Introduzca un valor valido para las opoeraciones");
            System.out.println("------------------------------------------");
        }
        
        }while(valor != 3);
    }
    public static void sumaVectores(){
Scanner input = new Scanner(System.in);

        System.out.println("Introduce los valores del primer vector: ");
        System.out.print("X1 = ");
        long x1 = input.nextLong();
        System.out.print("Y1 = ");
        long y1 = input.nextLong();

        System.out.println("Introduce los valores del segundo vector: ");
        System.out.print("X2 = ");
        long x2 = input.nextLong();
        System.out.print("Y2 = ");
        long y2 = input.nextLong();

        long suma1 = x1 + x2;
        long suma2 = y1 + y2;

        System.out.print("La suma de los vectores es: X = " + suma1 + ", Y = " + suma2);
        System.out.println(",(" + suma1 + "," + suma2 + ")");
        System.out.println("--------------------------------------");
        
    }
public static void multiplicacionVectores(){
Scanner input = new Scanner(System.in);

        System.out.println("Introduce los valores del primer vector: ");
        System.out.print("X1 = ");
        long x1 = input.nextLong();
        System.out.print("Y1 = ");
        long y1 = input.nextLong();

        System.out.println("Introduce los valores del segundo vector: ");
        System.out.print("X2 = ");
        long x2 = input.nextLong();
        System.out.print("Y2 = ");
        long y2 = input.nextLong();

        long multip1 = x1 * x2;
        long multip2 = y1 * y2;

        System.out.println("La multiplicacion (Producto punto) de los valores es = " + (multip1 + multip2));
        System.out.println("----------------------------------------------------");
    }

}
