package com.harry.demo;

public class Test {
    public static void main(String[] args){
        int a = 10;
        int b = 20;
        int c = 25;
        int d = 25;
        System.out.println("a + b="+(a + b));
        System.out.println("a - b="+(a - b));
        System.out.println("a * b="+(a * b));
        System.out.println("b / a="+(b / a));
        System.out.println("b % a="+(b % a));
        System.out.println("c % a="+(c % a));
        System.out.println("a++="+(a++));
        System.out.println("a--="+(a--));
        // 查看  d++ 与 ++d 的不同
        System.out.println("d++   = " +  (d++) );
        System.out.println("++d   = " +  (++d) );

        int a1 = 5;//定义一个变量；
        int b1 = 5;
        int x = 2*++a1;
        int y = 2*b1++;
        System.out.println("自增运算符前缀运算后a="+a1+",x="+x);
        System.out.println("自增运算符后缀运算后b="+b1+",y="+y);

        int a2 = 10;
        int b2 = 20;
        System.out.println("a == b = " + (a2 == b2) );
        System.out.println("a != b = " + (a2 != b2) );
        System.out.println("a > b = " + (a2 > b2) );
        System.out.println("a < b = " + (a2 < b2) );
        System.out.println("b >= a = " + (b2 >= a2) );
        System.out.println("b <= a = " + (b2 <= a2) );

        int x1 = 10;
        while(x1 < 20){
            System.out.print("value of x :" + x1);
            x1++;
            System.out.print("\n");
        }

        do{
            System.out.print("value of x :" + x1);
            x1++;
            System.out.print("\n");
        }while(x1 <= 22);

    }
}
