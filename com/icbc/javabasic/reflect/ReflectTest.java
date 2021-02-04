package com.icbc.javabasic.reflect;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 反射类测试
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/4/004 0:24 2021/2/4/004
 */
public class ReflectTest {
    public static void main(String[] args) throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class<?> aClass = Class.forName("com.icbc.javabasic.reflect.Robot");
        Robot robot = (Robot)aClass.newInstance();
        System.out.println("Class name:"+robot.getName());//null 未初始化name
        //public方法
        Method throwHello = aClass.getDeclaredMethod("throwHello", String.class);//设置方法名和入参对象
        Object invoke = throwHello.invoke(robot, "你好啊！李银河！");//回调类和参数
        System.out.println("public method invoke:"+invoke);//输出回调方法
        //private方法
        Method sayHi = aClass.getDeclaredMethod("sayHi", String.class);
        sayHi.setAccessible(true);//设置私有方法权限
        Object sayHi私有方法 = sayHi.invoke(robot, "sayHi私有方法");//回调类和参数
        System.out.println("private method invoke:"+sayHi私有方法);//输出回调方法
        //设置成员变量
        Field name = aClass.getDeclaredField("name");
        name.setAccessible(true);
        name.set(robot,"李银河");
        sayHi.invoke(robot,"你好啊！");
    }
}
