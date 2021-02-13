package com.icbc.thread;

/**
 * 获取线程返回值：1、主线程等待法  2、join() 3、callable接口实现（缺点 不够精准）3、
 *
 * @Auther: XDragon
 * @Date: 2021/2/13/013 14:02
 * @Email:cnxielong@gmail.com
 */
public class CycleWait implements Runnable {
    private String value;

    public CycleWait() {
    }

    @Override
    public void run() {
        try {
            Thread.currentThread().sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        value = "we have data now";
    }

    public static void main(String[] args) throws InterruptedException {
        CycleWait wait = new CycleWait();
        Thread t = new Thread(wait);
        t.start();

//        System.out.println("value:"+wait.value);//输出 value:null 默认可能不走到多线程

//        if (null == wait.value) { //主线程等待法
//            Thread.currentThread().sleep(1000);
//        }
        t.join();//阻塞当前主线程 让子线程走完
        System.out.println("value:" + wait.value);
    }

}
