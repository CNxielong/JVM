package com.icbc.jvm.gc;

import java.lang.ref.ReferenceQueue;
import java.lang.ref.SoftReference;
import java.lang.ref.WeakReference;

/**
 * 弱引用
 * @Author xielong <cnxielong@gmail.com>
 * @Version V1.0.0
 * @Since 1.0
 * @Date 2021/2/7/007 0:58
 */
public class NormalObjectWeakReference extends WeakReference<NormalObject> {
    public String name;

    public NormalObjectWeakReference(NormalObject normalObject, ReferenceQueue<? super NormalObject> q) {
        super(normalObject, q);
        this.name = normalObject.name;
    }

    @Override
    protected void finalize() throws Throwable {
        System.out.println("NormalObjectWeakReference finalize()" + name);
    }
}
