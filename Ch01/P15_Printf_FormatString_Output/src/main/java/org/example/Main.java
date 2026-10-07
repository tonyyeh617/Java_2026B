package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        System.out.printf("byte數值範圍%d ~ %d%n", Byte.MIN_VALUE, Byte.MAX_VALUE);
        System.out.printf("short數值範圍%d ~ %d%n", Short.MIN_VALUE, Short.MAX_VALUE);
        System.out.printf("int數值範圍%d ~ %d%n", Integer.MIN_VALUE, Integer.MAX_VALUE);
        System.out.printf("long數值範圍%d ~ %d%n", Long.MIN_VALUE, Long.MAX_VALUE);

        System.out.printf("float數值範圍%f ~ %f%n", -Float.MAX_VALUE, Float.MAX_VALUE);
        System.out.printf("double數值範圍%f ~ %f%n", -Double.MAX_VALUE, Double.MAX_VALUE);
    }
}
