/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicios1al5;

import java.util.Scanner;

/**
 *
 * @author Familia
 */
public class Ejercicios1al5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
 
    
     //ejercio 1
        
        String nombre ;
        int num ;  // num enteros
        float num2; //numero decimal 32bit
        double num3; //numero decimal 64 bit
        char frase ; // caracter en comillas simples ''
        boolean logico; //Logicos
        
        //ejercicio 2 
        
        nombre = "German";
        num = 4;
        num2 = 2/4;
        //num3 = 2.45; 
        //frase = '$';
        //logico = true;
        
        //ejercicio 3
        
        int suma = num + num;
        System.out.println("El resultado de la suma es: " + suma);
        
       // double resta = num3 - num3;
        //System.out.println("El resultado de la suma es: " + resta);
        
        int mult = num * num;
        System.out.println("El resultado de la suma es: " + mult);
        
        num++ ;
        System.out.println("El resultado de la suma es: " + num);
        
        num--;
        System.out.println("El resultado de la suma es: " + num);

        
       // logico = num > 3 ;
//System.out.println("El resultado de la suma es: " + logico);
        
        
       // logico = num < 2;
       // System.out.println("El resultado de la suma es: " + logico);
        
        //Ejercicio 4
        
        String nombre1 = "German" ;
        int edad = 33;
        
        System.out.println("Mi nombre es: " +nombre1);
        System.out.println("Mi edad es: " +edad);
                
        
        //ejercio 5
        
        Scanner leer = new Scanner(System.in);
        
        //double
        System.out.println("Ingrese valor");  
        num3 = leer.nextDouble();
        
        System.out.println("El numer ingresado es " +num3);
        
        //logico
        
        System.out.println("Ingrese true o false ");
        
        logico = leer.nextBoolean();
        
        System.out.println("el valor ingresado es " +logico);
        
        //char
        
        System.out.println("Ingrese un caracter ");
        
        frase = (char) System.in.read();
 
        System.out.println("el carcter es: " +frase);
        

   }
    
}
