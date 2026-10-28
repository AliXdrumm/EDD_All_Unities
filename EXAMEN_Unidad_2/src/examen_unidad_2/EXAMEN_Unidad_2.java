/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_unidad_2;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EXAMEN_Unidad_2 {

    /**
     * @param args the command line arguments
     */
    
    public static int valores(int indice, int arr1[]){
   int sumas = 0;
   
   if(indice == arr1.length){
   return 0;
   
   }else{
   sumas += arr1[indice] + valores(indice + 1, arr1);
   }
            
        return sumas;
    }
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        int indice = 0;
        int n;
        
       int arr1[] = new int[5];
       
        System.out.println("Introduce los valores del arreglo: ");
        for (int i = 0; i < arr1.length; i++) {
         System.out.print("Valor " + i + ": ");
         arr1 [i] = input.nextInt();   
        }
        
        System.out.println("La suma de los valores del arreglo es: " + valores(indice, arr1));
       
        }
    }
    

