package com.projeto.tabuada;

import javax.swing.JOptionPane;
import java.util.WeakHashMap;

public class Tabuada {
    StringBuilder stringBuilder = new StringBuilder();

    public void calcularTabuada() {
        String tabuada = JOptionPane.showInputDialog("Coloque um número para calcular a tabuada: ");

        int cont = Integer.parseInt(tabuada);

        stringBuilder.append("A tabuada do ").append(cont).append(":").append("\n ");

        for (int x = 1; x <= 10; x++) {
            stringBuilder.append(x + " x " + cont + " = " + (x * cont) + "\n");
        }

        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }
}

