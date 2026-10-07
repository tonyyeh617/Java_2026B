package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x=25, y=3, result;

        System.out.println("x+y = " + (x+y) );   //先做運算(28), 再字串串接;
        System.out.println("x+y = " + x+y );     //字串串接; 253

        System.out.println("x-y = " + (x-y) );
        System.out.println("x*y = " + (x*y) );
        System.out.println("x/y = " + (x/y) );
        System.out.println("x/y = " + (x/(double)y) );
        System.out.println("x%y = " + (x%y) );

    }
}
