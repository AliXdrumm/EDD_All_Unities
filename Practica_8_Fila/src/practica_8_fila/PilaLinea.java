/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_8_fila;

/**
 *
 * @author HP
 */
public class PilaLinea {
    private static final int TAMPILA = 49; // tamaño de la pila 
    private int cima; // apunta elemento cima de la pila 
    private int[] listaPila; //arreglo para almacenar datos de la pila enteros 
 
// constructor de la clase pilalineal 
    public PilaLinea() { 
        cima = -1; // condición de pila vacía 
        listaPila = new int[TAMPILA]; 
    }
    // procedimiento para insertar elemento 
    public void insertar(int elemento) throws Exception { 
        if (pilaLlena()) { 
            throw new Exception("Desbordamiento pila"); 
        } 
//incrementar puntero cima y copia elemento 
        cima++; 
        listaPila[cima] = elemento; 
    }
        // funcion para verificar si la pila esta llena 
    public boolean pilaLlena() { 
        return cima == TAMPILA - 1; 
    } 
    
    // funcion para retirar un elemento de la pila     
 public int quitar() throws Exception { 
        int aux; 
        if (pilaVacia()) { 
            throw new Exception("Pila vacía, no se puede extraer."); 
        } 
// guarda elemento de la cima 
        aux = listaPila[cima]; 
// decrementar cima y devolver elemento 
        cima--; 
        return aux; 
    } 
    // funsion para verificar si la pila esta vacia 
    public boolean pilaVacia() { 
        return cima == -1; 
    } 
     
    //procedimiento que muestra el contenido de la pila 
    public void mostrar() { 
        for (int i = cima; i >= 0; i--) { 
            System.out.println(listaPila[i]); 
        } 
    }
    
    
}
