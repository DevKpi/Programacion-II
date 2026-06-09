import java.util.ArrayList;
import java.util.Scanner;

public class AnalizadorNumerosDinamico {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Se define el arreglo dinámico (ArrayList)
        ArrayList<Integer> numeros = new ArrayList<>();
        
        System.out.println("=== CARGA DE NÚMEROS ===");
        System.out.println("Ingrese números enteros positivos (ingrese el 0 para finalizar):");

        // Bucle infinito que se rompe con la bandera
        while (true) {
            int num = cargarNumero(sc);

            if (num == 0) { // Corte por valor bandera
                break;
            }

            if (num > 0) {
                numeros.add(num); // Se agrega dinámicamente al final de la lista
            } else {
                System.out.println("⚠ Error: Por favor, ingrese solo números positivos o 0 para salir.");
            }
        }

        // Validamos si la lista tiene elementos usando el método isEmpty()
        if (!numeros.isEmpty()) {
            mostrarResultados(numeros);
        } else {
            System.out.println("No se ingresaron datos.");
        }

        sc.close();
    }

    // -------------------------------------------------------------------------
    // FUNCIONES SOLICITADAS
    // -------------------------------------------------------------------------

    // ➤ Para cargar de a uno los valores en el arreglo dinámico
    public static int cargarNumero(Scanner sc) {
        System.out.print("Ingrese un número: ");
        return sc.nextInt();
    }

    // ➤ Función principal que orquesta a las demás
    public static void mostrarResultados(ArrayList<Integer> lista) {
        System.out.println("\n====== RESULTADOS ======");
        
        mostrarTodosLosValores(lista);
        System.out.println("El mayor valor ingresado es: " + obtenerMayor(lista));
        System.out.println("Cantidad de números impares: " + contarImpares(lista));
        
        mostrarPrimos(lista);

        double promedioPares = calcularPromedioPares(lista);
        
        // ✔️ APLICACIÓN DE EXPRESIÓN TERNARIA
        String mensajePares = (promedioPares >= 0) 
                ? "El promedio de los números pares es: " + promedioPares 
                : "No hubo números pares ingresados.";
                
        System.out.println(mensajePares);
    }

    // Mostrar todos los valores ingresados
    public static void mostrarTodosLosValores(ArrayList<Integer> lista) {
        System.out.print("Todos los valores ingresados: ");
        for (int i = 0; i < lista.size(); i++) {
            // ✔️ EXPRESIÓN TERNARIA para el formato de impresión
            // Usamos .get(i) en lugar de [i] para acceder al valor
            System.out.print(lista.get(i) + (i == lista.size() - 1 ? "" : ", "));
        }
        System.out.println();
    }

    // Calcular el mayor valor
    public static int obtenerMayor(ArrayList<Integer> lista) {
        int mayor = lista.get(0);
        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i) > mayor) {
                mayor = lista.get(i);
            }
        }
        return mayor;
    }

    // Contar cantidad de números impares
    public static int contarImpares(ArrayList<Integer> lista) {
        int contador = 0;
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 != 0) { 
                contador++;
            }
        }
        return contador;
    }

    // Mostrar cantidad de números primos y cuáles son
    public static void mostrarPrimos(ArrayList<Integer> lista) {
        int contadorPrimos = 0;
        String listaPrimos = "";

        for (int i = 0; i < lista.size(); i++) {
            if (esPrimo(lista.get(i))) {
                contadorPrimos++;
                listaPrimos += lista.get(i) + " "; 
            }
        }

        System.out.println("Cantidad de números primos: " + contadorPrimos);
        if (contadorPrimos > 0) {
            System.out.println("Los números primos son: " + listaPrimos);
        }
    }

    // Función auxiliar matemática
    public static boolean esPrimo(int numero) {
        if (numero <= 1) return false;
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) return false;
        }
        return true;
    }

    // Calcular el promedio de los números pares
    public static double calcularPromedioPares(ArrayList<Integer> lista) {
        int suma = 0;
        int contadorPares = 0;

        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i) % 2 == 0) {
                suma += lista.get(i);
                contadorPares++;
            }
        }

        // ✔️ EXPRESIÓN TERNARIA
        return (contadorPares > 0) ? ((double) suma / contadorPares) : -1.0;
    }
}
