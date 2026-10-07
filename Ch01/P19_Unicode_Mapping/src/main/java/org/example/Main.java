package org.example;

import javax.swing.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        String input;
        input = JOptionPane.showInputDialog(null, "請輸入一個字元: ");
        char[] chArray = input.toCharArray();
        int unicode = (int)chArray[0];   //Type Casting;
        String unicode_Hex = Integer.toHexString(unicode);
        JOptionPane.showMessageDialog(null, "所對應的unicode: " + unicode_Hex);

        char chineseChar = '張'; // 輸入你想查詢的中文字
    }
}
