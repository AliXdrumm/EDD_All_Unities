/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infija_postfija;

/**
 *
 * @author HP
 */
public class Pila {
    private Nodo cima;

    public Pila() {
        this.cima = null;
    }

    public boolean estaVacia() {
        return (cima == null);
    }

    // Insertar en la pila (Push)
    public void apilar(char elemento) {
        Nodo nuevo = new Nodo(elemento);
        nuevo.setEnlace(cima);
        cima = nuevo;
    }

    // Eliminar de la pila (Pop)
    public char desapilar() {
        if (!estaVacia()) {
            char elemento = cima.getDato();
            cima = cima.getEnlace();
            return elemento;
        }
        return '\0'; // Caracter nulo si está vacía
    }

    // Ver el elemento de arriba sin sacarlo (Peek)
    public char verCima() {
        if (!estaVacia()) {
            return cima.getDato();
        }
        return '\0';
    }
}
