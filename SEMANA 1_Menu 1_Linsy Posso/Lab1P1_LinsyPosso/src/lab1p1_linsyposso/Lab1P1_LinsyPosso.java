/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab1p1_linsyposso;

import java.util.Scanner;

public class Lab1P1_LinsyPosso {

    public static void main(String[] args) {
        System.out.println("");
        System.out.println("Menu");
        System.out.println("1. Ejercicio 1: Dividir sin dividir");
        System.out.println("2. Ejercicio 2: Serie");
        System.out.println("3. Ejercicio 3: Suma alternante");
        System.out.println("Ingrese su opcion");
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        opcion = sc.nextInt();
        
        while (opcion < 4) {
            
            switch (opcion) {
                case 1:
                System.out.println("Ingrese el dividendo");
                int dividendo = 0;
                dividendo = sc.nextInt();

                System.out.println("Ingrese el divisor");
                int divisor = 0;
                divisor = sc.nextInt();
                int acumulador = 0;
                int contador = 0;

                while (acumulador < dividendo) {
                    acumulador = acumulador + divisor;
                    contador = contador + 1;

                }

                if (acumulador > dividendo) {
                    contador = contador - 1;

                }

                if (dividendo % divisor != 0) {
                    System.out.println("El resultado de la division es: " + contador + "con residuo de " + dividendo % divisor);
                } else {
                    System.out.println("El resultado de la division es: " + contador);

                }
                break;

             
                case 2:
                    int cant = 0;
                    System.out.println("Ingrese la cantidad que desea imprimir: ");
                    cant = sc.nextInt();
                    int varia1 = 0;
                    int varia2 = 1;
                    int varia3 = 0;

                    System.out.print(varia1 + " " + varia2 + " ");
                    while (cant > 0) {
                        varia3 = varia1 + varia2 + 1;
                        System.out.print(varia3 + " ");

                        varia1 = varia2;
                        varia2 = varia3;
                        cant--;
                    }
                    System.out.println("La respuesta es:");
                    break;

            } case 3 (opcion == 3)
            {
              int cont = 1;
              int sum= 0;
              
              System.out.println("Ingrese el numero");
              cont = sc.nextInt();
              int numero = 1;
              while (numero <= cont)
              {
                  int answe = cont - numero;
                  
                  if (answe % 2 == 0)
                  {
                     sum= sum + answe;
                  } 
                  else if (answe % 2 != 0)
                  {
                    sum= sum - answe;
                  }
                  numero++;
                  
              }
              System.out.println("El resultado es: " + sum);

            }

        }

        System.out.println("Menu");
        System.out.println("1. Ejercicio 1");
        System.out.println("2. Ejercicio 2");
        System.out.println("3. Ejercicio 3");
        System.out.println("Ingrese su opcion");
        opcion = sc.nextInt();

    }
}

// TODO code application logic here

