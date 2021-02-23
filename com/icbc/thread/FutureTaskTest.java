package com.icbc.thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * FutureTask构造方法 isDone、get 方法
 *
 * @Auther: XDragon
 * @Date: 2021/2/13/013 15:37
 * @Email:cnxielong@gmail.com
 */
public class FutureTaskTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        MyCallable myCallable = new MyCallable();
        FutureTask<String> futureTask = new FutureTask<>(myCallable);
        Thread thread = new Thread(futureTask);
        thread.start();
        if (!futureTask.isDone()) {//任务未完成
            System.out.println("MyCallable has not finished");
        }
        System.out.println("task return:" + futureTask.get());//futureTask.get() 返回MyCallable call()方法的返回值
    }
}
