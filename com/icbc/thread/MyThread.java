package com.icbc.thread;

/**
 * 继承Thread的线程
 * @Auther: XDragon
 * @Date: 2021/2/12/012 15:51
 * @Email:cnxielong@gmail.com
 */
public class MyThread extends Thread {

    private String name;

    public MyThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"第"+i+"次Thread start");
        }
    }
}
