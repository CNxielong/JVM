package com.icbc.jvm.classloader;

/**
 * ExtClassLoader
 * @Auther: XDragon
 * @Date: 2021/2/5/005 14:17
 * @Email:cnxielong@gmail.com
 */
public class ClassLoaderPathTest {
    public static void main(String[] args) {
        System.out.println("java.ext.dirs: "+System.getProperty("java.ext.dirs"));
        System.out.println("java.class.path: "+System.getProperty("java.class.path"));
    }
}
