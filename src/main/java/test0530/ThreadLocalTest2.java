package test0530;

public class ThreadLocalTest2 {

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            ThreadLocal threadLocal1 = new ThreadLocal();
            ThreadLocal threadLocal2 = new ThreadLocal();
            ThreadLocal threadLocal3 = new ThreadLocal();
            ThreadLocal threadLocal4 = new ThreadLocal();
            ThreadLocal threadLocal5 = new ThreadLocal();
            ThreadLocal threadLocal6 = new ThreadLocal();
            ThreadLocal threadLocal7 = new ThreadLocal();
            ThreadLocal threadLocal8 = new ThreadLocal();
            ThreadLocal threadLocal9 = new ThreadLocal();
            ThreadLocal threadLocal10 = new ThreadLocal();
            ThreadLocal threadLocal11 = new ThreadLocal();
            ThreadLocal threadLocal12 = new ThreadLocal();
            ThreadLocal threadLocal13 = new ThreadLocal();
            ThreadLocal threadLocal14 = new ThreadLocal();
            ThreadLocal threadLocal15 = new ThreadLocal();
            ThreadLocal threadLocal16 = new ThreadLocal();
            ThreadLocal threadLocal17 = new ThreadLocal();
            ThreadLocal threadLocal18 = new ThreadLocal();
            ThreadLocal threadLocal19 = new ThreadLocal();

            threadLocal1.set(1);threadLocal2.set(2);threadLocal3.set(3);threadLocal4.set(4);
            threadLocal5.set(5);threadLocal6.set(6);threadLocal7.set(7);threadLocal8.set(8);
            threadLocal9.set(9);threadLocal10.set(10);
            threadLocal11.set(11);threadLocal12.set(12);threadLocal13.set(13);threadLocal14.set(14);
            threadLocal15.set(15);threadLocal16.set(16);threadLocal17.set(17);threadLocal18.set(18);
            threadLocal19.set(19);
            //threadLocal1.set(3);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }, "Thread1");
        thread1.start();


    }
}
