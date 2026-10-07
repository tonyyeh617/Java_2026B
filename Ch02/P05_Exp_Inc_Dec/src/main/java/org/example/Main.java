package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x=2, pow = 3; // 2^3 = 8;

        System.out.println("x^pow = " + Math.pow(x, pow)); //數學公理只有一份;

        ++x;     //x:2->3
        pow--;   //pow: 3->2

        System.out.println("x= " + x + " pow= " + pow);
        System.out.println("x^pow = " + Math.pow(x, pow)); //數學公理只有一份;

        double dx=2.2, dpow = 3.1234567; // 2.2^3.1234567 = 11.7366;
        System.out.println("dx^dpow = " + Math.pow(dx, dpow)); //數學公理只有一份;

    }
}
