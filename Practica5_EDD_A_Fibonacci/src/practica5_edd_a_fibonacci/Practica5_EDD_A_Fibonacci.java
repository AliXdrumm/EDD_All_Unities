/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_edd_a_fibonacci;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica5_EDD_A_Fibonacci {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
Scanner input = new Scanner(System.in);
        int n;
        
        System.out.println("Introduce la cantidad de numeros de la sucecion de Fibonacci que quiera ver: ");
        n = input.nextInt();
                
        if (n < 0) {
            System.out.println("Introduzca un valor positivo");
            
        } else {
            
            System.out.print("Serie de Fibonacci: ");
            for (int i = 0; i < n; i++) {
                System.out.print(Fibonacci(i) + ",");
                
            }  
            
            System.out.println(" ");
        } 
    }

    // Método recursivo para calcular el n-ésimo término
    public static long Fibonacci(int n) {
        if (n == 0) {
            return 0;
        } else if (n == 1) {
            return 1;
        } else {
            return Fibonacci(n - 1) + Fibonacci(n - 2);
        }
    }
}

