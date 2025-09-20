package Thread.start;

import Thread.start.runable.HelloRunalbe;

import static util.MyLogger.log;

public class ManyThreadMainV1 {
    public static void main(String[] args) {
        log("main start");

        HelloRunalbe runalbe = new HelloRunalbe();
        Thread thread1 = new Thread(runalbe);
        thread1.start();
        Thread thread2 = new Thread(runalbe);
        thread2.start();

        Thread thread3 = new Thread(runalbe);
        thread3.start();

        log("main end");
    }


}
