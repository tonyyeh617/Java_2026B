package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("請輸入一個整數: ");
        int i1 = scanner.nextInt();
        System.out.println("i1 = " + i1);

        System.out.println("請輸入一個浮點數: ");
        double db1 = scanner.nextDouble();
        System.out.println("db1 = " + db1);

        System.out.print("請輸入一個字串: ");
        String str = scanner.next();
        System.out.println("str = " + str);
    }
}
