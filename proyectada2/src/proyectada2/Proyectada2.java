/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectada2;

import java.time.LocalTime;
import java.util.Scanner;
import static proyectada2.Atletas.introducirValores;
import static proyectada2.Atletas.mostrarAtletas;

/**
 *
 * @author HP
 */
public class Proyectada2 {

    /**
     * @param args the command line arguments
     */
        public static Scanner input = new Scanner(System.in);
    public static String nomb [];
    public static int dors [];
    public static char cat [];
    public static double tiemp [];
    public static int dat = 3;
    public static void main(String[] args) {
        // TODO code application logic here
        nomb = new String [dat];
        dors = new int [dat];
        cat = new char [dat];
        tiemp = new double [dat];
        int valo;
        do{
            System.out.println("1.-Introducir Atletas");
            System.out.println("2.-Mostrar atletas");
            System.out.println("3.-Ordenar Tiempo");
            System.out.println("4.-Ordenar por categoria");
            System.out.println("5.-Ordenar por nombre");
            System.out.println("6.-Buscar por dorsal");
            System.out.println("7.-Salir");
        valo = input.nextInt();
        if(valo == 1){
        introducirValores();
        }
        if(valo == 2){
        mostrarAtletas();
        }
        if(valo == 3){
        ordenTiempo(tiemp);
        }
        if(valo == 4){
        ordCat(cat);
        }
        if(valo == 5){
        ordNombre(nomb);
        }
        if(valo == 6){
        
        }
        }while(valo != 7);
    }
}
    class Atletas extends Proyectada2{
    private String nombre;
    private int dorsal;
    private char categoria;
    private double tiempo;

    
        public Atletas() {
        this.nombre = " ";
        this.dorsal = 0;
        this.categoria = ' ';
        this.tiempo = 0;
    }
    public Atletas(String nombre, int dorsal, char categoria, double tiempo) {
        this.nombre = nombre;
        this.dorsal = dorsal;
        this.categoria = categoria;
        this.tiempo = tiempo;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public char getCategoria() {
        return categoria;
    }

    public void setCategoria(char categoria) {
        this.categoria = categoria;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }
    
    public static void introducirValores(){
            Scanner input = new Scanner(System.in);
        System.out.println("Introduzca la cantidad de nombres:");
        for (int i = 0; i < nomb.length; i++) {
            System.out.print("Nombre " + i + ": ");
          nomb[i] = input.nextLine();
       }
                System.out.println("Introduzca la cantidad de dorsales:");
        for (int i = 0; i < dors.length; i++) {
            System.out.print("Dorsal " + i + ": ");
          dors[i] = input.nextInt();
       }
         System.out.println("Introduzca la cantidad de categorias:");
        for (int i = 0; i < cat.length; i++) {
            System.out.print("Categoria " + i + ": ");
          cat[i] = input.next().charAt(0);
       }
         System.out.println("Introduzca la cantidad de tiempo:");
        for (int i = 0; i < tiemp.length; i++) {
            System.out.print("Tiempo " + i + ": ");
          tiemp[i] = input.nextInt();
       }
     }
    public static void mostrarAtletas(){
        System.out.println("Los atletas son: ");
        System.out.println("Nombres: ");
        for (int i = 0; i < nomb.length; i++) {
            System.out.println("Nombre " + i + ": " + nomb[i]);
       } 
        System.out.println("Dorsales:");
                for (int i = 0; i < dors.length; i++) {
            System.out.println("Nombre " + i + ": " + dors[i]);
       }
                        System.out.println("Categorias:");
                for (int i = 0; i < cat.length; i++) {
            System.out.println("Nombre " + i + ": " + cat[i]);
       }
              System.out.println("Tiempo:");
                for (int i = 0; i < tiemp.length; i++) {
            System.out.println("Nombre " + i + ": " + tiemp[i]);
       }
    }
     public static void intercambiarNumeros(int[] tiemp, int i, int j) {
 int aux = tiemp[i];//Igual a lo que esté en el arreglo en la posición i, osea al iniciar es 10, osea aux = a[i] = 10
 tiemp[i] = tiemp[j];//son la comparación del los valores de a[i] y a[j]
 tiemp[j] = aux;//compara los valores eh intercambia los valores, incrementando j en las posiciones que tenga
 }
      public static void intercambiarNombres(String[] a, int i, int j) {
 String aux = a[i];//Igual a lo que esté en el arreglo en la posición i, osea al iniciar es 10, osea aux = a[i] = 10
 a[i] = a[j];//son la comparación del los valores de a[i] y a[j]
 a[j] = aux;//compara los valores eh intercambia los valores, incrementando j en las posiciones que tenga
 }
  public static void ordenTiempo(int tiemp[]){
    int i, j;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
     //Obtenemos la hora del sistema, osea de la hora actual de la PC
 for (i = 0; i < tiemp.length - 1; i++) {
 for (j = i + 1; j < tiemp.length; j++) {
 if (tiemp[i] > tiemp[j]) {
 intercambiarNumeros(tiemp, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
     System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
     System.out.println("La hora del sistema actual es: " + hora);
    }
  public static void ordNombre(String [] nomb) {
 int i, j;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
     //Obtenemos la hora del sistema, osea de la hora actual de la PC
 for (i = 0; i < nomb.length - 1; i++) {
 for (j = i + 1; j < nomb.length; j++) {
 if (nomb[i].compareTo(nomb[j]) > 0){
 intercambiarNombres(nomb, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
     System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
    }
  public static void ordCat(char [] cat) {
 int i, j;
 String enter;
 int inter = 0;
 System.out.println("Entrando al metodo de burbuja enter para continuar");
 enter = input.nextLine();
 LocalTime hora = LocalTime.now();
     System.out.println("La hora del sistema es: " + hora);
     //Obtenemos la hora del sistema, osea de la hora actual de la PC
 for (i = 0; i < cat.length - 1; i++) {
 for (j = i + 1; j < cat.length; j++) {
 if (cat[i].compareTo(cat[j]) > 0){
 intercambiarNombres(cat, i, j);
 inter ++;
      }//cerramos if
     }//cerramos for j
   }//cerramos for i
     System.out.println("Numero de intercambios: " + inter);
     hora = LocalTime.now();
     //La hora en la que finalizó el código de hacer los intercambios
    }
    }
