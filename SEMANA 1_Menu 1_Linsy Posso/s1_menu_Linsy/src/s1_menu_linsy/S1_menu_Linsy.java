/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package s1_menu_linsy;
import java.util.Scanner;
/**
 *
 * @author LINSY POSSO
 */
public class S1_menu_Linsy {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int Respuesta = 1;
        while (Respuesta==1){
            System.out.println("1.tabla");
            System.out.println("2.factorial");
            System.out.println("3.numero primo");
            System.out.println("4.potencia");
            System.out.println("5.sumatoria");
            System.out.println("6.fracciones");
            System.out.println("Ingrese una opcion");
            int opcion = Leer.nextInt();
            
            switch(opcion){
                case 1:
                    
                System.out.println("Ingrese un numero");
                int tabla = Leer.nextInt();
                System.out.println("Ingrese limite");
                int limite = Leer.nextInt();
                int c=1;
                
                while (c<=limite){
                    System.out.println(tabla+"x"+c+"="+tabla*c);
                    c=c+1;
                }
                break;
            
            case 2:
                
                System.out.print("Ingrese un numero: ");
                int factorial = Leer.nextInt();
                 
                while (factorial <= 0){
                    System.out.print("Ingrese un numero: ");
                    factorial = Leer.nextInt();
                }

                int C = 1;
                int A = 1;
                while (C <= factorial){
                    A = A*C;
                    C = C+1;
                    }
                
                System.out.println("El factrial es: "+A);
                break;
                
            case 3: 
                System.out.print("Ingrese un numero: ");
                int numero = Leer.nextInt();
                int contador_ciclo = 1;
                int contador_cero = 0;
                while (numero <= 0){
                    System.out.println("Ingrese nuevamente el numero...");
                    numero = Leer.nextInt();
                }
                while(contador_ciclo <= numero){
                    if (numero % contador_ciclo == 0)
                    {
                        contador_cero ++;
                    }  
                    contador_ciclo ++;
                }
                if (contador_cero == 2){
                    System.out.println("es primo");
                }
                else{
                    System.out.println("no es primo");
                }
                break;
                
            case 4:
                System.out.println("Ingrese un numero base");
                numero = Leer.nextInt();
                while (numero < 0){
                    System.out.println("Ingrese un numero positivo");
                }
                
                System.out.println("Ingrese el nuemero de potencia");
                int potencia = Leer.nextInt();
                while (potencia < 0){
                    System.out.println("Ingrese un numero positivo");
                }
                
                int cont = 0;
                int acum = 1;
                
                if (potencia == 0){
                  System.out.println("El resultado es: "+acum);  
                }
                else{
                    while (cont < potencia){
                        acum = acum*numero;
                        cont = cont + 1;
                    }
                        System.out.println("El resultado es: " + acum);
                        
                }
                break;

            case 5:
            {    
                System.out.println("Ingrese el valor x");
                int x = Leer.nextInt();
                double n = 0;
                double sumatorio = 0;
                while (n<=20){
                    double auxiliar = (2*n)+1;
                    double fraccion1 = 1/(auxiliar);
                    double fraccion2 = ((double)x-1)/((double)x+1);
                    double pot = Math.pow(fraccion2, auxiliar);
                    double temporal = fraccion1*pot;
                    sumatorio+=temporal;
                    n++;
                }
                sumatorio = sumatorio*2;
                System.out.println("sumatoria: "+sumatorio);
                break;
            }
            
            case 6:
                System.out.println("Ingrese un numero entero positivo n: ");
                int n = Leer.nextInt();
                int a = 0;
                int b = 1;
                c = 1;
                int d = n;
                cont = 0;
                System.out.println("La serie Farey de orden es: ");
                
                while (c<=n){
                    int k = (n+b)/d;
                    int aa = a;
                    int bb = b;
                    int cc = c;
                    int dd = d;
                    a = cc;
                    b = dd;
                    c = k*cc-aa;
                    d = k*dd-bb;
                    cont++;
                    
                    System.out.println("("+aa+"/"+bb+","+cc+"/"+dd+")");
                    
                    if (a==1&& b==1){
                        break;
                    }
                }
                
                default :
                    if (opcion !=4){
                        
                    }
                    break;       
                    
               
                
        }//Fin while 
         System.out.print("Desea continuar con el menu? Presiona 1 o 2. Caso contrario presiones '3':  ");
         Respuesta = Leer.nextInt();
        
        // TODO code application logic here
    } //Fin del metodo main
    }
    
    
} //Fin de la clase
