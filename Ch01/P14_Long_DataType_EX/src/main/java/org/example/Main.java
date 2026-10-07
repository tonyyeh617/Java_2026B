package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        System.out.println("Long Min: " + Long.MIN_VALUE +  " " + "Long Max: " + Long.MAX_VALUE);
        long L = 0;
        L = 123456789L;
        System.out.println("L: " + L);

        L = 987_654_321L;
        System.out.println("L: " + L);

        L = 98_7654_3210L;
        System.out.println("L: " + L);
    }
}
