package kpi;

import java.util.*;

public class calculosmentales {
    public static void maindd(String[] args) {

        Scanner ingreso = new Scanner(System.in);

        if (ingreso.hasNextDouble()) {
            double R = ingreso.nextDouble();

            double paso1 = R + 5f;

            double paso2 = paso1 * paso1;

            double tercioR = R / 3f;
            double paso3 = paso2 / tercioR;

            double paso4 = paso3 * paso3 * paso3;

            //System.out.println(R, paso1, paso2, paso3, paso4);
            System.out.printf("%f %f %f %f %f\n", R, paso1, paso2, paso3, paso4);
        }
        
        ingreso.close();
    }
}
