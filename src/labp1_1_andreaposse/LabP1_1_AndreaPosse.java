/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package labp1_1_andreaposse;

import java.util.Scanner;

/**
 *
 * @author andyp
 */
public class LabP1_1_AndreaPosse {
// escribe sout y toca la letra tab; es un short cut para escribir el imprimir 
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     
       Scanner read = new Scanner (System.in); // aprende bien la sintaxis (la estructura principal)
       
       int respuesta = -1; 
       
       while(respuesta != 0 ) { 
        
        System.out.println(" Menu Principal ");
        System.out.println(" Opcion 1: Mensaje ");
        System.out.println(" Opcion 2: Calculadora  ");
        System.out.println(" Opcion 3: Edades ");
        
        respuesta = read.nextInt();
        
// esto es para que en el usuario ingrese el numero escojido.
        // == significa o se usa para establecer igual a algo, en este caso el numero. 
        if( respuesta == 1 ) {
            System.out.println(" Hola soy Yo! " ); 
            System.out.println("    ");
            
        }
        
        // opcion 2 calduladora 
        else if ( respuesta == 2 ){ 
            System.out.println(" Ingrese numero uno: "); 
            int num1 = read.nextInt(); 
            System.out.println(" Ingrese numero dos : ");
            int num2 = read.nextInt(); 
            
            int resultado = num1 * num2 ; 
            
            System.out.println(" Resultado es: " + resultado );
            System.out.println("   ");
            
        }
        
        // Opcion 3: Calculadora de edades 
        else if(respuesta == 3){
            System.out.println("Ingrese su edad : ");
            int edad = read.nextInt(); 
            
            if( edad >= 18){
                System.out.println(" Usted es mayor de edad");
                System.out.println(" ");
            }
            else{
                System.out.println("Usted es menor de edad ");
                System.out.println(" ");
        }
            
            // fin de programa
            // toca ctrl + s para guardar el programa. 
            
        }
       } 
        
    } 
        
        
    }
    

