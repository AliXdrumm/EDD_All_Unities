/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package edd_a_suma_multiplicacion_matrices;

import java.util.Scanner;

/**
 *
 * @author HP
 */

public class EDD_A_Suma_Multiplicacion_Matrices {
    
    public static void Matriz1(int Matriz1[][]){
        Scanner input = new Scanner(System.in);
            for (int i = 0; i < Matriz1.length; i++) {
            for (int j = 0; j < Matriz1[i].length; j++) {
                System.out.printf("Ingresa posición [%d][%d]: ", i, j);
                Matriz1[i][j] = input.nextInt();
            }
        }
    }
    public static void Matriz2(int Matriz2[][]){
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < Matriz2.length; i++) {
            for (int j = 0; j < Matriz2[i].length; j++) {
                System.out.printf("Ingresa posición [%d][%d]: ", i, j);
                Matriz2[i][j] = input.nextInt();
            }
        }
    }
    
    public static void imprimirMatriz(int[][] matriz) {
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                System.out.printf("[%4d] ", matriz[i][j]);
            }
            System.out.println();
        }
    }
public static void Menu(){
    System.out.println("----------Matrices------------" + "\n" +
            "1.Introducir valores a las matrices" + "\n" +
            "2.Sumar matrices" + "\n" +
            "3.Multiplicar matrices" +"\n" +
            "4.Salir");
    System.out.println("------------------------------------------------------");
}
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int valor, a1, a2, b1, b2;
        
        System.out.print("Define el tamaño de la matriz 1 (Filas): ");
        a1 = input.nextInt();
        System.out.print("(Columnas): ");
        a2 = input.nextInt();
        System.out.println("---------------------------------------------");
        int Matriz1[][] = new int[a1][a2];

        System.out.print("Define el tamaño de la matriz 2 (Filas): ");
        b1 = input.nextInt();
        System.out.print("(Columnas): ");
        b2 = input.nextInt();
        System.out.println("---------------------------------------------");
        int Matriz2[][] = new int[b1][b2];
        
        do{
            Menu();
        valor = input.nextInt();
        if(valor == 1){
        int x;
        
        do{
            System.out.println("1.Matriz 1" + "\n" +
                    "2.Matriz 2" + "\n" +
                    "3.Salir");
            System.out.println("--------------------------");
            x = input.nextInt();
            
            if(x == 1){
            Matriz1(Matriz1);
            }
            if(x == 2){
            Matriz2(Matriz2);
            }
            
        }while(x != 3);
        }
        
        if(valor == 2){
        if (a1 == b1 && a2 == b2) {
         int[][] suma = new int[a1][a2];
         for (int i = 0; i < a1; i++) {
         for (int j = 0; j < a2; j++) {
         suma[i][j] = Matriz1[i][j] + Matriz2[i][j];
           } 
         }
           imprimirMatriz(suma);
        }else{
            System.out.println("Las filas y columnas de la matriz tienen que ser iguales");
        }
        }
        if(valor == 3){
        if (a2 == b1) {
        int[][] producto = new int[a1][b2];
        for (int i = 0; i < a1; i++) {
        for (int j = 0; j < b2; j++) {
        for (int k = 0; k < a2; k++) {
        producto[i][j] += Matriz1[i][k] * Matriz2[k][j];
          }
        }
       }
     System.out.println("\n--- Resultado de la Multiplicación ---");
      imprimirMatriz(producto);
        } else {
        System.out.println("Para multiplicar, las columnas de M1 (" + a2 + ") deben ser iguales a las filas de M2 (" + b1 + ").");
           }
        }
        
        if(valor < 0 && valor > 4){
            System.out.println("Introduzca opciones válidas");
            System.out.println("--------------------------------------");
        }
        
        }while(valor != 4);
    }
    
}
