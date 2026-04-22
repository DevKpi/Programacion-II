
package kpi;
import java.util.*;

public class condicionales {
    public static void main(String[] args){
        /*int edad = 20;
        boolean tieneEntrada = true;
        boolean estaVetado = false;
        //if(((edad >= 20) && (!estaVetado)) || (tieneEntrada))
        if(((edad >= 20) && (estaVetado == false)) || (tieneEntrada = true)){
            System.out.println("Pasaste");
        }*/
        
        
        float promedio = 0;
        boolean esDeportista = true;
        float[] notas = new float[6];
        float ingresoEco = 100;
        
        for(int i = 0; i<=5; i++)
        {
            System.out.println("Ingrese una nota con un valor entre 0 y 10");
            Scanner entrada = new Scanner (System.in);
            
            float temp = entrada.nextFloat();
            
            if((temp >= 0) && (temp <= 10))
            {
                notas[i] = temp;
            }
            //entrada.close();
        }
        
        for(int j = 0; j<= 5; j++){
            promedio += notas[j];
        }
        
        promedio /= 6;
        
        if((promedio >= 8.00) && (esDeportista))
        {
            if(ingresoEco < 300000)
            {
                System.out.println("Te adjudicamos el 100% de la beca");
            }
            else 
            {
                System.out.println("Te adjudicamos el 75% de la beca");
            }
        }
        else if((promedio >= 8.00) && (!esDeportista) && (ingresoEco < 300000))
        {
            System.out.println("No eres deportista pero tienes un promedio mayor a 8 y un ingreso no superior a 300 mil.");
        }
        else{
            System.out.println("No cumples los requisitos minimos para que te adjudiquemos la beca");
        }
    }
}