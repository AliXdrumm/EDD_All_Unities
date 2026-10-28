/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_6_edd_s;

/**
 *
 * @author HP
 */
public class NodoListaD {
    Object info;
NodoListaD Izq;/////////////asi se declara para apuntar a un dato igual a ellos
NodoListaD Der;

////////////primer constructor/////////////////////
    public NodoListaD(Object Dato) {
        this.info = Dato;
        this.Izq = null;
        this.Der = null;
    }

/////////////////segundo constructor///////////////
public NodoListaD(NodoListaD Izq, Object Dato){
this.Izq = Izq;
this.info = Dato;
this.Der = null;
}
//////////////////tercer constructor//////////////
public NodoListaD(Object Dato, NodoListaD Der){
this.Izq = null;
this.info = Dato;
this.Der = Der;
}
//////////////////cuarto constructor////////////////
public NodoListaD(NodoListaD Izq, Object Dato, NodoListaD Der){
this.Izq = Izq;
this.info = Dato;
this.Der = Der;
}

}
