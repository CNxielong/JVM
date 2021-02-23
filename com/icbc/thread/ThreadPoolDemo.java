package com.icbc.thread;

import java.util.concurrent.*;

/**
 * 线程池实现任务管理  获取线程池，submit方法获取Future
 * @Auther: XDragon
 * @Date: 2021/2/13/013 15:49
 * @Email:cnxielong@gmail.com
 */
public class ThreadPoolDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService newCachedThreadPool = Executors.newCachedThreadPool();
        Future<String> future = newCachedThreadPool.submit(new MyCallable());
        if (!future.isDone()) {//任务未完成
            System.out.println("MyCallable has not finished");
        }
        System.out.println("task return:" + future.get());
    }
}
