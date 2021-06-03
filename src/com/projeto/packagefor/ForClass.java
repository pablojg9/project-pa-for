package com.projeto.packagefor;

import javax.swing.JOptionPane;

public class ForClass {

    public void loopFor() {
        StringBuilder stringBuilder = new StringBuilder();
       int counter = 1;

        do {
            stringBuilder.append("número: ").append(counter).append("\n");
            counter++;
        } while(counter <= 10);

        JOptionPane.showMessageDialog(null, stringBuilder.toString());

    }

}
