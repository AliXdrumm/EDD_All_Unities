/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica4_edds_a;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica4_EDDS_A {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n,p;
        //Calcular un tercer vector metiendo un primer y segundo vector en practica 4 primera unidad
        System.out.println("Introduzca un numero: ");
        n = input.nextInt();
        System.out.println("Introduzca un segundo numero: ");
        p = input.nextInt();
        
        System.out.println("\n\t" + n + "^" + p + " = " + potencia(n, p));
    }
    static long potencia(int n, int p) {
 if (p == 0) {
 return 1;
 } else {
 return n * potencia(n, p - 1); // se hace la llamada recursiva
 }
    }
    
}
