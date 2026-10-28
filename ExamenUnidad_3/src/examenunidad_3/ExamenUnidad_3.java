/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examenunidad_3;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ExamenUnidad_3 {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner (System.in);
     public static String arr [];
    public static int dat = 10;
    public static void main(String[] args) {
        // TODO code application logic here
        arr = new String [dat];
        int selec;
        do{
            System.out.println("---------------ORDENACION POR SELECCION----------------------");
            System.out.println("1.-Intoducir los nombres");
            System.out.println("2.-Ver nombres (ordenacion actual)");
            System.out.println("3.-Ordenar por seleccion (A-Z)");
            System.out.println("4.-Ordenar por seleccion (Z-A)");
            System.out.println("5.-Salir");
            selec = input.nextInt();
            
            switch (selec){
            
                case 1:
                 introducirNombres(arr);
                    break;
                case 2:
                 mostrarNombres(arr);   
                    break;
                case 3:
                 ordenSeleccionAZ(arr);
                    break;
                case 4:
                 ordSeleccionZA(arr);  
                    break;
                    
            }
        }while(selec != 5);
    }
    public static void introducirNombres(String arr[]){
       Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de nombres:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nombre " + i + ": ");
          arr[i] = input.nextLine();
        }
    }
    public static void mostrarNombres(String arr []){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nombre en la posicion [" + i + "]: " + arr[i]);
            
        }
    }
         public static void intercambiar(String arr[], int i, int j) {
 String aux = arr[i];
 arr[i] = arr[j];
 arr[j] = aux;
 }
   
   public static void ordenSeleccionAZ(String arr[]) {
 int indiceMenor, i, j, t;
 t = arr.length;
 String enter;
 int inter = 0;
       System.out.println("----------------------------------------------");
       System.out.println("Datos como se introdujeron: ");
       for (int k = 0; k < arr.length; k++) {
           System.out.println("Nombre " + k + ": " + arr[k]);
           
       }
 System.out.println("Entrando al metodo de Seleccion");
 enter = input.nextLine();
 for (i = 0; i < t - 1; i++) {
 indiceMenor = i;
 for (j = i + 1; j < t; j++) {
 if (arr[j].compareToIgnoreCase(arr[indiceMenor]) < 0) {
 indiceMenor = j;
 }
 }
 if (i != indiceMenor) {
 intercambiar(arr, i, indiceMenor);
 inter ++;
    }
   }
       System.out.println("----------------------------------------------");
       System.out.println("Datos ordenados: ");
       for (int k = 0; k < arr.length; k++) {
           System.out.println("Nombre " + k + ": " + arr[k]);
           
       }
 }
    public static void ordSeleccionZA(String arr[]) {
 int indiceMayor, i, j, t;
 t = arr.length;
 String enter;
 int inter = 0;
        System.out.println("----------------------------------------------");
       System.out.println("Datos como se introdujeron: ");
       for (int k = 0; k < arr.length; k++) {
           System.out.println("Nombre " + k + ": " + arr[k]);
           
       }
 System.out.println("Entrando al metodo de Seleccion");
 for (i = 0; i < t - 1; i++) {
 indiceMayor = i;
 for (j = i + 1; j < t; j++) {
 if (arr[j].compareToIgnoreCase(arr[indiceMayor]) > 0) {
 indiceMayor = j;
 }
 }
 if (i != indiceMayor) {
 intercambiar(arr, i, indiceMayor);
    }
   }
        System.out.println("----------------------------------------------");
       System.out.println("Datos como se introdujeron: ");
       for (int k = 0; k < arr.length; k++) {
           System.out.println("Nombre " + k + ": " + arr[k]);
           
       }
 }
}
