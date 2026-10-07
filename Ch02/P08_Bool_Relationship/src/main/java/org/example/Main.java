package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean b0, b1;
        b0 = false;
        b1 = !b0;  //logic invert;
        System.out.println("b0: " + b0 + " b1= " +b1);

        int b2 = 0xffffffff;   //? -1
        System.out.println("b2: " + b2);
        b2 = ~b2;  //value invert;
        System.out.println("b2: " + b2);

        int a=10, b=20;
        System.out.println("a>b = " + (a>b));   //false;
        System.out.println("a<b = " + (a<b));   //true;

        System.out.println("a==b = " + (a==b));   //false;
        System.out.println("a!=b = " + (a!=b));   //true;

    }
}
