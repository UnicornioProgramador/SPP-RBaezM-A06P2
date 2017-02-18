/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;
import java.util.Scanner;
/**
 *
 * @author Dany
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                int numero;
        numero = solicitarNumero();
        calcularFactorial(numero);
    }
    
    public static int solicitarNumero(){
        int N;
        System.out.println("Introduce un numero del cual desees calcular su factorial:");
        Scanner entradaNumero = new Scanner(System.in);
        N = entradaNumero.nextInt();
        if (N < 1 || N > 10){
            System.out.println("ERROR - NUMERO FUERA DE RANGO");
            solicitarNumero();
        } else {
            
        }
        return N;
    }
    
   public static void calcularFactorial(int N){
        int factorial, contador;
        contador = 1;
        factorial = 1;
        do {
            contador++;
            factorial = factorial*(contador);
        } while (contador < (N));
        System.out.println("El factorial del numero ingresado es: " + factorial);
    }
    
}
    
    

