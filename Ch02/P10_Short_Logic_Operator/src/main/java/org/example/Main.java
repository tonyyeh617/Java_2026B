package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        boolean b0 = false;
        int i = 8;
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 8
        System.out.println("b0 && (i++==8) =  " + (b0 && (i++==8)));   //false
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 8
        System.out.println("b0 & (i++==8) =  "  + (b0 & (i++==8)));   //false, i=? 8->9
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 9

        i=8;
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 8
        System.out.println("b0 || (i++==8) =  " + (b0 || (i++==8)));   //true, i= 8->9
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 9
        System.out.println("b0 | (i++==8) =  "  + (b0 | (i++==8)));    //false, i=? 9->10
        System.out.println("b0 = " + b0 + " i= " + i);   //false, 10

        i=8;
        b0 = !b0;
        System.out.println("b0 = " + b0 + " i= " + i);   //true, 8
        System.out.println("b0 || (i++==8) =  " + (b0 || (i++==8)));   //true, i= 8
        System.out.println("b0 = " + b0 + " i= " + i);   //true, 8
        System.out.println("b0 | (i++==8) =  "  + (b0 | (i++==8)));    //true, i=? 8->9
        System.out.println("b0 = " + b0 + " i= " + i);   //true, 9

    }
}
