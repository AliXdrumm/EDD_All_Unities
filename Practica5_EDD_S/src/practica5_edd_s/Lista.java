/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica5_edd_s;

/**
 *
 * @author HP
 */
public class Lista {
public Nodo primero;
public Nodo ultimo;

public Lista() {
    this.primero = null;
    this.ultimo = null;
    }
public Lista(Nodo inicio, Nodo ulitimo) {
 this.primero = inicio;
 this.ultimo = ulitimo;
    }

//Determinar que la lista esta vacia
 public boolean Vacia() {
 return (primero == null);
 }
 
 //Metodo para agregar a la lista
 public Lista insertaOrden(int entrada) {//Recibe el elemento que vamos a agregar en la lista
 {
 Nodo nuevo;
 nuevo = new Nodo(entrada);
 if (primero == null) // lista vacía
 {
 primero = nuevo;
 } else if (entrada < primero.getDato()) {
 nuevo.setEnlace(primero);
 primero = nuevo;
 } else /* búsqueda del nodo anterior a partir del que
 se debe insertar */ {
 Nodo anterior, p;
 anterior = p = primero;
 while ((p.getEnlace() != null) && (entrada > p.getDato())) {
 anterior = p;
 p = p.getEnlace();
 }
 if (entrada > p.getDato()) //se inserta después del último nodo
 {
 anterior = p;
 }
// Se procede al enlace del nuevo nodo
 nuevo.setEnlace(anterior.getEnlace());
 anterior.setEnlace(nuevo);
 }
 return this;
 }
 }
//Metodo para mostrar la lista
 public void MostrarLista() {
 Nodo indice = primero;//que apunte el el ultimo elemento agregado
 if (primero == null) {
 System.out.println("No hay elementos en su lista");
 }
 while (indice != null) {//Mientras no llege al final a tierra
 System.out.println(" [ " + indice.dato + "]");//Para acceder a lo que tiene la casilla osea elelmento
     System.out.println("[Direccion del nodo]: " + indice);
     System.out.println("[Direccion del enlace]: " + indice.enlace);
 indice = indice.enlace;//Para recorrer al siguente elemento de la lista
 }
 }
 public void eliminar(int elemento) {
 if (!Vacia()) {
 if (primero == ultimo && elemento == primero.dato) {
 primero = ultimo = null;
 } else if (elemento == primero.dato) {
 primero = primero.enlace;
 } else {
 Nodo anterior, temporal;
 anterior = primero;
 temporal = primero.enlace;
 while (temporal != null && temporal.dato != elemento) {
 anterior = anterior.enlace;
 temporal = temporal.enlace;
 }
 if (temporal != null) {
 anterior.enlace = temporal.enlace;
 if (temporal == ultimo) {
 ultimo = anterior;
 }
 }
 }
 } else {
 System.out.println("No hay elementos que eliminar");
 }
 }
 public void Buscar(int elemento) {
 Nodo aux = primero;
 boolean enc = false;
 while (aux != null) {
 if (aux.dato == elemento) {
 enc = true;
 }
 aux = aux.enlace;
 }
 if (enc) {
 System.out.println("Si existe este elemento es tu lista" + "En la posicion: " + primero.getEnlace());
 } else {
 System.out.println("Este elemento no existe en tu lista");
 }
 }
 public void Modifcar(int elemento, int elementoN) {
 Nodo aux = primero;
 while (aux != null) {
 if (aux.dato == elemento) {
 aux.dato = elementoN;
 System.out.println("Elemento modificado");
 }
 aux = aux.enlace;
 }
 }
}
