package com.icbc.javabasic.model;

/**
 * Fibonacci数列 用于栈溢出 StackOverflowError
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/5/005 23:08
 */
public class Fibonacci {
    public static int  fibonacci(int i){
        if(i<=1){
            return 1;
        }else{
            return fibonacci(i-2)+fibonacci(i-1);
        }
    }
    public static void main(String[] args) {
        System.out.println(fibonacci(8));
        int fibonacci = fibonacci(100000);
        System.out.println(fibonacci);
    }
}
