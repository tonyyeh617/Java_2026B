package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String str = JOptionPane.showInputDialog(null, "請輸入一個浮點數:");
        double d1 = Double.parseDouble(str);

        str = JOptionPane.showInputDialog(null, "請輸入另一個浮點數:");
        double d2 = Double.parseDouble(str);

        double result;
        result = d1 + d2;

        JOptionPane.showMessageDialog(null, result);

    }
}
