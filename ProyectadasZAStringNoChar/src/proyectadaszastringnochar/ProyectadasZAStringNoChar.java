/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectadaszastringnochar;
import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class ProyectadasZAStringNoChar {

    /**
     * @param args the command line arguments
     */
    public static Scanner input = new Scanner(System.in);
    public static String arr [];
    public static int dat = 3;
    public static void main(String[] args) {
        // TODO code application logic here
       arr = new String[dat];
       int valor;
       
       do{
       System.out.println("M E N U METODOD DE ORDDENACION POR STRING");
 System.out.println("1.-Entrada datos al vector");
 System.out.println("2.-Mostrar los datos del vector");
 System.out.println("3.-Ordenacion por burbuja(Intercambio)");
 System.out.println("4.-Ordenacion por Seleccion");
 System.out.println("5.-Ordenacion por Insercion");
 System.out.println("6.-Ordenacion por Shell");
 System.out.println("7.-Ordenacion por QuickSort");
 System.out.println("0.-Salir");
       valor = input.nextInt();
       switch (valor){
           case 1:
             meterDatos(arr);
       break;
       
           case 2:
           mostrarDatos(arr);
           break;
           
           case 3:
               ordItercambio(arr);
               break;
               
           case 4:
               ordSeleccion(arr);
               break;
               
           case 5:
               ordInsercion(arr);
               break;
               
           case 6:
               ordenacionShell(arr);
               break;
               
           case 7:
               quicksort(arr);
               break;
       }
       
       }while(valor != 0);
    }
    public static void meterDatos(String arr[]){
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        
        System.out.println("Introduzca la cantidad de nombres:");
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Nombre " + i + ": ");
          arr[i] = input.nextLine();
        }
        /*
        String[] nombresPrueba = {"Carlos", "Alan", "Estefany"};
        for(int i = 0; i < arr.length; i++){
           arr[i] = nombresPrueba[i % nombresPrueba.length];
        }*/
        
    
    }
    
    public static void mostrarDatos(String arr[]){
    for (int i = 0; i < arr.length; i++) {
            System.out.println("El nombre " + "[" + i + "] " + "es: " + arr[i]);      
        }
    
    }
    
     public static void intercambiar(String arr[], int i, int j) {
 String aux = arr[i];//Igual a lo que esté en el arreglo en la posición i, osea al iniciar es 10, osea aux = a[i] = 10
 arr[i] = arr[j];//son la comparación del los valores de a[i] y a[j]
 arr[j] = aux;//compara los valores eh intercambia los valores, incrementando j en las posiciones que tenga
 }
 
 public static void ordItercambio(String [] arr) {
 int i, j;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
     //Obtenemos la hora del sistema, osea de la hora actual de la PC
 for (i = 0; i < arr.length - 1; i++) {
 for (j = i + 1; j < arr.length; j++) {
 if (arr[i].compareTo(arr[j]) < 0){
 intercambiar(arr, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
     System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
 }
 public static void ordSeleccion(String arr[]) {
    //La cantidad máxima de intercambios que se harían serían n-1, osea, el tamaño del arreglo menos 1
 int indiceMayor, i, j, t;
 t = arr.length;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 for (i = 0; i < t - 1; i++) {
 indiceMayor = i;
 for (j = i + 1; j < t; j++) {
 if (arr[j].compareTo(arr[indiceMayor]) > 0) {
 indiceMayor = j;
 }
 }
 if (i != indiceMayor) {
 intercambiar(arr, i, indiceMayor);
 inter ++;
    }
   }
      System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
 }
 
 public static void ordInsercion(String[] arr) {
System.out.println("Entrando al metodo de insercion enter para continuar");
String enter;
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
 int i, j;
 int inter = 0;
 String aux;
 for (i = 1; i < arr.length; i++) {
 /* indice j es para explorar la sublista a[i-1]..a[0] buscando la
 posicion correcta del elemento destino*/
 j = i;
 aux = arr[i];
// se localiza el punto de inserción explorando hacia abajo
 while (j > 0 && aux.compareTo(arr[j - 1]) > 0) {
// desplazar elementos hacia arriba para hacer espacio
 arr[j] = arr[j - 1];
 j--;
 inter ++;
 }
 arr[j] = aux;
 }
      System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
}
 public static void ordenacionShell(String arr[]) {
 int intervalo, i, j, k, inter = 0;
  dat = arr.length;
 System.out.println("Entrando al metodo Shell enter para continuar");
String enter;
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 intervalo = dat / 2;
 while (intervalo > 0) {
 for (i = intervalo; i < dat; i++) {
 j = i - intervalo;
 while (j >= 0) {
 k = j + intervalo;
 if (arr[j].compareTo(arr[k]) >= 0) {
 j = -1; 
 } else {
 intercambiar(arr, j, k);
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
 public static void quicksort(String arr[]) {
 quicksortMostrado(arr, 0, arr.length - 1);
 }
 private static void quicksortMostrado(String arr[], int primero, int ultimo) {
 int i, j, central, inter = 0;
 String pivote;
 System.out.println("Entrando al metodo de quicksort enter para continuar");
String enter;
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
 System.out.println("La hora del sistema es: " + hora);
 central = (primero + ultimo) / 2;
 pivote = arr[central];
 i = primero; 
 j = ultimo;
 do {
 while (arr[i].compareTo(pivote) > 0) {
 i++;
 }
 while (arr[j].compareTo(pivote) < 0) {
 j--;
 }
 if (i <= j) {
 intercambiar(arr, i, j);
 i++;
 j--;
 }
 } while (i <= j);
 
 if (primero < j) {
     
 quicksortMostrado(arr, primero, j); // mismo proceso con sublista izqda
 }
 if (i < ultimo) {
 quicksortMostrado(arr, i, ultimo); // mismo proceso con sublista drcha
 }
 System.out.println("Numero de intercambios: " + inter);
 hora = LocalTime.now();
 //La hora en la que finalizó el código de hacer los intercambios
 System.out.println("La hora del sistema actual es: " + hora);
 }
}
