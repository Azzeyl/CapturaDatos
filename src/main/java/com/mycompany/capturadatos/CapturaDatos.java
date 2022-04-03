/*Practica en casa capturar datos*/

package com.mycompany.capturadatos;

/**
 * @author Jonatan Camilo igua
 */

import java.util.Scanner;

public class CapturaDatos {
    
    private int numero1 = 0;
    private int numero2 = 0;
    private int resultado = 0;
    
    Scanner teclado = new Scanner (System.in);
    
    public CapturaDatos () {
        this.numero1 = 0;
        this.numero2 = 0;
        this.resultado = 0;
    }
    
    public CapturaDatos(int numero1, int numero2) {
        this.numero1 = numero1;
        this.numero2 = numero2;
        this.resultado = resultado;
    }
    
    public void setNumero1(int numero1) {
        this.numero1 = numero1;
    }
    
    public int getNumero1() {
        return numero1;
    }
    
    public void setNumero2 (int numero2) {
        this.numero2 = numero2;
    }
    
    public int getNumero2 () {
        return numero2;
    }
    
    public void realizarCalculo() {
        resultado = numero1 + numero2;
    }
    
    public int getResultado() {
        return resultado;
    }
    
    public void ingresarDatos() {
        System.out.println("Ingrese el numero 1: ");
        numero1 = teclado.nextInt();
        
        System.out.println("Ingrese el numero 2: ");
        numero2 = teclado.nextInt();
        
        System.out.println("\nEl numero 1 es:" + numero1);
        System.out.println("\nEl numero 2 es: " + numero2);
        
        resultado = numero1 + numero2;
        
        System.out.println("El resultado de la suma es: " + resultado);   
    }
    
    public static void main (String [] args) {
     CapturaDatos unCapturaDatos;
     unCapturaDatos = new CapturaDatos();
     unCapturaDatos.ingresarDatos();
    }
}
