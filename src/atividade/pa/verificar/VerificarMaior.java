package atividade.pa.verificar;

import java.util.Scanner;

public class VerificarMaior {

    public void verificar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Coloque um número: ");
        int verificarInput = scanner.nextInt();

        while (verificarInput < 100) {
            System.out.println("O número é menor que 100");
            verificarInput = scanner.nextInt();

        }

        System.out.println("O número é maior ou igual que 100");

    }

}
