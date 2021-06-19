package atividade.pa.solicitar;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Note extends JDialog {

    private JTextField text = null;



    public Note() {
        requestNote();

        setVisible(true);
    }


    public void requestNote(){
        setTitle("Request Note");
        setSize(new Dimension(500, 500));
        setLocationRelativeTo(null);
        setResizable(false);

        JButton buttonCalculate = new JButton("Calcular");
        buttonCalculate.setBounds(300, 300, 20, 20);
        getContentPane().add(buttonCalculate);

        JButton buttonTeste = new JButton("Teste");
        buttonCalculate.setBounds(10, 10, 10, 10);
        getContentPane().add(buttonTeste);








    }
}
