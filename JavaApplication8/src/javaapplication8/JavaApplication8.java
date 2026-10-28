/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication8;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class JavaApplication8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        int n;
        System.out.println("Introduce el valor");
        n = input.nextInt();
        
        for (int i = 0; i < n; i++) {
            int valo = i * (n - 1);
            System.out.println(valo);
        }
        
    }
    
}
