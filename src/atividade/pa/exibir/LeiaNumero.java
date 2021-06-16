package atividade.pa.exibir;

import java.util.Scanner;

public class LeiaNumero {
    public void exibirNumero() {
        Scanner scanner = new Scanner(System.in);

        float[] posicaoArray = new float[10];

        for (int counter = 0; counter < posicaoArray.length; counter++) {
            System.out.println("Coloque o " + (counter + 1) + " primeiro número: ");
            posicaoArray[counter] = scanner.nextFloat();

        }
        System.out.println("Os número que você colocou são: ");

        for (float posicaoArrayLoop : posicaoArray) {
            System.out.println("número: " + posicaoArrayLoop);
        }

    }
}
