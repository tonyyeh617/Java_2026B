package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x=10, y=5;

        x += y;    // x=x+y;
        System.out.println("x= " + x + " y= " +y); //15, 5

        x -= y;    // x=x-y;
        System.out.println("x= " + x + " y= " +y); //10, 5

        x *= y;    // x=x*y;
        System.out.println("x= " + x + " y= " +y); //50, 5

        x /= y;    // x=x/y;
        System.out.println("x= " + x + " y= " +y); //10, 5

        x %= y;    // x=x%y;
        System.out.println("x= " + x + " y= " +y); //0, 5

    }
}
