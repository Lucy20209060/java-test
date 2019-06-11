package com.luchaoet.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
//        int a = result();
//        System.out.println("结果："+a);

        System.out.println("***********************");

//        装箱 把基本数据类型转换成包装类
//        自动装箱
        int t1 = 2;
        Integer t2 = t1;
//        手动装箱
        Integer t3 = new Integer(t1);

        System.out.println("t1="+ t1);
        System.out.println("t2="+ t2);
        System.out.println("t3="+ t3);

        System.out.println("***********************");

//        拆箱 把包装类转化为基本数据类型
//        自动拆箱
        int t4 = t2;
//        手动拆箱
        int t5 = t2.intValue();
        float t6 = t2.floatValue();
        String t7 = t2.toString();
//        int转字符串
        String t8 = Integer.toString(t1);
//        字符串转int
        int t9 = Integer.parseInt(t7);
//        valueOf 先将字符串转化为包装类 再通过自动拆箱转化为基本数据类型
        int t10 = Integer.valueOf(t7);

        System.out.println("t4="+ t4);
        System.out.println("t5="+ t5);
        System.out.println("t6="+ t6);
        System.out.println("t7="+ t7);
        System.out.println("t8="+ t8);
        System.out.println("t9="+ t9+", t10="+t10);



    }

    public static int result(){
        Scanner input = new Scanner(System.in);
        System.out.println("--------- 开始 ---------");
        try{
            System.out.print("输入第一个值：");
            int one = input.nextInt();
            System.out.print("输入第二个值：");
            int two = input.nextInt();
            System.out.println("one/two = "+ one/two);
            return one/two;
//            System.exit(1);
        }catch (ArithmeticException e){
            System.out.println("除数不能为零");
            return 0;
//            System.exit(1);
        }finally {
            System.out.println("--------- 结束 ---------");
//            return -10000;
        }
    }
}
