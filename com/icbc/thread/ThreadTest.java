package com.icbc.thread;

/**
 * @Auther: XDragon
 * @Date: 2021/2/12/012 15:10
 * @Email:cnxielong@gmail.com
 */
public class ThreadTest {
    public static void run() {
        System.out.println("ThreadTest 的 run方法");
        System.out.println("当前线程名称：" + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread t = new Thread(){
            public void run(){
                ThreadTest.run();//调用方法
//                run();//默认调用thread的run方法 死循环 StackOverflowError
            }
        };
        System.out.println("当前主线程名称：" + Thread.currentThread().getName());//当前线程名称：main
        t.run();//无法开启多线程 当前线程名称：main
        t.start();//可以开启多线程 当前线程名称：Thread-0
    }
}
