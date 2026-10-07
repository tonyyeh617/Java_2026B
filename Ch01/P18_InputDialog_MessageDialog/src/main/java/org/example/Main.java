package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String input; //String Type, var name called input;
        int    x;     //int Type, var name called x;

        x=123;
        System.out.println("x: " + x);

        input = "Hello Java !!!";
        System.out.println("input: " +input );

        input = JOptionPane.showInputDialog(null, "What is Your Name?");
        System.out.println("input: " +input );

    }
}
