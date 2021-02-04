package com.icbc.jvm.reflect;

/**
 * @Auther: XDragon
 * @Date: 2021/2/4/004 21:37
 * @Email:cnxielong@gmail.com
 */
public class ClassLoaderChecker {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        MyClassLoader myClassLoader = new MyClassLoader("C:\\Users\\Administrator\\Desktop\\","myClassLoader");
        Class test = myClassLoader.loadClass("Wali");//加载方法
        System.out.println(test.getClassLoader());
        test.newInstance();
    }
}
