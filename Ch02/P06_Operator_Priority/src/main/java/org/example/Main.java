package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x, xx;
        x=5+6*7+8;          //5+42+8 = 55;
        xx=(5+6)*7+8;       //11*7+8 = 85;
        System.out.println("x= " +x + " xx= " + xx);

        int y=6;

        x=5+y*7+8;          //5+42+8 = 55;
        xx=(5+y)*7+8;       //11*7+8 = 85;
        System.out.println("x= " +x + " xx= " + xx);

        x=5+y++*7+8;        //5+42+8 = 55; y=7;
        xx=(5+y--)*7+8;     //12*7+8 = 92; y=6;
        //xx=(5+--y)*7+8;     //77+8 = 85; y=6;
        System.out.println("x= " +x + " xx= " + xx);
        System.out.println("x= " +x + " y= " + y);   //x=55, y=6;

    }
}
