package kpi;

import java.util.*;

public class applogicaModular {
    public static void main(String[] args){
        Scanner entrada = new Scanner (System.in);
        int edad = pedirEntero(entrada, "Ingrese su edad: ");
        double sueldo = pedirDouble(entrada, "Ingrese su sueldo mensual: ");
        int deudas = pedirEntero(entrada, "Ingrese 1 si tiene deudas pendientes o 0 si no tiene deudas: ");
        int garantia = pedirEntero(entrada, "Ingrese 1 si posee garantia o 0 si no tiene propiedad: ");
        
        evaluarCred(edad, sueldo, deudas, garantia);
        
        scanner.close();
    }
    
    public static int pedirEntero(Scanner entrada, String mensaje){
        System.out.println(mensaje);
        return entrada.nextInt();
    }
    
    
}
