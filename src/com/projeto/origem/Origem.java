package com.projeto.origem;

import javax.swing.JOptionPane;

public class Origem {

    public void leiaOrigem() {

        try {
            String input = JOptionPane.showInputDialog("Coloque o número de 1 a 4");
            int number = Integer.parseInt(input);

            switch (number) {
                case 1:
                    JOptionPane.showMessageDialog(null, "Código 1: Sul");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Código 2: Norte");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "Código 3: Leste");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "Código 4: Oeste");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Código não encontrado");
                    leiaOrigem();
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Você não pode colocar letras, só números");
            leiaOrigem();

        }


    }



}
