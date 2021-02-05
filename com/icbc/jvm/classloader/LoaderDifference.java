package com.icbc.jvm.classloader;

import com.icbc.javabasic.reflect.Robot;

/**
 * 区分loaderClass()已经构造好了对象、forName()
 * @Auther: XDragon
 * @Date: 2021/2/5/005 14:51
 * @Email:cnxielong@gmail.com
 */
public class LoaderDifference {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        Class<?> loaderClass = Class.forName("com.icbc.jvm.classloader.LoaderClass");// 已经构造好了对象 输出LoaderClass 静态代码块
        LoaderClass instance = (LoaderClass)loaderClass.newInstance();// 默认调用空参的构造方法 不设置空参构造方法会报错

        ClassLoader classLoader = Robot.class.getClassLoader();// 未构造好了对象 不输出LoaderClass 静态代码块
        Class<?> loadClass = classLoader.loadClass("com.icbc.jvm.classloader.LoaderClass");
    }


}
