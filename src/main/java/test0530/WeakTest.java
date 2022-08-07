package test0530;

import java.lang.ref.WeakReference;

public class WeakTest {
    public static void main(String[] args) {
        /*Object o = new Object();
        WeakReference weakReference = new WeakReference(o);
        System.out.println(o);
        System.out.println(weakReference);
        o = null;
        System.gc();
        System.out.println(o);
        System.out.println(weakReference.get());*/
        WeakReference weakReference = new WeakReference(new Object());
        System.gc();
        System.out.println(weakReference.get());
    }
}
