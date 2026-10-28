/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_8_fila;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica_8_Fila {
    
//Practica de pila mediante arreglos//
    
    /**
     * @param args the command line arguments
     */
     // pila1 es el objeto de la clase Pilalineal 
    public static PilaLinea pila1; 
   public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
           // se crea el objeto pila1 de la clase Pilalineal 
        pila1 = new PilaLinea(); 
        menu(); 
    }
    
       // procedimiento para presentar menu de operaciones    
    public static void menu() throws Exception { 
        int op; 
        do { 
            System.out.println("M E N U  PILAS"); 
            System.out.println("1.-INSERTAR UN ELEMENTO EN LA PILA"); 
            System.out.println("2.-SACAR UN ELEMENTO DE LA PILA"); 
            System.out.println("3.-MOSTRAR PILA"); 
            System.out.println("4.-SALIR"); 
            System.out.print("Opcion--> "); 
            op = sc.nextInt(); 
            switch (op) { 
                case 1: 
                    insertar(); 
                    break; 
                case 2: 
                    retirar(); 
                    break; 
                case 3: 
                    mostrarPila(); 
                    break; 
            } 
        } while (op != 4); 
    } 
 
    public static void insertar() throws Exception { 
        int v; 
        System.out.print("Dame el valor insertar en la pila: "); 
        v = sc.nextInt(); 
        pila1.insertar(v); 
    } 
 
    public static void retirar() throws Exception { 
        int v; 
        v = pila1.quitar(); 
        System.out.println("elemento retirado de la pila==> " + v); 
    } 
 
    public static void mostrarPila() { 
        System.out.println("MOSTRANDO LA PILA"); 
        pila1.mostrar(); 
    } 
}
