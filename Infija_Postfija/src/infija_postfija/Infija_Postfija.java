/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package infija_postfija;
import java.util.Scanner;
/**
 *
 * @author HP
 */
public class Infija_Postfija{
    
//Practica infija postfija//
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ope;

        do {
            System.out.println("\n--- CONVERSOR INFIJA A POSTFIJA ---");
            System.out.println("1- Convertir expresion (Ejemplo: (a + b) / (c * f))");
            System.out.println("2- Salir");
            System.out.print("Selecciona una opcion: ");
            ope = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (ope) {
                case 1:
                    System.out.print("Introduce la expresion infija: ");
                    String expresion = sc.nextLine();
                    String resultado = infijaAPostfija(expresion);
                    System.out.println("\n[Expresion Postfija]: " + resultado);
                    break;
                default:
                    System.out.println("Opcion no valida.");
            }
        } while (ope != 2);
    }
    // Método para definir la jerarquía de los operadores
    public static int jerarquia(char op) {
        switch (op) {
            case '+':
            case '-':
                return 1;
            case '*':
            case '/':
                return 2;
            default:
                return 0;
        }
    }

    // Algoritmo de Infija a Postfija
    public static String infijaAPostfija(String infija) {
        String postfija = "";
        Pila pila = new Pila();

        for (int i = 0; i < infija.length(); i++) {
            char caracter = infija.charAt(i);

            // Si es un espacio, lo ignoramos
            if (caracter == ' ') continue;

            // 1. Si es un operando (letra o dígito), va directo a la salida
            if (Character.isLetterOrDigit(caracter)) {
                postfija += caracter + " "; // Usamos espacio para separar visualmente
            } 
            // 2. Si es un paréntesis izquierdo, se apila
            else if (caracter == '(') {
                pila.apilar(caracter);
            } 
            // 3. Si es un paréntesis derecho, desapilamos hasta encontrar '('
            else if (caracter == ')') {
                while (!pila.estaVacia() && pila.verCima() != '(') {
                    postfija += pila.desapilar() + " ";
                }
                pila.desapilar(); // Elimina el '(' de la pila
            } 
            // 4. Si es un operador (+, -, *, /)
            else {
                while (!pila.estaVacia() && jerarquia(pila.verCima()) >= jerarquia(caracter)) {
                    postfija += pila.desapilar() + " ";
                }
                pila.apilar(caracter);
            }
        }

        // Vaciamos lo que haya quedado en la pila
        while (!pila.estaVacia()) {
            postfija += pila.desapilar() + " ";
        }

        return postfija;
    }

}