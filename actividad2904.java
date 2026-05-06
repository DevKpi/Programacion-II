package kpi;

import java.util.*;

public class actividad2904 {
    public static void main(String[] args){
        
        int tam = 0;
        Scanner entrada;
        
        do{
            System.out.println("Ingrese el tamaño del arreglo.");
            System.out.println("El tamaño debe ser mayor a 0");
            entrada = new Scanner (System.in);
        } while ( tam <= 0);
        
        if(entrada.hasNextInt()){
            tam = entrada.nextInt();
        }
        entrada.close();
        
        int[] arreglo = new int[tam];
            
        for(int i = 0; i < tam; i++){
           System.out.println("Ingrese un valor entero para la posición acutal [" + i + "]");
           Scanner ing = new Scanner (System.in);
           arreglo [i] = ing.nextInt();
        }
            
        while (){
            
        }
        
    }
}
