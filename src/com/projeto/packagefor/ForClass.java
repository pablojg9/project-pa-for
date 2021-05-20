package com.projeto.packagefor;

import javax.swing.*;

public class ForClass {

    public void loopFor() {
        StringBuilder stringBuilder = new StringBuilder();


        for (int x = 1; x <= 10; x++) {
            stringBuilder.append("número: " + x + "\n");
        }
        JOptionPane.showMessageDialog(null, stringBuilder.toString());

    }

}
