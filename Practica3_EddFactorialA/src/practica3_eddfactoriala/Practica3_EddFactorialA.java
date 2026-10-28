/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica3_eddfactoriala;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica3_EddFactorialA {

    /**
     * @param args the command line arguments
     */
     public static long factorial(int n){
    if(n <= 1){
    return 1;
    
    }else{
    
    return n * factorial(n - 1);
    }
    
    }
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        int n;
        System.out.println("Introduzca un numero entero no negativo para n: ");
        n = input.nextInt();
        if(n < 0){
            System.out.println("El factorial no esta definido para numeros negativos");
        }else{
        long resultado = factorial(n);
            System.out.println( n + "! = " + resultado);
        }
    }
    
}
