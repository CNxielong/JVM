package com.icbc.javabasic.bytecode;

/**
 * 测试JAVA 字节码
 *
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/3/003
 */
public class ByteCodeSample {
    public static void main(String[] args) {
        int i = 1;
        int j = 2;
        i++;
        ++j;
        System.out.println("i:"+i+" j:"+j);
    }
}
