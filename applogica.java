
package kpi;
import java.util.*;

public class applogica {
    public static void main(String[] args){
        System.out.println("Ingrese su edad:");
        Scanner entradaEdad = new Scanner (System.in);
        int edad = entradaEdad.nextInt();
        
        System.out.println("Ingrese su sueldo mensual: ");
        Scanner entradaSueldo = new Scanner (System.in);
        double sueldo = entradaSueldo.nextDouble();
        
        System.out.println("¿Tiene deudas pendientes? Ingrese 1 por si o 0 por no.");
        Scanner entradaDeudas = new Scanner (System.in);
        int deudas = entradaDeudas.nextInt();
        
        System.out.println("¿Tiene garantia de propietario? Ingrese 1 por si o 0 por no");
        Scanner entradaGarantia = new Scanner (System.in);
        int garantia = entradaGarantia.nextInt();
        
        if((edad >= 18) && (sueldo > 1200000)){
            // Es mayor/igual a 18 años y sueldo mayor a 1kk200k
            if(deudas == 0){
                // No tiene deudas pendientes
                System.out.println("CREDITO APROBADO.");
            }
            else if(garantia == 1){
                // Tiene deudas pero posee una propiedad propia
                System.out.println("CREDITO APROBADO.");
            }
            else{
                System.out.println("CREDITO RECHAZADO.");
                }
            }
        else{
            if(edad < 18){
                System.out.println("Eres menor, CREDITO RECHAZADO.");
            }
       
            if(sueldo <= 1200000){
                System.out.println("Tu sueldo es menor a 1 millon 200 mil, CREDITO RECHAZADO.");
            }
        }
        
    }
}