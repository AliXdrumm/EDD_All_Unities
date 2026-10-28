/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica6_edd_a_ordenacion;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Practica6_EDD_A_Ordenacion {

    /**
     * @param args the command line arguments
     */
    public static int[] datos;
public static int n = 100;
public static int M = 1000000;
public static int N = 6;
public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
     datos = new int[N]; // crear el vector de enteros
     menu();
    }
    
 public static void menu() {
 int op;
 do {
 System.out.println("M E N U METODOD DE ORDDENACION");
 System.out.println("1.-Entrada datos al vector");
 System.out.println("2.-Mostrar los datos del vector");
 System.out.println("3.-Ordenacion por burbuja(Intercambio)");
 System.out.println("4.-Ordenacion por Seleccion");
 System.out.println("5.-Ordenacion por Insercion");
 System.out.println("6.-Ordenacion por Shell");
 System.out.println("7.-Ordenacion por QuickSort");
 System.out.println("10.-Salir");
 System.out.println("Opcion--> ");
 op = sc.nextInt();
 switch (op) {
 case 1:
 entradaDatos(datos);/*No tiene caso, es introducir los datos al vector, osea tipo Valor[0]: 10, Valor[1]: 2........
 aunqur, también está la opcion de los valores random, cualquiera de las dos está bien
 */
 break;
 case 2:
 mostrarVector(datos);/*Solo muestra los datos ordenados del vector con un print,
 osea pues muestra Valor[0]: 10, Valor[1]: 2........
 */
 break;
 case 3:
/*Aquí es importante, es el algoritmo donde según que tan grande o pequeño sen los valores de las posiciones
     se reacomodarán, de menor en la posición 1 (osea Valor[0]: 2) y dejandon el mas grande al último (Valor[n]: 10)
     la variable "inter" es para ver cuantos intercambios se hacen
     */
 ordItercambio(datos);
 break;
 case 4:
 ordSeleccion(datos);//
 break;
 case 5:
 ordInsercion(datos);//
 break;
 case 6:
 ordenacionShell(datos);//
 break;
 case 7:
 quicksort(datos);//
 break;
 case 10:
 break;
 }
}while(op != 10);
 }
 // para pedir los datos del vector
public static void entradaDatos(int[] vector) {
 int i = 0;
 /*for (i = 0; i < vector.length; i++) {
 System.out.print("dame dato["+i+"]: ");
 vector[i]=sc.nextInt();
 }*/
 //O podemos poner aquí para valores random:
 for (i = 0; i < N; i++) {
vector[i] = (int)(Math.random() * 100) + 1;
 }
 }

//para mostrar los datos de un vector
 public static void mostrarVector(int[] vector) {
 int i = 0;
 for (i = 0; i < N; i++) {
 System.out.print("valor del dato[" + i + "]: ");
 System.out.println(vector[i]);
 }
 }
 
 public static void intercambiar(int[] a, int i, int j) {
 int aux = a[i];//Igual a lo que esté en el arreglo en la posición i, osea al iniciar es 10, osea aux = a[i] = 10
 a[i] = a[j];//son la comparación del los valores de a[i] y a[j]
 a[j] = aux;//compara los valores eh intercambia los valores, incrementando j en las posiciones que tenga
 }
 
 public static void ordItercambio(int[] a) {
 int i, j;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = sc.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
     //Obtenemos la hora del sistema, osea de la hora actual de la PC
 for (i = 0; i < a.length - 1; i++) {
 for (j = i + 1; j < a.length; j++) {
 if (a[i] > a[j]) {
 intercambiar(a, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
     System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
 }
public static void ordSeleccion(int a[]) {
    //La cantidad máxima de intercambios que se harían serían n-1, osea, el tamaño del arreglo menos 1
 int indiceMenor, i, j, t;
 t = a.length;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = sc.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 for (i = 0; i < t - 1; i++) {
 indiceMenor = i;
 for (j = i + 1; j < t; j++) {
 if (a[j] < a[indiceMenor]) {
 indiceMenor = j;
 }
 }
 if (i != indiceMenor) {
 intercambiar(a, i, indiceMenor);
 inter ++;
    }
   }
      System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
 }
public static void ordInsercion(int[] a) {
System.out.println("Entrando al metodo de insercion enter para continuar");
String enter;
 enter = sc.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
 int i, j;
 int inter = 0;
 int aux;
 for (i = 1; i < a.length; i++) {
 /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
 posicion correcta del elemento destino*/
 j = i;
 aux = a[i];
// se localiza el punto de inserción explorando hacia abajo
 while (j > 0 && aux < a[j - 1]) {
// desplazar elementos hacia arriba para hacer espacio
 a[j] = a[j - 1];
 j--;
 inter ++;
 }
 a[j] = aux;
 }
      System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
}
public static void ordenacionShell(int a[]) {
 int intervalo, i, j, k, inter = 0;
  n = a.length;
 System.out.println("Entrando al metodo Shell enter para continuar");
String enter;
 enter = sc.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 intervalo = n / 2;
 while (intervalo > 0) {
 for (i = intervalo; i < n; i++) {
 j = i - intervalo;
 while (j >= 0) {
 k = j + intervalo;
 if (a[j] <= a[k]) {
 j = -1; // par de elementos ordenado
 } else {
 intercambiar(a, j, k);
 j -= intervalo;
 }
 }
 }
 intervalo = intervalo / 2;
 inter++;
 }
  System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
 }
public static void quicksort(int a[]) {
 quicksort(a, 0, a.length - 1);
 }
 private static void quicksort(int a[], int primero, int ultimo) {
 int i, j, central, inter = 0;
 double pivote;
 System.out.println("Entrando al metodo de quicksort enter para continuar");
String enter;
 enter = sc.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 central = (primero + ultimo) / 2;
 pivote = a[central];
 i = primero; 
 j = ultimo;
 do {
 while (a[i] < pivote) {
 i++;
 }
 while (a[j] > pivote) {
 j--;
 }
 if (i <= j) {
 intercambiar(a, i, j);
 i++;
 j--;
 }
 } while (i <= j);
 if (primero < j) {
 quicksort(a, primero, j); // mismo proceso con sublista izqda
 }
 if (i < ultimo) {
 quicksort(a, i, ultimo); // mismo proceso con sublista drcha
 }
 System.out.println("Numero de intercambios: " + inter);
 hora = LocalTime.now();
 //La hora en la que finalizó el código de hacer los intercambios
 System.out.println("La hora del sistema actual es: " + hora);
 }
}