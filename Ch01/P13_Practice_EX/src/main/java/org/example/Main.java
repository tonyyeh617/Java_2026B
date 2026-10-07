package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        long data = 0x2A2B;
        System.out.println("data=" + data);
        System.out.printf("data=%d%n" ,  data); //%d:表示十進制輸出, %n:表示跳行

        long data2 = 1234567;
        System.out.printf("data2=%x" ,  data2); //%d:表示十六進制輸出
    }
}
