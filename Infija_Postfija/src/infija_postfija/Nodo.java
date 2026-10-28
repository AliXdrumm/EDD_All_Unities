/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package infija_postfija;

/**
 *
 * @author HP
 */
public class Nodo {
    char dato; // Cambiamos a char para almacenar operadores y letras
    Nodo enlace;

    // Constructor
    public Nodo(char x) {
        dato = x;
        enlace = null;
    }

    public char getDato() {
        return dato;
    }

    public void setDato(char dato) {
        this.dato = dato;
    }

    public Nodo getEnlace() {
        return enlace;
    }

    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
}
