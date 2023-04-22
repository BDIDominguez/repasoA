/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repasoa;

import java.util.Scanner;

/**
 *
 * @author Dario
 */
public class GuiaA {
    
    
    /* 1. Escribir un método que pida dos números enteros por teclado y calcule la suma de los dos
mostrando por consola la suma de los mismos. */
    public static void sumarDosn(){
        Scanner vN = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        int vNumero1 = vN.nextInt();
        System.out.println(" ");
        System.out.print("Ingrese el segundo numero: ");
        int vNumero2 = vN.nextInt();
        System.out.println("La suma de " + vNumero1 + " y " + vNumero2 + " es de " + (vNumero1+vNumero2));
    }
    
    /* 2. Escribir un método que pida tu nombre, lo guarde en una variable y lo muestre por pantalla. */
    
    public static void pedirNombre(){
        Scanner vL = new Scanner(System.in);
        System.out.print("Ingresa tu nombre por favor: ");
        String vNombre = vL.nextLine();
        System.out.println("Gracias " + vNombre);
    }
    
    /* 3. Escribir un método que pida una frase y la muestre toda en mayúsculas y después toda en
minúsculas. Nota: investigar los métodos toUpperCase() y toLowerCase() de la clase String. */
    
    public static void convertir(){
        Scanner vL = new Scanner(System.in);
        System.out.println("Ingrese una frase por favor: ");
        String vFrase = vL.nextLine();
        System.out.println("****** Convertida en mayusculas *****");
        System.out.println(vFrase.toUpperCase());
        System.out.println("****** Convertida en minusculas *****");
        System.out.println(vFrase.toLowerCase());
        
    }
    /* 4. Escribir un método que dada una cantidad de grados centígrados se debe mostrar su equivalente
en grados Fahrenheit. La fórmula correspondiente es: F = 32 + (9 * C / 5). */
    
    public static void temperatura(){
        Scanner vN = new Scanner(System.in);
        System.out.print("Ingrese la temperatura en Grados Centigrados: ");
        double vTemp = vN.nextDouble();
        System.out.println("Esa temperatura en Fahrenheit es " + (32 + (9* vTemp /5 )));
    }
    
    /* 5. Escribir un método que lea un número entero por teclado y muestre por pantalla el doble, el
triple y la raíz cuadrada de ese número. Nota: investigar el método Math.sqrt(). */
    
    public static void calculos(){
        Scanner vN = new Scanner(System.in);
        System.out.println("Ingrese un numero por favor ");
        int vNumero = vN.nextInt();
        System.out.println("El doble de " + vNumero + " es " + (vNumero*2));
        System.out.println("El triple de " + vNumero + " es " + (vNumero*3));
        System.out.println("La raiz cuadrada de " + vNumero + " es " + Math.sqrt(vNumero));
              
    }
    
    
    
    
    
} // Fin de la Clase
