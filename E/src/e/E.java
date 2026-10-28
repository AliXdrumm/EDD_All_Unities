/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package e;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class E {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner (System.in);
    public static String arr [];
    public static int valor = 10;
    public static void main(String[] args) {
        // TODO code application logic here
        arr = new String [valor];
        int dato;
        
        do{
        System.out.println("----------------MENU DE ORDENACION----------------");    
            System.out.println("1.Introducir datos");
            System.out.println("2.Mostrar datos");
            System.out.println("3.Ordenar los datos (A-Z)");
            System.out.println("4.Ordenar los datos (Z-A)");
            System.out.println("0.Salir");
        dato = input.nextInt();
        
        switch(dato){
            case 1:
            introducirDatos();   
                break;
            case 2:
            mostrarDatos();
                break;
            case 3:
            InterBurbujaAZ(arr);
                break;
            case 4:
            InterBurbujaZA(arr);    
                break;
        }
        
        }while(dato != 0);
    }
    public static void introducirDatos(){
        String [] nombres = {"Alan", "Aaron", "Valeria","Carlos","Noche","Kevin","Estefany", "Villa", "Rafa", "Cagarlos"};
        for (int i = 0; i < arr.length; i++) {
            arr[i] = nombres[i % nombres.length];
        }
    }
    public static void mostrarDatos(){
        for (int i = 0; i < arr.length; i++) {
            System.out.println("Nombre [" + i + "]: " + arr[i]);   
        }
    }
    public static void intercambiar(String arr[], int i, int j){
    String aux = arr[i];
    arr[i] = arr[j];
    arr[j] = aux;
    }
    public static void InterBurbujaAZ(String arr[]){
    int i, j;
 int inter = 0;
         System.out.println("---------------------------------------------");
         System.out.println("Datos originalmente dados: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nombre ["+ k + "]: " + arr[k]);
            
        }
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 for (i = 0; i < arr.length - 1; i++) {
 for (j = i + 1; j < arr.length; j++) {
 if (arr[i].compareTo(arr[j]) > 0){
 intercambiar(arr, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
         System.out.println("Orden actual: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nombre ["+ k + "]: " + arr[k]);
            
        }
     System.out.println("Numero de intercambios: " + inter);
        System.out.println("------------------------------------------------");
    }
    public static void InterBurbujaZA(String arr[]){
    int i, j;
 int inter = 0;
        System.out.println("----------------------------------------------------");
        System.out.println("Datos originalmente dados: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nombre ["+ k + "]: " + arr[k]);
            
        }
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 for (i = 0; i < arr.length - 1; i++) {
 for (j = i + 1; j < arr.length; j++) {
 if (arr[i].compareTo(arr[j]) < 0){
 intercambiar(arr, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
        System.out.println("Orden actual: ");
        for (int k = 0; k < arr.length; k++) {
            System.out.println("Nombre ["+ k + "]: " + arr[k]);
            
        }
     System.out.println("Numero de intercambios: " + inter);
        System.out.println("----------------------------------------------------");
    }
    
}
