/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Practica1_EDD_S;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica1_EDD_S {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner (System.in);
        
        //VARIABLES       
 int i, valor;
 int a;
 int pos = 0, neg = 0; //contadores de los números positivos y negativos
 double sumpos = 0, sumneg = 0;//acumuladores para las sumas de positivos y negativos

 //MENU DEL PROGRAMA
 System.out.println("-----------CALCULADORA DE MEDIA------------");
        System.out.println("Defina el tamaño del arreglo");
        a = input.nextInt();
         int[] numerospos = new int[a];
         int[] numerosneg = new int[a];
        
         
    System.out.println("----------------------------------------");
        System.out.print("1.Entrada de datos del vector" + "\n" +                
                "2.Mostrar datos del vector" + "\n" +
                "3.Calcular promedio numeros positivos" + "\n" +
                "4.Calcular promedio numeros negativos" +"\n" +
                "5.Salir" + "\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt(); 
     
        do{
        int dato = 0;
        if(valor == 1){
            System.out.println("++++++++++++++++++Entrada de datos del vector++++++++++++++++");
            System.out.println("1.Positivos");
            System.out.println("2.Negativos");
            System.out.println("3.Salir");
            dato = input.nextInt();
            
            if(dato == 1){
                System.out.println("+++++++++++++++++++++++++++++++++++");
                for (i = 0; i < a; i++) {
                    System.out.print("Introduce el valor del arreglo " + i + " : ");
                    numerospos[i] = input.nextInt();
                }
                            for (i = 0; i < a; i++) {
            if (numerospos[i] > 0){ //sumar positivos
            sumpos += numerospos[i]; 
            pos++;
                }
              }
            }
            
            if(dato == 2){
            System.out.println("+++++++++++++++++++++++++++++++++++");
                for (i = 0; i < a; i++) {
                    System.out.print("Introduce el valor del arreglo " + i + " : ");
                    numerosneg[i] = input.nextInt();
                  }
                for(i = 0; i < a; i++){
                if(numerosneg[i] < 0){
                sumneg += numerosneg[i];
                neg++;
                   }                    
                 }
                }
            
            if(dato == 3){
                System.out.println("----------------------------------------");
        System.out.print("1.Entrada de datos del vector" + "\n" +                
                "2.Mostrar datos del vector" + "\n" +
                "3.Calcular promedio numeros positivos" + "\n" +
                "4.Calcular promedio numeros negativos" +"\n" +
                "5.Salir" + "\n" +
                "-------------------------------------" + "\n" +
                " ");
                valor = input.nextInt(); 
            }
        
        }
        
            
        if(valor == 2){
        
                    System.out.println("++++++++++++++++++Mostrar datos del vector++++++++++++++++");
            System.out.println("1.Positivos");
            System.out.println("2.Negativos");
            System.out.println("3.Salir");
            dato = input.nextInt();
        
            if(dato == 1){
                for (i = 0; i < a; i++) {
                    System.out.println("Los valores de " + i + " : " + numerospos[i]);
                }
            }
            if(dato == 2){
                for (i = 0; i < a; i++) {
                    System.out.println("Los valores de " + i + " : " + numerosneg[i]);
                }
        }
            if(dato == 3){
                    if(dato == 3){
                System.out.println("----------------------------------------");
        System.out.print("1.Entrada de datos del vector" + "\n" +                
                "2.Mostrar datos del vector" + "\n" +
                "3.Calcular promedio numeros positivos" + "\n" +
                "4.Calcular promedio numeros negativos" +"\n" +
                "5.Salir" + "\n" +
                "-------------------------------------" + "\n" +
                " ");
                valor = input.nextInt(); 
            }
        }
        }
        
        if(valor == 3){
            System.out.println("-----------------------------------");
            System.out.println("Promedio del los positivos: " + sumpos / pos);
                            System.out.println("----------------------------------------");
        System.out.print("1.Entrada de datos del vector" + "\n" +                
                "2.Mostrar datos del vector" + "\n" +
                "3.Calcular promedio numeros positivos" + "\n" +
                "4.Calcular promedio numeros negativos" +"\n" +
                "5.Salir" + "\n" +
                "-------------------------------------" + "\n" +
                " ");
                valor = input.nextInt();

        }
        
        if(valor == 4){
            System.out.println("--------------------------------------");
            System.out.println("Promedio del los positivos: " + ((-1)*(sumneg)) / neg);
                            System.out.println("----------------------------------------");
        System.out.print("1.Entrada de datos del vector" + "\n" +                
                "2.Mostrar datos del vector" + "\n" +
                "3.Calcular promedio numeros positivos" + "\n" +
                "4.Calcular promedio numeros negativos" +"\n" +
                "5.Salir" + "\n" +
                "-------------------------------------" + "\n" +
                " ");
                valor = input.nextInt();
        }
        
        if(valor > 5 && valor < 0){
            System.out.println("Introduzca una opcion valida");
            System.out.println("---------------------------");
            valor = input.nextInt();
        }
       }while(valor != 5);
        
  
    }
}

