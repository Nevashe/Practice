package homework3.task2;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
    private int count;
    Lock lock;
    private static int COUNT;
    public Counter() {
        this.count = 0;
        this.lock = new ReentrantLock();
    }

    public void add(String s){
        lock.lock();
        try {
            count++;
            System.out.println(s + " поток добавил 1, count = " + count);
        } finally {
            lock.unlock();
        }
    }
    public static void addd(String s){
            COUNT++;
            System.out.println(s + " поток добавил 1, count = " + COUNT);
    }

    public static void getCountt(){
        System.out.println("Count: " + COUNT);
    }

    public void getCount(){
        System.out.println("Count: " + count);
    }
}
