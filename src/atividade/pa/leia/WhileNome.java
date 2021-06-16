package atividade.pa.leia;

import javax.swing.JOptionPane;

public class WhileNome {
    public void nomeWhile() {

        // Input que irá receber um texto
        String nome = JOptionPane.showInputDialog("Coloque o seu nome: ");
        JOptionPane.showMessageDialog(null, "Seu nome é: " + nome);

        // Atribuindo confirm pra continuar o sair
        int confirm = JOptionPane.showConfirmDialog(null, "Você quer continuar? ");

        // YES == 0
        if (confirm == 0) {
            while(nome == nome) {
                String nomeSegundo = JOptionPane.showInputDialog("Coloque o seu nome: ");
                JOptionPane.showMessageDialog(null, "Seu nome é: " + nomeSegundo);
                confirm = JOptionPane.showConfirmDialog(null, "Você quer continuar?");
                // NO == 1
                if (confirm == 1) {
                    finalizar();
                    break;
                }
            }
        } else {
                finalizar();
        }
    }
    public void finalizar() {
        JOptionPane.showMessageDialog(null, "Programa finalizado!");
    }
}
