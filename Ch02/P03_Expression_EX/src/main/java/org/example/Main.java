package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x, y, z;  //operands, 運算元;

        x=y=z=100;

        System.out.println("x:"+x + " y:"+y + " z:"+z);
        JOptionPane.showMessageDialog(null, "x:"+x + " y:"+y + " z:"+z);

        int result;
        result = x+y+z;  //+:二元運算子, 用二次; =:指定運算子   //Expression result = x+y+z;
        System.out.println("result:"+result);
        JOptionPane.showMessageDialog(null, "result:"+result);

        x=(y=y+2) + (z=z+100);

        System.out.println("x:"+x);
        JOptionPane.showMessageDialog(null, "x:"+x);

    }
}
