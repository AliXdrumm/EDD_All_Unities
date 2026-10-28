/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyecto_ajenda_telefonica;

import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Proyecto_Agenda_Telefonica {

    public static Scanner input = new Scanner(System.in);
    public static int capacidad = 1000000;
    public static String arrNomb [] = new String [capacidad];
    public static String arrNum [] = new String [capacidad];
    public static String arrApeP [] = new String [capacidad];
    public static String arrApeM [] = new String [capacidad];
    public static int tamannio = 0;
    public static void main(String[] args) {
        // TODO code application logic here
    menu();
    }
    public static void menu(){
            int val;
        do{
            System.out.println("----------------AGENDA TELEFONICA------------------");
            System.out.println("1.-Crear contacto nuevo");
            System.out.println("2.-Ver contactos");
            System.out.println("3.-Borrar contacto");
            System.out.println("4.-Buscar contacto por nombre");
            System.out.println("5.-Buscar contacto por numero");
            System.out.println("6.-Ordenar por apellido Paterno");
            System.out.println("7.-Ordenar por apellido Materno");
            System.out.println("8.-Ordenar por numero de teléfono");
            System.out.println("9.-Ordenar por nombre");
            System.out.println("10.-Modificar contacto");
            System.out.println("11.-Salir");
            System.out.println("---------------------------------------------");
            val = input.nextInt();
            input.nextLine();
            switch (val){
                case 1:
                introducirContactos();   
                break;
                case 2:
                mostrarContactos();
                break;
                case 3:
                borrarContacto();        
                break;
                case 4:
                buscarContactoNombre();
                break;
                case 5:
                buscarContactoNumero();
                break;
                case 6:
                ordSeleccionPaterno();
                break;
                case 7:
                ordSeleccionMaterno();
                break;
                case 8:
                ordenSeleccionNumero();    
                break;
                case 9:
                ordenSeleccionNombre();
                break;
                case 10:
                modificarContacto();
                 break;
            }       
        }while(val != 11);
    }
    public static void introducirContactos(){
     if(tamannio >= capacidad){
         System.out.println("--------------Agenda llena----------------");
     }else{
            System.out.print("Introduce el numero: ");
            String nuevoNum = input.nextLine();  
            System.out.print("Nombre del numero: ");
            String nuevoNomb = input.nextLine();
            System.out.print("Apellido paterno: ");
            String nuevoApeP = input.nextLine();
            System.out.print("Apellido materno: ");
            String nuevoApeM = input.nextLine();
        int i = tamannio - 1;

        while (i >= 0 && arrNomb[i].compareToIgnoreCase(nuevoNomb) > 0) {
            arrNomb[i + 1] = arrNomb[i];
            arrNum[i + 1] = arrNum[i];
            arrApeP[i + 1] = arrApeP[i];
            arrApeM[i + 1] = arrApeM[i];
            i--;
        }

        arrNomb[i + 1] = nuevoNomb;
        arrNum[i + 1] = nuevoNum;
        arrApeP[i + 1] = nuevoApeP;
        arrApeM[i + 1] = nuevoApeM;
        tamannio++;
     }
    } 
    public static void mostrarContactos(){
if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
        } else {
            System.out.println("----------------MIS CONTACTOS----------------");
            for (int i = 0; i < tamannio; i++) {
                    System.out.println("Contacto [" + (i + 1) + "]: " + arrNomb[i] + " " + arrApeP[i] + " " + arrApeM[i] + " | Numero: " + arrNum[i]);
                }
        }
    }
    public static void borrarContacto(){
    if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        mostrarContactos();
        System.out.print("Escriba el nombre del contacto que desea borrar: ");
        String borrar = input.nextLine();

        int pos = -1;
        // Búsqueda del contacto a eliminar
        for (int i = 0; i < tamannio; i++) {
            if (arrNomb[i].equalsIgnoreCase(borrar)) {
                pos = i;
                break;
            }
        }

        if (pos == -1) {
            System.out.println("-------------------Contacto no encontrado---------------------------");
        } else {
            // Desplazamiento de elementos a la izquierda para cubrir la posición eliminada
            for (int i = pos; i < tamannio - 1; i++) {
                arrNomb[i] = arrNomb[i + 1];
                arrNum[i] = arrNum[i + 1];
                arrApeP[i] = arrApeP[i + 1];
                arrApeM[i] = arrApeM[i + 1];
            }

            // Limpieza de la última posición utilizada
            arrNomb[tamannio - 1] = null;
            arrNum[tamannio - 1] = null;
            arrApeP[tamannio - 1] = null;
            arrApeM[tamannio - 1] = null;

            tamannio--;
            System.out.println("Contacto eliminado exitosamente.");
        }
    }
    public static void buscarContactoNombre(){
if (tamannio == 0) {
        System.out.println("--------------Sin contactos registrados--------------");
    }else{

    System.out.print("Nombre del contacto: ");
    String nombre = input.nextLine();

    int inicio = 0;
    int fin = tamannio - 1;
    boolean encontrado = false;

    while (inicio <= fin) {
        int medio = inicio + (fin - inicio) / 2;
        int comparacion = nombre.compareToIgnoreCase(arrNomb[medio]);

        if (comparacion == 0) {
    System.out.println("Contacto [" + (medio + 1) + "]: " + arrNomb[medio] + " " + arrApeP[medio] + " " + arrApeM[medio] + " | Numero: " + arrNum[medio]);
            encontrado = true;
            break;
        } else if (comparacion > 0) {
            inicio = medio + 1; // El nombre está en la mitad derecha
        } else {
            fin = medio - 1;    // El nombre está en la mitad izquierda
        }
    }

    if (!encontrado) {
        System.out.println("-------------------Contacto no existente---------------------------");
    }
      }
    }
  public static void intercambiar( int i, int j) {
String auxNomb = arrNomb[i];
        arrNomb[i] = arrNomb[j];
        arrNomb[j] = auxNomb;

        String auxNum = arrNum[i];
        arrNum[i] = arrNum[j];
        arrNum[j] = auxNum;

        String auxApeP = arrApeP[i];
        arrApeP[i] = arrApeP[j];
        arrApeP[j] = auxApeP;

        String auxApeM = arrApeM[i];
        arrApeM[i] = arrApeM[j];
        arrApeM[j] = auxApeM;
 }
  public static void buscarContactoNumero(){
  if (tamannio == 0) {
        System.out.println("--------------Sin contactos registrados--------------");
    }else{

    System.out.print("Numero del contacto: ");
    String numero = input.nextLine();

    int inicio = 0;
    int fin = tamannio - 1;
    boolean encontrado = false;

    while (inicio <= fin) {
        int medio = inicio + (fin - inicio) / 2;
        int comparacion = numero.compareToIgnoreCase(arrNum[medio]);

        if (comparacion == 0) {
System.out.println("Contacto [" + (medio + 1) + "]: " + arrNomb[medio] + " " + arrApeP[medio] + " " + arrApeM[medio] + " | Numero: " + arrNum[medio]);
            encontrado = true;
            break;
        } else if (comparacion > 0) {
            inicio = medio + 1; // El nombre está en la mitad derecha
        } else {
            fin = medio - 1;    // El nombre está en la mitad izquierda
        }
    }

    if (!encontrado) {
        System.out.println("-------------------Contacto no existente---------------------------");
    }
      }
  }
  public static void ordSeleccionPaterno() {
        if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        int min;
        // Ordenamiento por selección ajustado a 'tamannio'
        for (int i = 0; i < tamannio - 1; i++) {
            min = i;
            for (int j = i + 1; j < tamannio; j++) {
                if (arrApeP[j].compareToIgnoreCase(arrApeP[min]) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                intercambiar(i, min);
            }
        }        
        System.out.println("----------------ORDENACION POR APELLIDO EXITOSA------------------");
    }
    public static void ordSeleccionMaterno() {
        if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        int min;
        // Ordenamiento por selección ajustado a 'tamannio'
        for (int i = 0; i < tamannio - 1; i++) {
            min = i;
            for (int j = i + 1; j < tamannio; j++) {
                if (arrApeM[j].compareToIgnoreCase(arrApeM[min]) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                intercambiar(i, min);
            }
        }        
        System.out.println("----------------ORDENACION POR APELLIDO EXITOSA------------------");
    }

    public static void ordenSeleccionNombre() {
        if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        int min;
        // Ordenamiento por selección ajustado a 'tamannio'
        for (int i = 0; i < tamannio - 1; i++) {
            min = i;
            for (int j = i + 1; j < tamannio; j++) {
                if (arrNomb[j].compareToIgnoreCase(arrNomb[min]) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                intercambiar(i, min);
            }
        }
        System.out.println("--------------ORDENACION POR NOMBRE EXITOSA--------------");
    }
        public static void ordenSeleccionNumero() {
        if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        int min;
        // Ordenamiento por selección ajustado a 'tamannio'
        for (int i = 0; i < tamannio - 1; i++) {
            min = i;
            for (int j = i + 1; j < tamannio; j++) {
                if (arrNum[j].compareToIgnoreCase(arrNum[min]) < 0) {
                    min = j;
                }
            }
            if (i != min) {
                intercambiar(i, min);
            }
        }
        System.out.println("--------------ORDENACION POR NOMBRE EXITOSA--------------");
    }
        public static void modificarContacto(){
         if (tamannio == 0) {
            System.out.println("--------------Sin contactos registrados--------------");
            return;
        }

        mostrarContactos();
        System.out.print("Seleccione el número del contacto que desea modificar (1 al " + tamannio + "): ");
        int index = input.nextInt();
        input.nextLine(); 

        if (index < 1 && index > tamannio) {
            System.out.println("-------------------Número de contacto inválido---------------------------");
            return;
        }

        int pos = index - 1; 

        System.out.println("-----------------¿Qué desea modificar?----------------");
        System.out.println("1.- Número");
        System.out.println("2.- Nombre");
        System.out.println("3.- Apellido paterno");
        System.out.println("4.- Apellido materno");
        System.out.println("Seleccione una opción: ");
            System.out.println("------------------------------------------------");
        int selec = input.nextInt();
        input.nextLine(); // Limpiar el buffer de entrada

        switch (selec) {
            case 1:
                System.out.print("Introduce el nuevo número: ");
                arrNum[pos] = input.nextLine();
                break;
            case 2:
                System.out.print("Introduce el nuevo nombre: ");
                arrNomb[pos] = input.nextLine();
                break;
            case 3:
                System.out.print("Introduce el nuevo apellido paterno: ");
                arrApeP[pos] = input.nextLine();
                break;
            case 4:
                System.out.print("Introduce el nuevo apellido materno: ");
                arrApeM[pos] = input.nextLine();
                break;
        }

        System.out.println("--------------MODIFICACIÓN EXITOSA--------------");
        }
} 
