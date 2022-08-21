package homework3.task1;

import java.util.concurrent.atomic.AtomicBoolean;

public class MainTask1 {
    /*
     * 1. Реализовать программу, в которой два потока поочередно пишут ping и pong.
     */

    public static void main(String[] args) {
        AtomicBoolean check = new AtomicBoolean(false);
        Runnable r1 = () -> {
            for (int i = 0; i < 15; i++) {
                synchronized (check){
                    if(check.get()){
                        try {
                            check.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    }else {
                        System.out.println("ping");
                        check.notify();
                        check.set(!check.get());
                    }
                }
            }
        };
        Runnable r2 = () -> {
            for (int i = 0; i < 15; i++) {
                synchronized (check){
                    if(!check.get()){
                        try {
                            check.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }else {
                        System.out.println("pong");
                        check.notify();
                        check.set(!check.get());
                    }
                }
            }
        };

        new Thread(r1).start();
        new Thread(r2).start();
    }

}
