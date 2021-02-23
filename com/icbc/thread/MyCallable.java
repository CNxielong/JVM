package com.icbc.thread;

import java.util.concurrent.Callable;

/**
 * Callable接口实现类
 * @Auther: XDragon
 * @Date: 2021/2/13/013 15:25
 * @Email:cnxielong@gmail.com
 */
public class MyCallable implements Callable<String> {
    @Override
    public String call() throws Exception {
        System.out.println("MyCallable ready to work");
        Thread.currentThread().sleep(3000);
        System.out.println("MyCallable work done");
        return "MyCallable work done";
    }
}
