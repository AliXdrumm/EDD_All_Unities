/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package eva1_1_arreglo_numeros;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class EVA1_1_Arreglo_Numeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
 //VARIABLES       
 int i, valor;
 int pos = 0, neg = 0, pos1 = 0, neg1 = 0; //contadores de los números positivos y negativos
 int[] numeros = new int[10];
 int[] numeros1 = new int[10];
 double sumaPos = 0, sumaNeg = 0, sumaPos1 = 0, sumaNeg1 = 0;//acumuladores para las sumas de positivos y negativos

 //MENU DEL PROGRAMA
    System.out.println("-----------CALCULADORA DE MEDIA------------");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
 
 do{  
 //ACCION CON EL BOTON 1
 if(valor == 1){
     
     int seleccion;
     System.out.println("1.Menor a mayor" + "\n" +
                        "2.Mayor a menor");
     
    seleccion = input.nextInt();
    //MENOR A MAYOR
    if(seleccion == 1){
        System.out.println("++++++++++++++++++++++++++++++++++++");
     System.out.println("Lectura de los elementos del array: ");
 for (i = 0; i < 10; i++) {
 System.out.print("numeros[" + i + "]= ");
 numeros[i]=input.nextInt();
    }
 
 
 //recorrer el array para sumar por separado los números positivos
 // y los negativos
 for (i = 0; i < 10; i++) {
 if (numeros[i] > 0){ //sumar positivos
 sumaPos += numeros[i];
 pos++;
 } else if (numeros[i] < 0){ //sumar negativos
 sumaNeg += numeros[i];
 neg++;
 }
 }
 
 System.out.println("----------------------------------"); 
             System.out.println("Que otra operacion quieres hacer?");
              System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
    }
    
    //MAYOR A MENOR
    if(seleccion == 2){
        System.out.println("++++++++++++++++++++++++++++++++++++");
        System.out.println("Lectura de los elementos del array: ");
 for (i = 9; i >= 0; i--) {
 System.out.print("numeros[" + i + "]= ");
 numeros1[i]=input.nextInt();
    }
 
 for (i = 9; i >= 0; i--) {
 if (numeros1[i] > 0){ //sumar positivos
 sumaPos1 += numeros1[i];
 pos1++;
 } else if (numeros1[i] < 0){ //sumar negativos
 sumaNeg1 += numeros1[i];
 neg1++;
 }
 }
 
 System.out.println("----------------------------------"); 
              System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
    }

 
 }
 
 
 //ACCION CON EL BOTON 2
 if(valor == 2){
 int seleccion;
     System.out.println("Mostrar los datos de:" + "\n" +
                        "1.Menor a mayor" + "\n" +
                        "2.Mayor a menor");
     seleccion = input.nextInt();
     
     //MENOR A MAYOR
     if(seleccion == 1){
     //Calcular y mostrar las medias
     System.out.println("++++++++++++++++++++++++++++++++++++");
 if (pos != 0) {
 System.out.println("Media de los valores positivos: " + sumaPos / pos);
 } else {
 System.out.println("No ha introducido numeros positivos");
 }
 if (neg != 0) {
 System.out.println("Media de los valores negativos: " + sumaNeg / neg);
 } else {
 System.out.println("No ha introducido numeros negativos");
 }
  if (pos == 0) {
 System.out.println("Operacion invalida ");
 }
  
         System.out.println("----------------------------------");               
  System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
     }
     
     //MAYOR A MENOR
     if(seleccion == 2){
     //Calcular y mostrar las medias
     System.out.println("++++++++++++++++++++++++++++++++++++");
 if (pos1 != 0) {
 System.out.println("Media de los valores positivos: " + sumaPos1 / pos1);
 } else {
 System.out.println("No ha introducido numeros positivos");
 }
 if (neg1 != 0) {
 System.out.println("Media de los valores negativos: " + sumaNeg1 / neg1);
 } else {
 System.out.println("No ha introducido numeros negativos");
 }
 
 System.out.println("----------------------------------"); 
               System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
     }

 }
 
  //ACCION CON EL BOTON 3
 if(valor == 3){
     
     int seleccion;
     System.out.println("Mostrar datos de:" + "\n" +
                        "1.Menor a mayor" + "\n" +
                        "2.Mayor a menor");
     seleccion = input.nextInt();
     
     //ACCION 1
     if(seleccion == 1){
         for (int j = 0; j < 10; j++) {
             System.out.println("Valor " + j + ": " + numeros[j]);   
         }
         
         System.out.println("----------------------------------"); 
                       System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
     }
     
     //ACCION 2
     if(seleccion == 2){
         for (int j = 9; j >= 0; j--) {
             System.out.println("Valor " + j + ": " + numeros1[j]);   
         }
         
         System.out.println("----------------------------------"); 
                       System.out.println("Que otra operacion quieres hacer?");
        System.out.print("1.Introducir/modificar datos" + "\n" +                
                "2.Calcular media" + "\n" +
                "3.Mostrar datos" + "\n" +
                "4. Salir" +"\n" +
                "-------------------------------------" + "\n" +
                " ");
 valor = input.nextInt();
     }
     
 }
     
 //FIN DEL PROGRAMA
 }while(valor != 4);

    }
    
}