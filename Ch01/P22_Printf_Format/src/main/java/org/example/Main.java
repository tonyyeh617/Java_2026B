package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        int x;         //變數宣告;
        x=12345;       //變數設定;
        double y=123.45;   //變數的宣告與設定, 可以寫在同一行;
        String s = "Exact";

        System.out.println("x: " + x );         //"x: ", 串接, x.toString(); 形成一個新的大的字串;
        System.out.printf("x: %8d%n", x );      //%8d: 8 is width, d:decimal
        System.out.printf("x: %-8d%n", x );     //%-8d: 8 is width, d:decimal, -靠左對齊;

        System.out.println("y: " + y );
        System.out.printf("y: %8.2f%n", y );    //%8.2f: 8 is width, 2是小數點位數, f:浮點數;
        System.out.printf("y: %-8.2f%n", y );   //%8.2f: 8 is width, 2是小數點位數, f:浮點數;

        System.out.println("s: " + s );
        System.out.printf("s: %8s%n", s );      //%8s: 8 is width, s:字串;
        System.out.printf("s: %-8s%n ", s );
    }
}
