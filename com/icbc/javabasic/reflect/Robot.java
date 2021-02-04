package com.icbc.javabasic.reflect;

/**
 * 获取反射
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/4/004
 */
public class Robot {
    private String name;
    private void sayHi(String hi){
        System.out.println("Robot:"+name+" say:"+hi);
    }
    public String throwHello(String hello){
        return "Hello"+hello;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Robot{" +
                "name='" + name + '\'' +
                '}';
    }
}
