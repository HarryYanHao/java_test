package com.harry.demo;

public class PrimitveTypeTest {
    static boolean bool;
    static byte by;
    static char ch;
    static double d;
    static float f;
    static int i;
    static long l;
    static short sh;
    static String str;

    public static void main(String[] args) {
        //byte
        System.out.println("基本类型:byte 二进制位数：" + Byte.SIZE);
        System.out.println("包装类 java.lang.Byte");
        System.out.println("最小值" + Byte.MIN_VALUE);
        System.out.println("最大值" + Byte.MAX_VALUE);
        System.out.println();

        //short
        System.out.println("基本类型:short 二进制位数：" + Short.SIZE);
        System.out.println("包装类 java.lang.Short");
        System.out.println("最小值" + Short.MIN_VALUE);
        System.out.println("最大值" + Short.MAX_VALUE);
        System.out.println();

        //int
        System.out.println("基本类型:int 二进制位数：" + Integer.SIZE);
        System.out.println("包装类 java.lang.Integer");
        System.out.println("最小值" + Integer.MIN_VALUE);
        System.out.println("最大值" + Integer.MAX_VALUE);
        System.out.println();

        //long
        System.out.println("基本类型:long 二进制位数：" + Long.SIZE);
        System.out.println("包装类 java.lang.Long");
        System.out.println("最小值" + Long.MIN_VALUE);
        System.out.println("最大值" + Long.MAX_VALUE);
        System.out.println();

        //float
        System.out.println("基本类型:float 二进制位数：" + Float.SIZE);
        System.out.println("包装类 java.lang.Float");
        System.out.println("最小值" + Float.MIN_VALUE);
        System.out.println("最大值" + Float.MAX_VALUE);
        System.out.println();

        //double
        System.out.println("基本类型:double 二进制位数：" + Double.SIZE);
        System.out.println("包装类 java.lang.Double");
        System.out.println("最小值" + Double.MIN_VALUE);
        System.out.println("最大值" + Double.MAX_VALUE);
        System.out.println();

        //char
        System.out.println("基本类型：double 二进制位数" + Double.SIZE);
        System.out.println("包装类 java.lang.Character");
        System.out.println("最小值" + (int) Character.MIN_VALUE);
        System.out.println("最大值" + (int) Character.MAX_VALUE);

        final double PI = 3.1415026;
        byte a = 68;
        char c = 'A';
        int decimal = 100;
        int octal = 0144;
        int hexa = 0x65;
        System.out.println(a);
        System.out.println(c);
        System.out.println(decimal);
        System.out.println(octal);
        System.out.println(hexa);

        //默认值
        System.out.println("Bool:" + bool);
        System.out.println("Byte:" + by);
        System.out.println("Character:" + ch);
        System.out.println("Double:" + d);
        System.out.println("Float:" + f);
        System.out.println("Integer" + i);
        System.out.println("Long" + l);
        System.out.println("Short:" + sh);
        System.out.println("String:" + str);

        //数据类型转换
        //--溢出
        int i = 1281;
        byte b = (byte) i;
        System.out.println(b);

        //浮点数通过舍弃小数转换整数
        System.out.println((int) 23.7);
        System.out.println((int) -45.89f);

        //自动类型转换
        char c1 = 'a';
        int i1 = c1; //char类型自动转换为int
        System.out.println("char自动类型转换为int后的指等于" + i1);

        char c2 = 'A';
        int i2 = c2 + 1;
        System.out.println("char类型和int计算后的值等于" + i2);

        //强制类型转换
        int i3 = 123;
        byte b3 = (byte) i3;
        System.out.println("int强制类型转换为byte后的值等于" + b3);
    }
}

