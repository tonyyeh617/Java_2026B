package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x;          //變數宣告; Type variable Name; Comments; 註解;
        x=1;            //設定可以在不同行;
        int X = 10;     //變數宣告與設定寫在同一行;

        System.out.println("x= " + x );
        System.out.println("X= " + X );

        Byte xx = 12;
        Boolean b1 = true;
        Boolean b2 = false;
        Character c1 = 'A';

        System.out.println("xx:" + xx);
        System.out.println("b1:" + b1 +" "+ "b2:" + b2);
        System.out.println("c1:" + c1);

        int   _i1 = 345;
        short $s1 = 123;
        long  ll = 1234;
        double d1= 123.4567;
        float  f1= 12.34f;

        System.out.println("i1:" + _i1);
        System.out.println("s1:" + $s1);
        System.out.println("ll: " + ll + "d1: "  +d1 + "f1: " + f1);
        System.out.println("y: " + y);

    }
    static int y = 300;
}
