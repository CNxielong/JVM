package com.icbc.jvm.gc;

import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;
import java.util.ArrayList;

/**
 * @Auther: XDragon
 * @Date: 2021/2/7/007 15:37
 * @Email:cnxielong@gmail.com
 */
public class ReferenceQueenTest {
    public static ReferenceQueue<NormalObject> rq = new ReferenceQueue<>();//定义一个引用队列

    public static void checkQueue() {//检查队列方法
        Reference<NormalObject> ref;//定义NormalObject的引用
        while (null != (ref = (Reference<NormalObject>) rq.poll())) {//循环遍历
            if (null != ref) {
                System.out.println("In Queue:" + ((NormalObjectWeakReference) ref).name);
                System.out.println("reference Object:" + ref.get());
            }
        }
    }

    public static void main(String[] args) {
        ArrayList<NormalObjectWeakReference> list = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            list.add(new NormalObjectWeakReference(new NormalObject("xielong弱引用测试"+i),rq));
            System.out.println("创建弱引用"+i);
        }
        System.out.println("first Time checkQueue：");
        checkQueue();
        System.gc();
        try {
            Thread.sleep(1000);//保证GC完成
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("second Time GC finished checkQueue：");
        checkQueue();
    }
}
