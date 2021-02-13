package com.icbc.thread;

/**
 * 测试Thread子类 多线程
 * @Auther: XDragon
 * @Date: 2021/2/12/012 15:53
 * @Email:cnxielong@gmail.com
 */
public class MyThreadTest {
    public static void main(String[] args) {
        MyThread t1 = new MyThread("线程1");
        MyThread t2 = new MyThread("线程2");
        MyThread t3 = new MyThread("线程3");
        t1.start();
        t2.start();
        t3.start();
    }
}
