package kpi;

import java.util.*;

public class horaplaneta {
    public static void main(String[] args){
        
        Scanner entrada = new Scanner(System.in);

        if (entrada.hasNextInt()) {
            int S = entrada.nextInt();

            int segundos = S % 50;
            int minutosTotales = S / 50;

            int minutos = minutosTotales % 70;
            int horasTotales = minutosTotales / 70;

            int horas = horasTotales % 12;
            int dias = horasTotales / 12;

            System.out.print(dias + " ");
            System.out.print(horas + " ");
            System.out.print(minutos + " ");
            System.out.print(segundos + " ");
        }
        
        entrada.close();
    }
}
