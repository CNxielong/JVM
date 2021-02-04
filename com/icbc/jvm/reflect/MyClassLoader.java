package com.icbc.jvm.reflect;

import java.io.*;

/**
 * 自定义类加载器
 * @Auther: XDragon
 * @Date: 2021/2/4/004 17:51
 * @Email:cnxielong@gmail.com
 */
public class MyClassLoader extends ClassLoader {
    private String path;
    private String classLoaderName;

    public MyClassLoader(String path, String classLoaderName){
        this.path = path;
        this.classLoaderName = classLoaderName;
    }

    @Override
   public Class findClass(String name) throws ClassNotFoundException {
        byte[] b = loadClassDate(name);
        return defineClass(name,b,0,b.length);
//        throw new ClassNotFoundException(name);
    }


    private byte[] loadClassDate(String name){
        name = path+name+".class";
        InputStream in = null;
        ByteArrayOutputStream out = null;
        try {
            in = new FileInputStream(new File(name));
            out = new ByteArrayOutputStream();
            int i = 0;
            while((i=in.read())!=-1){
                out.write(i);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                out.close();
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    return  out.toByteArray();//返回输出字节码
    }


}
