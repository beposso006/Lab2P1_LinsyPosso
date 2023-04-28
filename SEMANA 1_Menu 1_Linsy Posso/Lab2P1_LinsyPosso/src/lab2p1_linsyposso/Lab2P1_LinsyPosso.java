/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2p1_linsyposso;
import java.util.Scanner;

public class Lab2P1_LinsyPosso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        boolean running = true;
        
        while (running){
            System.out.println ("1.Numeros primos");
            System.out.println ("2.Aproximado pi");
            System.out.println ("3.MCD");
            System.out.println ("4.Salir");
            System.out.println ("Ingrese una opcion");
            int opcion = Leer.nextInt();
            
            switch (opcion){
                case 1:
                    System.out.println("Ingrese un numero: ");
                    int numero = Leer.nextInt();
                   boolean par = (numero % 2 == 0);
                   boolean primo = true;
                   
                   if (par){
                       System.out.println(numero + "es un numero par");
                    } else {  
                       System.out.println(numero + "es un numero impar");
                       
                   }
                   int divisor = 2;
                   while (divisor <= numero / 2 && primo){
                       if (numero % divisor == 0){
                       primo = false;   
                       }
                       divisor ++;
                    }  
                    if (primo) {  
                   System.out.println(numero + "es un numero primo");
                    } else {  
                       System.out.println(numero + "el numero no es primo");    
                   }
                   break;  
                   
                case 2:
                    System.out.println("Ingrese la precisión del cálculo:");
                    int n = Leer.nextInt();
                    double pi = 1;
                    int i = 1;
                    while (i<=n){
                        pi *= (double) 4 * i * i / (4 * i * i - 1);
                        i++;
                    }
                    pi *= 2;
                    System.out.println("El resultado aproximado es: " + pi);
                    
                    break;
                    
                case 3:
                System.out.println("Ingrese el primer numero a: ");
                int a = Leer.nextInt();
                System.out.println("Ingrese el segundo numero b: ");
                int b = Leer.nextInt();
                
                while (a != b){
                    if (a > b){
                        a = a - b;
                        } else {
                        b = b - a;
                    }
                
                }
                System.out.println("El MCD es: " + a);
                break;
                
                case 4:
                    running = false;
                    break;
                default:
                    System.out.println("Error, opcion incorrecta");
                    break;
                        
                    }
                    
                    
                    
                      
            }
               
        }
       
    }
    

    

