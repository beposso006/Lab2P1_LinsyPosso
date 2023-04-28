/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;
import java.util.Scanner;

/**
 *
 * @author CARMEN POSSO
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Menu");
        System.out.println("Ejercicio 1: Dividir sin dividir");
        System.out.println("Ejercicio 2: Serie");
        System.out.println("Ejercicio 3 Suma alternante");
        System.out.println("Ingrese su opcion: ");
        Scanner Leer = new Scanner(System.in);
        int opcion = 0;
        opcion = Leer.nextInt();
        
        while (opcion != 4)
        {
            switch (opcion)
            {
                case 1:
                    
                System.out.println("Ingrese dividiendo: ");
                int dividiendo = 0; 
                dividiendo = Leer.nextInt();
                
                System.out.println("Ingrese divisor: ");
                int divisor; 
                divisor = Leer.nextInt();
                
                int acumulador = 0;
                int contador = 0;
                
                while(acumulador < dividiendo)
                {
                    acumulador = acumulador + divisor;
                    contador ++; 
                }
                
                if (acumulador > dividiendo)
                {
                    contador -= 1;
                }
                
                if(dividiendo%divisor != 0)
                {
                    System.out.println("El resultado de la division es: " + contador + " con residuo de " + dividiendo % divisor);
                }
                
                else
                {
                    System.out.println("El resultado de la division es: " + contador);
                }
                    break;
                    
                case 2:
                    int const_0 = 0;
                    int const_1 = 1;
                    System.out.print("Ingrese una cantidad de numeros: ");
                    int cantidad_num = 1;
                    cantidad_num = Leer.nextInt();
                    contador = 1;
                    System.out.print("0 ");

                    while (contador <= cantidad_num+1)
                    {
                        int respuesta = const_0 + const_1;

                        if (const_1 > 1)
                        {
                            respuesta = const_0 + const_1 + 1;
                        }
                        const_0 = const_1;
                        const_1 = respuesta;

                        System.out.print(respuesta + " ");

                        contador ++;
                    }

                    break;
                    
                case 3: 
                    System.out.println("Ingrese un numero: ");
                    int usuario_entrada = 0;
                    usuario_entrada = Leer.nextInt();
                    contador = 1;
                    int suma = 0;

                    while (contador <= usuario_entrada)
                    {
                        int respuesta = usuario_entrada - contador;

                        if (respuesta % 2 == 0)
                        {
                            suma = suma + respuesta;
                        }

                        else if (respuesta % 2 != 0)
                        {
                            suma = suma - respuesta;
                        }

                        contador ++;
                    }
                    System.out.println("El resultado de la suma es: " + suma);
                         break;
                         
                default:
                    System.out.println("Error, opcion invalida. ");
                
            }
            
            System.out.println("");
            System.out.println("Menu");
            System.out.println("Ejercicio 1");
            System.out.println("Ejercicio 2");
            System.out.println("Ejercicio 3");
            System.out.println("Ingrese su opcion: ");
            opcion = Leer.nextInt();
        }
    }
    
}
        // TODO code application logic here
    
