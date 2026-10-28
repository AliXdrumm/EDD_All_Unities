/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora.simple;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class CalculadoraSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.println("Calculadora culera");
        System.out.println("1. Suma, 2. Resta, 3. Multiplicacion, 4. Division");
        System.out.println("5. Salir");
        int dato = input.nextInt();
        do{
            int valor1, valor2;
        if(dato == 1){
            System.out.println("+++++++Suma+++++++");
            System.out.println("Mete el primer numero:");
            valor1 = input.nextInt();
            System.out.println("Mete el segundo dato:");
            valor2 = input.nextInt();
            System.out.println("La suma de: " + valor1 + " y " + valor2 + " Es: " + (valor1 + valor2));
            System.out.println("Que otra operacion quieres hacer?");
            dato = input.nextInt();
        }
            
            if(dato == 2){
            System.out.println("+++++++Resta+++++++");
            System.out.println("Mete el primer numero:");
            valor1 = input.nextInt();
            System.out.println("Mete el segundo dato:");
            valor2 = input.nextInt();
            System.out.println("La suma de: " + valor1 + " y " + valor2 + " Es: " + (valor1 - valor2));
            System.out.println("Que otra operacion quieres hacer?");
            dato = input.nextInt();
            }
            if(dato == 3){
            System.out.println("+++++++Multiplicacion+++++++");
            System.out.println("Mete el primer numero:");
            valor1 = input.nextInt();
            System.out.println("Mete el segundo dato:");
            valor2 = input.nextInt();
            System.out.println("La suma de: " + valor1 + " y " + valor2 + " Es: " + (valor1 * valor2));
            System.out.println("Que otra operacion quieres hacer?");
            dato = input.nextInt();
            }
            if(dato == 4){
            System.out.println("+++++++Suma+++++++");
            System.out.println("Mete el primer numero:");
            valor1 = input.nextInt();
            System.out.println("Mete el segundo dato:");
            valor2 = input.nextInt();
            System.out.println("La suma de: " + valor1 + " y " + valor2 + " Es: " + (valor1 / valor2));
                System.out.println("Que otra operacion quieres hacer?");
                dato = input.nextInt();
            }
        
        }while(dato != 5);
     }
    
   }
        
 
