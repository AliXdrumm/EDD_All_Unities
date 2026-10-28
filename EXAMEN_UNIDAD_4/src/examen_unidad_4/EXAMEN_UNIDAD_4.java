/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_unidad_4;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EXAMEN_UNIDAD_4 {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner (System.in);
    public static int num = 10;
    public static int arr [];
    
    public static void main(String[] args) {
        // TODO code application logic here
        arr = new int [num];
        Menu();
    }
    public static void Menu(){
    int valo;
    do{
        System.out.println("----------------SISTEMA DE NUMEROS------------------");
        System.out.println("1.-Dar numeros al vector");
        System.out.println("2.-Mostrar numeros");
        System.out.println("3.-Ordenar numeros");
        System.out.println("4.Buscar numero por ordenacion binaria");
        System.out.println("5.Salir");
        System.out.println("-------------------------------------------------------");
        valo = input.nextInt();
        switch (valo){
            case 1:
                meterDatos();
                break;
            case 2:
                verDatos();
                break;
            case 3:
                ordSeleccion(arr);
                break;
            case 4:
                busquedaBinaria(arr);
                break;
        }
    }while(valo != 5);
    }
    
    public static void meterDatos() {
 for (int i = 0; i < num; i++) {
arr[i] = (int)(Math.random() * 100) + 1;
 }
 }
 
 public static void verDatos() {
 for (int i = 0; i < num; i++) {
 System.out.print("valor del dato[" + i + "]: ");
 System.out.println(arr[i]);
 }
 }
 
 public static void intercambios(int[] arr, int i, int j) {
 int aux = arr[i];
 arr[i] = arr[j];
 arr[j] = aux;
 }
 public static void ordSeleccion(int arr[]) {
 int indiceMenor, i, j, t;
 t = arr.length;
 String enter;
 int inter = 0;
 for (i = 0; i < t - 1; i++) {
 indiceMenor = i;
 for (j = i + 1; j < t; j++) {
 if (arr[j] < arr[indiceMenor]) {
 indiceMenor = j;
 }
 }
 if (i != indiceMenor) {
 intercambios(arr, i, indiceMenor);
 inter ++;
    }
   }
 System.out.println("----------------------------------------------");
 }
  public static int bBinario(int arr[], int clave) {
 int central, bajo, alto;
 int valorCentral;
 bajo = 0;
 alto = arr.length - 1;
 while (bajo <= alto) {
 central = (bajo + alto) / 2; 
 valorCentral = arr[central]; 
 if (clave == valorCentral) {
 return central; 
 } else if (clave < valorCentral) {
 alto = central - 1; 
 } else {
 bajo = central + 1; 
 }
 }
 return -1;
 }
 public static void busquedaBinaria(int arr[]) {
 int nb, encontrado = -1;
 int recorridos = 0;
 System.out.println("Introduce el numero que va a buscar:");
 nb = input.nextInt();
 
 int central, bajo = 0, alto = arr.length - 1;
 
 encontrado = bBinario(arr, nb);
 while (bajo <= alto) {
        recorridos++;
        central = (bajo + alto) / 2;
        int valorCentral = arr[central];
        
        if (nb == valorCentral) {
            encontrado = central;
            break;
        } else if (nb < valorCentral) {
            alto = central - 1;
        } else {
            bajo = central + 1;
        }
    }
 if (encontrado == -1) {
 System.out.println("El numero " + nb + " no existe en la lista");
 } else {
 System.out.println("El numero esta en la posicion [" + encontrado + "]: " + arr[encontrado]);       
 }
 }
}
