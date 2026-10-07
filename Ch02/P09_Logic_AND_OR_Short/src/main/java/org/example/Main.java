package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean b0=false, b1=!b0;

        System.out.println("b0 = " + b0 + " b1 = " + b1 );   //false, true;
        System.out.println("b0 && b1 = " + (b0 && b1) );     //false
        System.out.println("b0 & b1 = "  + (b0 & b1) );      //false

        System.out.println("b0 || b1 = " + (b0 || b1) );     //true
        System.out.println("b0 | b1 = "  + (b0 | b1) );      //true

    }
}
