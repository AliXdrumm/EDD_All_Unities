/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica2_poo_eje2;

/**
 *
 * @author HP
 */
public class Practica2_Poo_eje2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Celular celular1 = new Celular("Samsung", "Rojo");
        celular1.DetalleCelular();
        celular1.Llamar();
        
        Celular celular2 = new Celular("LG", "Azul");
        celular2.Llamar();
    }   
}
 class Celular{
private String nombre, color;

public Celular(){
this.nombre = "";
this.color = "";

}
public Celular(String nombre, String color){
this.nombre = nombre;
this.color = color;

}

        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }
  public void Llamar(){
      System.out.println("Llamado de: " + this.nombre + " Color: " + this.color);
  }
  public void DetalleCelular(){
      System.out.println("-------------------------------------");
      System.out.println("Llamado de: " + this.nombre + " Color: " + this.color);
      System.out.println("-------------------------------------");
  }
}

