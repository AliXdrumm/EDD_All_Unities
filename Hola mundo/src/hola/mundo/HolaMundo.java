/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hola.mundo;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class HolaMundo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        System.out.println("Mete cualquier mamada");
        String nombre [] = new String [4];
        
        for (int i = 0; i < 4; i++) {
            nombre[i] = input.nextLine();
        }
        System.out.println(nombre[0] + nombre[1] + nombre[2] + nombre[3]);
        
    }
    
}
