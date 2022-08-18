package homework3.task2;

import homework2.task2.ListArray;

public class MainTask2 {
    /*
     * Реализовать потокобезопасный счетчик с помощью интерфейса Lock.
     */

    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
        Runnable task = () -> {
            // чувствуется только на таком количестве итераций
            for (int i = 0; i < 500000; i++) {
                counter.add(Thread.currentThread().getName());
            }
            counter.getCount();
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        Thread t3 = new Thread(task);
        t1.setName("#1");
        t2.setName("#2");
        t3.setName("#3");
        t1.start();
        t2.start();
        t3.start();

    }
}
