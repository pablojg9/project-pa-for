package atividade.pa.inverso;

import java.util.Scanner;
import java.util.function.DoubleToIntFunction;

public class InverseClass {

    void inverso() {
        Scanner scanner = new Scanner(System.in);

        float[] numero = new float[10];

        for (int counter = 0; counter < numero.length; counter++) {
            System.out.println("Coloque o " + (counter + 1)+ "º " + "número");
            numero[counter] = scanner.nextInt();
        }
        System.out.println("\nOs número que você colocou de forma invertida!: ");

        for(int counter = numero.length-1; counter > 0; counter--){
            System.out.println("número: " + counter+ "º " + numero[counter]);
        }
    }
}
