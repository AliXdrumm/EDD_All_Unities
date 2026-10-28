/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package chingaderadelmodulo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ChingaderadelModulo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        double a, b, c;
        System.out.println("Da el numero");
        a = input.nextInt();
        b = a % 3;
        c = a / 3;
        System.out.println("Residuo: " + b);
        System.out.println("Division: " + c);
    }
    
}
