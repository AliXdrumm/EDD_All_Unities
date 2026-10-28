/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_6_edd_s;

/**
 *
 * @author HP
 */
///////////////////////////LISTA QUE MANIPULA A LOS PUNTEROSY METODOS /////////////
public class ListaD {
  //////PUNTEROS
public NodoListaD Primero,Ultimo,Nuevo,Aux,Pos,Ant;
//////constructor
public ListaD(){
Primero = Ultimo = Nuevo = Aux = Pos = Ant = null;
}

////////////////////////INSERTAR AL FRENTE//////////
public void insertarAlFrente(Object dato){
if(Primero==null){//////////1 caso(lista vacia)
Primero = new NodoListaD(dato);
Ultimo = Primero;
}
else{
Nuevo = new NodoListaD(Ultimo, dato);
Ultimo.Der = Nuevo;
Ultimo = Nuevo;
}despliegaLista();
}

////////////////INSERTAR ATRAS//////////////
public void insertarAtras(Object dato){
if(Primero==null){
Primero = new NodoListaD(dato);
Ultimo = Primero;
}
else {
Nuevo = new NodoListaD(dato,Primero);
Primero.Izq=Nuevo;
Primero = Nuevo;
}despliegaLista();
}

/////////INSERTAR ANTES DE //////////
public void insertarAntesDe(Object DatoB,Object DatoI){
if(Primero==null){
System.out.println ("lista vacia");
}
else{/////hay datos
if(buscar(DatoB)== true){
///////EMPEZAR A REALIZAR EL METODO
if(Aux==Primero){///caso 1
Nuevo= new NodoListaD(DatoI,Primero);
Primero.Izq = Nuevo;
Primero=Nuevo;
}
else{//en caso de que no este al inicio de la lista
Nuevo = new NodoListaD(Ant,DatoI , Aux);
Aux.Izq = Nuevo;
Ant.Der=Nuevo;
}
}
}
despliegaLista();
}

////////////////INSERTAR DESPUES DE/////////////// 
public void insertarDespuesDe(Object DatoB, Object DatoI){ 
if(Primero==null){ 
System.out.println ("lista vacia"); 
} 
else{///hay metodos 
if(buscar(DatoB)== true){ 
//////EMPEZAR A REALIZAR EL METODO///// 
if(Aux==Ultimo){ 
Nuevo=new NodoListaD(Aux,DatoI); 
Aux.Der=Nuevo; 
Ultimo=Nuevo; 
} 
else{///en caso de que no este al inicio de la lista 
Nuevo= new NodoListaD(Aux,DatoI,Aux.Der); 
Aux.Der = Nuevo; 
Pos = Aux.Der; 
Pos.Izq =Aux.Der; 
} 
} 
}despliegaLista(); 
} 
///////////////METODO ELIMINAR NODO////////////// 
public void eliminarNodo(Object DatoB){ 
if(Primero==null){ 
System.out.println ("lista vacia"); 
} 
else{ 
if(buscar(DatoB)==true){///hacer cuatro casos 
if(Primero==Ultimo){//// 1 caso 
Primero=Ultimo=null; 
} 
else if(Aux==Primero){//2caso 
Primero=Aux.Der; 
Primero.Izq=Aux=null; 
} 
else if(Aux==Ultimo){//3 caso 
Ultimo=Ant; 
Ultimo.Der=Aux=null; 
} 
else{//4 caso 
Ant.Der=Pos; 
Pos.Izq=Ant; 
Aux=null; 
} 
} 
}despliegaLista(); 
} 
/////////////METODO PARA SUSTITUIR DATO/////////////// 
public void modificaLista(Object DatoB,Object DatoI){ 
if(Primero==null){ 
System.out.println ("lista vacia"); 
} 
else{ 
if(buscar(DatoB)==true){ 
Aux.info=DatoI; 
} 
}despliegaLista(); 
} 
//////////////////////////METODO BUSCAR///////// 
public boolean buscar(Object DatoB){ 
Aux = Primero; 
boolean bandera = false; 
while (Aux != null && bandera != true) { 
if(DatoB.equals(Aux.info)){// si encuentra el dato //la funcion .equals sirve para comparar el contenido de una direccion de memoria 
bandera = true; 
} 
else{//apunta al siguiente nodo  
Ant = Aux; 
Aux = Aux.Der; 
Pos = Aux.Der; 
} 
} 
if(bandera == true){ 
return true; 
} 
else{ 
System.out.println ("ese dato no existe"); 
return false; 
} 
} 

////////////////////DESPLEGAR LISTA DOBLE////////////////
public void despliegaLista(){
Aux = Primero;
System.out.println ("######### LISTA COMPLETA ###########");
while (Aux != null) {
System.out.println (Aux.info);
Aux = Aux.Der;
}
System.out.println ("########################################");
}
}
