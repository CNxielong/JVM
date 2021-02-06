package com.icbc.jvm.gc;

/**
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/7/007 0:56
 */
public class NormalObject {
    public String name;

    public NormalObject(String name) {
        this.name = name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("NormalObject finalize()" + name);
    }
}
