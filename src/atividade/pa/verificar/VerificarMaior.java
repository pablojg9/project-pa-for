package atividade.pa.verificar;

import javax.swing.JOptionPane;

public class VerificarMaior {

    public void verificar() {
        String input = JOptionPane.showInputDialog("Coloque um número: ");

        int verificarInput = Integer.parseInt(input);

        if (verificarInput >= 100) {
            JOptionPane.showMessageDialog(null, "O seu número é maior que 100!");
        } else {
            JOptionPane.showMessageDialog(null, "O seu número é " + verificarInput
                    + " e é menor que 100");
        }



    }

}
