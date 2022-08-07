package test0530;

public class ThreadLocalTest {
    private static ThreadLocal threadLocal = new ThreadLocal();

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            threadLocal.set(1);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": "+threadLocal.get());
        }, "Thread1");
        thread1.start();
        Thread thread2 = new Thread(() -> {
            threadLocal.set(2);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+": "+threadLocal.get());
        }, "Thread2");
        thread2.start();


    }
}
