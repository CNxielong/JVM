package com.icbc.thread;

/**
 * 当前主线程名
 *
 * @Auther: XDragon
 * @Date: 2021/2/12/012 15:01
 * @Email:cnxielong@gmail.com
 */
public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println("当前线程名称：" + Thread.currentThread().getName());
    }
}
