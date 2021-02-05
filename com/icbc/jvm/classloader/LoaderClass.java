package com.icbc.jvm.classloader;

/**
 * 用于测试加载方式
 * @Auther: XDragon
 * @Date: 2021/2/5/005 14:52
 * @Email:cnxielong@gmail.com
 */
public class LoaderClass {
    private String className;

    static {
        System.out.println("LoaderClass 静态代码块");
    }

    public LoaderClass() {
    }

    public LoaderClass(String className) {
        this.className = className;
    }
}
