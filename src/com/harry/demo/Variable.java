package com.harry.demo;

public class Variable {
    int a,b,c;//声明三个int类型整数 a b c
    int d = 3 , e = 4, f = 5;//声明三个整数并赋予初值
    byte z = 22;
    String s = "runoob";
    double pi = 3.14159;
    char x = 'x';

    static int allClicks = 0 ; //类变量 独立于方法外的变量，用static修饰
    String str = "hello world";//实例变量 独立于方法外的变量 没有static修饰
    public void method(){
        int i = 0;//局部变量 局部变量在栈上分配 局部变量没有默认值，所以局部变量被声明后必须经过初始化才可以使用
    }
    public void pupAge(){
        int age = 0;
        age = age + 7;
        System.out.println("小狗的年龄是:" + age);
    }
    public static void main(String [] args){
        Variable variable = new Variable();
        variable.pupAge();
    }
}
