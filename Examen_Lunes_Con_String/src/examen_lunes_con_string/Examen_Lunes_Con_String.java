/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package examen_lunes_con_string;

import java.time.LocalTime;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Examen_Lunes_Con_String {

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
 System.out.println("8.-Busqueda secuencial");
 System.out.println("9.-Busqueda binaria");
 System.out.println("10.-Busqueda HASH");
 System.out.println("11.-Salir");
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
           case 8:
               bsecuencial(arr);
                break;
            case 9:
               bbinaria(arr);
                break;
            case 10:
               menu_hash(arr);
                break;
       }
       
       }while(valor != 11);
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
 public static int buscarSecuencial(String a[], String nb) {
    int existe = -1;
    for (int i = 0; i < a.length; i++) {
        if (a[i] != null && a[i].equals(nb)) {
            existe = i;
            break;
        }
    }
    return existe;
}

public static void bsecuencial(String a[]) {
    String nb;
    int encontrado = -1;
    int recorridos = 0;
    System.out.println("Nombre a buscar:");
    input.nextLine(); // Limpiar buffer
    nb = input.nextLine();
    
    for (int i = 0; i < a.length; i++) {
        recorridos++;
        if (a[i] != null && a[i].equals(nb)) {
            encontrado = i;
            break; 
        }
    }
    
    if (encontrado == -1) {
        System.out.println("El nombre no existe en la lista");
    } else {
        System.out.println("El nombre esta en la posicion [" + encontrado + "]: " + a[encontrado]);
    }
    System.out.println("Veces que se recorrio el arreglo: " + recorridos);
}

public static int buscarBinaria(String a[], String clave) {
    int central, bajo, alto;
    String valorCentral;
    bajo = 0;
    alto = a.length - 1;
    while (bajo <= alto) {
        central = (bajo + alto) / 2; 
        valorCentral = a[central]; 
        if (valorCentral == null) {
            bajo = central + 1;
            continue;
        }
        int comparacion = clave.compareTo(valorCentral);
        if (comparacion == 0) {
            return central; 
        } else if (comparacion < 0) {
            alto = central - 1; 
        } else {
            bajo = central + 1; 
        }
    }
    return -1;
}

public static void bbinaria(String a[]) {
    String nb;
    int encontrado = -1;
    int recorridos = 0;
    System.out.println("Nombre a buscar:");
    input.nextLine(); // Limpiar buffer
    nb = input.nextLine();
    
    encontrado = buscarBinaria(a, nb);
    int bajo = 0, alto = a.length - 1;
    while (bajo <= alto) {
        recorridos++;
        int central = (bajo + alto) / 2;
        String valorCentral = a[central];
        
        if (valorCentral == null) {
            bajo = central + 1;
            continue;
        }
        
        int comparacion = nb.compareTo(valorCentral);
        if (comparacion == 0) {
            encontrado = central;
            break;
        } else if (comparacion < 0) {
            alto = central - 1;
        } else {
            bajo = central + 1;
        }
    }
    
    if (encontrado == -1) {
        System.out.println("El nombre no existe en la lista");
    } else {
        System.out.println("El nombre esta en la posicion [" + encontrado + "]: " + a[encontrado]);        
    }
    System.out.println("Veces que se recorrio el arreglo: " + recorridos);
}
public static void funcionHash(String valor, String[] vector) {
    int n = vector.length;
    int indiceArreglo = Math.abs(valor.hashCode()) % n;
    System.out.println("El indice es " + indiceArreglo + " para el valor " + valor);
    while (vector[indiceArreglo] != null) {
        indiceArreglo++;
        System.out.println("Ocurrio colision en el indice " + (indiceArreglo - 1) + ", cambiar a posicion " + indiceArreglo);
        indiceArreglo %= n;
    }
    vector[indiceArreglo] = valor;
}

public static int buscarHash(String valor, String[] vector) {
    int n = vector.length;
    int indiceArreglo = Math.abs(valor.hashCode()) % n;
    int contador = 0;
    while (vector[indiceArreglo] != null) {
        if (vector[indiceArreglo].equals(valor)) {
            System.out.println("El elemento " + valor + " fue encontrado en el indice " + indiceArreglo);
            return indiceArreglo;
        }
        indiceArreglo++;
        indiceArreglo %= n;
        contador++;
        if (contador > n) {
            break;
        }
    }
    return -1;
}

public static void buscarH(String[] vector) {
    String valor;
    System.out.print("Dame dato a buscar: ");
    input.nextLine(); // Limpiar buffer
    valor = input.nextLine();
    int encontrado = buscarHash(valor, vector);
    if (encontrado == -1) {
        System.out.println("Elemento no se encuentra");
    } else {
        System.out.println("Elemento esta en la posicion " + encontrado);
    }
}

public static void entradaHash(String[] vector) {
    int n = vector.length;
    for (int i = 0; i < n; i++) {
        System.out.print("Dame dato[" + (i + 1) + "]: ");
        input.nextLine(); // Limpiar buffer
        String valor = input.nextLine();
        funcionHash(valor, vector);
    }
}

public static void mostrarHash(String[] vector) {
    int n = vector.length;
    for(int j = 0; j < 71; j++){
        System.out.print("-");
    }
    System.out.println();
    for(int j = 0; j < n; j++){
        System.out.format("| %3s ", j);
    }
    System.out.println("|");
    for(int nline = 0; nline < 71; nline++){
        System.out.print("-");
    }
    System.out.println();
    for(int j = 0; j < n; j++){
        if(vector[j] == null){
            System.out.print("|     ");
        } else {
            System.out.format("| %3s ", vector[j]);
        }
    }
    System.out.println("|");
    for(int j = 0; j < 71; j++){
        System.out.print("-");
    }
    System.out.println();
}

public static void menu_hash(String[] vector) {
    java.util.Arrays.fill(vector, null); // Inicializamos con null para espacios vacíos
    int op;
    do {
        System.out.println("M E N U METODO HASH");
        System.out.println("1.- Entrada datos al vector");
        System.out.println("2.- Mostrar los datos del vector");
        System.out.println("3.- Buscar un valor en el vector");
        System.out.println("4.- Salir");
        System.out.println("Opcion --> ");
        op = input.nextInt();
        switch (op) {
            case 1:
                entradaHash(vector);
                break;
            case 2:
                mostrarHash(vector);
                break;
            case 3:
                buscarH(vector);
                break;
        }
    } while (op != 4);
  }  
}
