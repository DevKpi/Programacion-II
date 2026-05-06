package kpi;

import java.util.*;

public class intercambiosminimos {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        if(entrada.hasNextInt()) {
            int a = entrada.nextInt();
            int b = entrada.nextInt();
            int c = entrada.nextInt();

            int intercambios = 99;


            if(a <= b && b <= c) 
            {
                intercambios = 0;
            } 
            else if((b <= a && a <= c) || (a <= c && c <= b) || (c <= b && b <= a)) 
            {
                intercambios = 1;
            }

            System.out.println(intercambios);
        }

        entrada.close();
        
    }
    
}
