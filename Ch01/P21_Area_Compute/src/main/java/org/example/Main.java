package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        final double PI=3.14;       //final in Java, is Constant;
        System.out.println("PI = " + PI);

        double radius;
        String str = JOptionPane.showInputDialog(null, "請輸入半徑: ");
        radius = Double.parseDouble(str);

        double area;
        area = PI*radius*radius;
        JOptionPane.showMessageDialog(null, area);
    }
}
