/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica3_poo_eje3;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Empleado {
    Scanner sc = new Scanner(System.in);
 String idEmpleado;
 String Nombre;
 String apePaterno;
 String apeMaterno;
 String RFC;
 int diasLaborados;
 final double salarioMinimo = 315.04;
 double Comision;
 double Totalventaempleado;
 double TotalSueldo;
 
public Empleado() {
        this.idEmpleado = "";
        this.Nombre = "";
        this.apePaterno = "";
        this.apeMaterno = "";
        this.RFC = "";
        this.diasLaborados = 0;
        this.Comision = 0;
        this.Totalventaempleado = 0;
        this.TotalSueldo = 0;
    }

    public Empleado(String idEmpleado, String Nombre, String apePaterno, String apeMaterno, String RFC, int diasLaborados, double Comision, double Totalventaempleado, double TotalSueldo) {
        this.idEmpleado = idEmpleado;
        this.Nombre = Nombre;
        this.apePaterno = apePaterno;
        this.apeMaterno = apeMaterno;
        this.RFC = RFC;
        this.diasLaborados = diasLaborados;
        this.Comision = Comision;
        this.Totalventaempleado = Totalventaempleado;
        this.TotalSueldo = TotalSueldo;
    }

    public String getIdEmpleado() {
        return idEmpleado;
    }

    public void setIdEmpleado(String idEmpleado) {
        this.idEmpleado = idEmpleado;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApePaterno() {
        return apePaterno;
    }

    public void setApePaterno(String apePaterno) {
        this.apePaterno = apePaterno;
    }

    public String getApeMaterno() {
        return apeMaterno;
    }

    public void setApeMaterno(String apeMaterno) {
        this.apeMaterno = apeMaterno;
    }

    public String getRFC() {
        return RFC;
    }

    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    public int getDiasLaborados() {
        return diasLaborados;
    }

    public void setDiasLaborados(int diasLaborados) {
        this.diasLaborados = diasLaborados;
    }

    public double getComision() {
        return Comision;
    }

    public void setComision(double Comision) {
        this.Comision = Comision;
    }

    public double getTotalventaempleado() {
        return Totalventaempleado;
    }

    public void setTotalventaempleado(double Totalventaempleado) {
        this.Totalventaempleado = Totalventaempleado;
    }

    public double getTotalSueldo() {
        return TotalSueldo;
    }

    public void setTotalSueldo(double TotalSueldo) {
        this.TotalSueldo = TotalSueldo;
    }

    public void leerDatos(){
    System.out.println("gallito s.a. de c.v");
 System.out.print("numero de idenficacion: ");
 idEmpleado=sc.next();
 System.out.print("RFC: ");
 RFC=sc.next();
 System.out.print("Nombre del empleado: ");
 Nombre=sc.next();
 System.out.print("Apellido Paterno: ");
 apePaterno=sc.next();
 System.out.print("Apellido Materno: ");
 apeMaterno=sc.next();
 System.out.println("-------------------------------");
    }
    
 public double CalculcarSueldobase(){
 double SueldoBase;
 SueldoBase= this.salarioMinimo * this.diasLaborados;
 return SueldoBase;
}

public double CalcularComision(){
 this.Comision= this.Totalventaempleado * .03;
 return this.Comision;
}
public double CalcularTotalSalario(){
 TotalSueldo= CalculcarSueldobase()+CalcularComision();
 return TotalSueldo;
}
public void ImprimirReporte(){

 System.out.print("id empleado:  ");
 System.out.print(this.idEmpleado);
 System.out.print(" RFC:  ");
 System.out.println(this.RFC);
    System.out.println("---------------------------------------");
 System.out.print(" NOMBRE:  ");
 System.out.print(this.Nombre);
 System.out.print(" APELLIDO PATERNO:  ");
 System.out.print(this.apePaterno);
 System.out.print(" APELLIDO MATERNO:  ");
 System.out.println(this.apeMaterno);
    System.out.println("----------------------------");
 System.out.print(" Dias Laborados:  ");
 this.diasLaborados=sc.nextInt();
 System.out.print(" Total de ventas:  ");
 this.Totalventaempleado=sc.nextDouble();
 System.out.print(" Sueldo Total  ");
 System.out.println(CalcularTotalSalario());
 System.out.println("---fin programa---");
} 

}


