package com.icbc.thread;

/**
 * 继承Runnable接口
 * @Auther: XDragon
 * @Date: 2021/2/12/012 16:04
 * @Email:cnxielong@gmail.com
 */
public class MyRunnable implements Runnable {
    private String name;

    public MyRunnable(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(name+"第"+i+"MyRunnable run");
        }
    }
}
