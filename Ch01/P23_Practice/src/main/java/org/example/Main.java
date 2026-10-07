package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        double d1, d2, result;
        Scanner scanner = new Scanner(System.in);

        System.out.println("請輸入一個浮點數: ");
        d1 = scanner.nextDouble();

        System.out.println("請輸入下一個浮點數: ");
        d2 = scanner.nextDouble();

        result = d1 + d2;
        System.out.println("result: " + result);

    }
}
