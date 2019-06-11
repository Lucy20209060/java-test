package com.luchaoet.test;

import java.util.Scanner;

public class Test {

    public static void main(String[] args){
        int a = result();
        System.out.println("结果："+a);

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
