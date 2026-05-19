package kpi;

import java.util.*;

public class act0605 {
    public static void main (String[] args){
        MostrarBienvenida();
        
        CalcularDescuento(1500, 100);
        
        int numTicket = GenerarTicket();
        System.out.println("Numero de ticket: " + numTicket);
        
        int[] numeros = {10, 20, 30, 40, 50};
        double promedio = CalcularPromedio(numeros);
        System.out.println("El promedio es: " + promedio);
        
    }
    
    public static void MostrarBienvenida(){
        System.out.println("Bienvenido");
    }
    
    public static void CalcularDescuento(int valorTotal, int descuentoAplicado){
        valorTotal -= descuentoAplicado;
        System.out.println("El descuento de " + descuentoAplicado + " deja un valor total de " + valorTotal);
    }
    
    public static int GenerarTicket(){
        Random rand = new Random();
        int ticket = rand.nextInt(101);
        return ticket;
    }
    
    public static double CalcularPromedio(int[] numeros){
        int suma = 0;
        for (int i = 0; i < numeros.length; i++) {
            suma += numeros[i];
        }
        return (double) suma / numeros.length;
    }
    
}
