/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_edd_s;

/**
 *
 * @author HP
 */
public class Nodo {
    int dato;
 Nodo enlace;
 //constructor que inserta al final
 public Nodo(int x) {
 dato = x;
 enlace = null;
 }
 
//constructor que inserta un elemento en un lugar determinado
 public Nodo(int x, Nodo n) {
 dato = x;
 enlace = n;
 }
 
 public int getDato() {
 return dato;
 }
 public void setDato(int dato) {
 this.dato = dato;
 }
 public Nodo getEnlace() {
 return enlace;
 }
 public void setEnlace(Nodo enlace) {
 this.enlace = enlace;
 }
}