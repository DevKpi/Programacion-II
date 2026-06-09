package kpi;

import java.util.*;

public class act2605 {
    public static void main(String[] args) {
        ArrayList<Double> movimientos = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        
        boolean continuar = true;
        
        System.out.println("(Ingresos: valores positivos | Egresos: valores negativos)");
        System.out.println("Para finalizar la carga, ingrese el valor 0.");

        while(continuar) {
            System.out.println("Ingrese el monto de la transferencia: ");
            double monto = scanner.nextDouble();

            if(monto == 0) {
                continuar = false;
            }else{
                movimientos.add(monto);
            }
        }

        double saldoTotal = 0;
        
        System.out.println("Historial de movs");
        for(double mov : movimientos) {
            System.out.println("Movimiento: $" + mov);
            saldoTotal += mov;
        }

        System.out.println("Cantidad total de transacciones realizadas: " + movimientos.size());
        System.out.println("Saldo final de la cuenta: $" + saldoTotal);
        scanner.close();
    }
}
