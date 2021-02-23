package com.icbc.thread;

/**
 * @Auther: XDragon
 * @Date: 2021/2/12/012 16:06
 * @Email:cnxielong@gmail.com
 */
public class MyRunnableTest {
    public static void main(String[] args) {
        MyRunnable myRunnable1 = new MyRunnable("myRunnable1");
        MyRunnable myRunnable2 = new MyRunnable("myRunnable2");
        MyRunnable myRunnable3 = new MyRunnable("myRunnable3");
        System.out.println("Runnable启动--------");
        myRunnable1.run();//不能多线程
        myRunnable2.run();//不能多线程
        myRunnable3.run();//不能多线程
        System.out.println("Thread启动-----");
        Thread t1 = new Thread(myRunnable1);
        Thread t2 = new Thread(myRunnable2);
        Thread t3 = new Thread(myRunnable3);
        t1.start();
        t2.start();
        t3.start();
    }
}
