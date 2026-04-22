
package kpi;
import java.util.*;

public class usandoswitch {
    public static void main(String[] args){
        /*
        System.out.println("Ingrese un número");
        Scanner entrada  = new Scanner (System.in);
        
        int numuser = entrada.nextInt();
        
        if(numuser < 0){
            System.out.println("El número ingresado es mayor a cero");
            }
        else System.out.println("El número ingresado es menor a cero");

        */
        
        /*System.out.println("Ingresa un valor de temperatura:");
        Scanner entrada = new Scanner (System.in);
        
        float temperatura = entrada.nextFloat();
        
        if(temperatura > 30.00 ){
            System.out.println("Alerta de temperatura");
        }*/
        
        /*
        System.out.println("Ingrese un número entero: ");
        Scanner entrada = new Scanner (System.in);
        
        int num3 = entrada.nextInt();
        
        if(num3 % 2 == 0){
            System.out.println("Ingresaste un número par");
        }
        else System.out.println("El número ingresado es impar"); 
        */
        
        /*
        System.out.println("Ingrese una calificación con un número entero entre 0 y 10");
        
        Scanner entrada4 = new Scanner (System.in);
        int calif = entrada4.nextInt();
        
        switch(calif){
            case 0, 1, 2, 3 -> {
                System.out.println("Desaprobado"); 
                break;
            }
            case 4, 5, 6 -> {
                System.out.println("Aprobado");
                break;
            }
            case 7, 8 -> {
                System.out.println("Sobresaliente");
                break;
            }
            case 9, 10 -> {
                System.out.println("Excelente");
                break;
            }
            default -> {
                System.out.println("Calificación fuera de rango");
                break;
            }
        }
        
        if((calif >= 0) && (calif<= 10)){
            if((calif >= 0) && (calif <= 3)){
                System.out.println("Desaprobado");
            }
            else if ((calif >= 4) && (calif <= 6)){
                System.out.println("Aprobado");
            }
            else if ((calif == 7) || (calif == 8)){
                System.out.println("Sobresaliente");
            }
            else if ((calif == 9) || (calif == 10)){
                System.out.println("Excelente");
            }
        }
        else System.out.println("Calificación fuera de rango");
        */
        
        
        /*
       System.out.println("Ingrese la temperatura del agua:");
       Scanner entrada = new Scanner (System.in);
       
       float tempagua = entrada.nextFloat();
       
       if(tempagua < 0.00){
           System.out.println("Agua en estado sólido");
       }
       else if(tempagua >= 0.00 && tempagua <= 100.00){
           System.out.println("Agua en estado liquido");
       }
       else if(tempagua > 100.00){
           System.out.println("Agua en estado gaseoso");
       }
    
       */
        
        
        System.out.println("Ingrese un numero");
        Scanner entradanum1 = new Scanner (System.in);
        
        float numuno = entradanum1.nextFloat();
        
        System.out.println("Ingrese otro numero");        
        Scanner entradanum2 = new Scanner (System.in);        
        float numdos = entradanum2.nextFloat();
        
        System.out.println("Ingrese un caracter");       
        Scanner entradacaract = new Scanner (System.in);    
        String caract = entradacaract.nextLine();
        
        
        
    }

}



