package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {
        int x;      //4B
        long y;     //8B;
        x=123;
        y=456;

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x=0b101;    //4+1=5                        //以0b開始,表示二進制; //0,1
        y=0B111;    //4+2+1=7

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x=0127;    //1*8^2+2*8^1+7=64+16+7 = 87;   //以0開始,表示八進制; //0,1,2,3,4,5,6,7
        y=0172;    //1*8^2+7*8^1+2=64+56+2 = 122;

        System.out.println("x= " + x);
        System.out.println("y= " + y);

        x=0x1AB;    //1*16^2+10*16^1+11=256+160+11 = 427;   //以0x開始,表示十六進制; //0,1,2,3,4,5,6,7,8,9,A,B,Ｃ,D,E,F
        y=0X2CD;    //427+256+2*16+2 = 427+290 = 717

        System.out.println("x= " + x);      //字串串接;
        System.out.println("y= " + y);

        y=717;
        System.out.printf("y= %x", y);      //格式規範子;%x:以十六進制作為輸出格式.
    }
}
