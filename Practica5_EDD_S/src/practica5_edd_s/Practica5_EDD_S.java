/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica5_edd_s;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica5_EDD_S {

    /**
     * @param args the command line arguments
     */
    public static Scanner sc = new Scanner (System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        // se declara el objeto lista de la clase Lista
 Lista lista;
 //se crea el objeto Lista
 lista = new Lista();
 // TODO code application logic here
 int op;
 do {
 System.out.println("MENU LISTA");
 System.out.println("1-INSERTAR UN ELEMENTO EN LA LISTA");
 System.out.println("2-MOSTRAR LISTA");
 System.out.println("3-ELIMINAR UN ELEMENTO");
 System.out.println("4-BUSCAR ELEMENTO");
 System.out.println("5-MODIFICAR");
 System.out.println("6-SALIR");
 System.out.print("Que opcion desea seleccionar:");
 op = sc.nextInt();
 switch (op) {
 case 1:
 System.out.println("Inserta un elemento");
 int el = sc.nextInt();
 lista.insertaOrden(el);
 break;
 case 2:
 System.out.println("Mostrando elementos de la lista");
 lista.MostrarLista();
 break;
 case 3:
 System.out.println("Que elemento quieres eliminar?");
 int ele = sc.nextInt();
 lista.eliminar(ele);
 break;
 case 4:
 System.out.println("Introduce elemento a buscar");
 int DatoB = sc.nextInt();
 lista.Buscar(DatoB);
 break;
 case 5:
 System.out.println("Que elemento quieres modificar");
 int DatoM = sc.nextInt();
 System.out.println("Introduce nuevo Dato");
 int DatoN = sc.nextInt();
 lista.Modifcar(DatoM, DatoN);
 break;
 }
 } while (op != 6);
  }
 }
/*Fija postfija, hacer un programa de la misma forma que este, solo que
debemos poner el algoritmo de que, si entra (a + b)/(c*f), tiene que entrar primero
( luego a, luego b y luego ), y luego el operador +, que muestre algo asi a,b,+......
*/