package atividade.pa.imprimir;

import javax.swing.JOptionPane;

public class ImprimirFor {
    public void imprimir() {
        StringBuilder stringBuilder = new StringBuilder();

        String inputTexto = JOptionPane.showInputDialog("Coloque um texto: ");

        for (int counter = 1; counter <= 20; counter++) {
            stringBuilder.append(counter+ "º " +inputTexto + "\n");
        }
        JOptionPane.showMessageDialog(null, stringBuilder.toString());
    }
}
