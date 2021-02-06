package com.icbc.jvm.gc;

/**
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/7/007 0:22
 */
public class Finalization {
    public static Finalization finalization;

    @Override
    protected void finalize() throws Throwable {//重写finalize方法
        System.out.println("重写的finalize方法");
        finalization = this;//重新赋值
    }

//    public static void main(String[] args) {
//        Finalization f = new Finalization();
//        System.out.println("第一次输出："+f);//第一次输出：com.icbc.jvm.gc.Finalization@154617c
//        f = null;
//        System.gc();
//        System.out.println("第二次输出"+f);//第二次输出null
//        System.out.println("想看看f.finalization是啥:"+f.finalization);//想看看f.finalization是啥:null （换行后） 重写的finalize方法 （没有执行完finalize()的 finalization = this;//重新赋值）
//    }

    public static void main(String[] args) {
        Finalization f = new Finalization();
        System.out.println("第一次输出：" + f);//第一次输出：com.icbc.jvm.gc.Finalization@154617c
        f = null;
        System.gc();
        try {
            Thread.currentThread().sleep(1000);//当前线程睡1000MS=1S 完成GC
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("第二次输出" + f);//第二次输出null
        System.out.println("想看看f.finalization是啥:" + f.finalization);//想看看f.finalization是啥:com.icbc.jvm.gc.Finalization@154617c 完成了重新赋值
    }

}
