package Thread.start;

import static util.MyLogger.log;

public class innerRunneableMainV1 {
    public static void main(String[] args) {
        log("main() start");


        MyRunalbe runalbe = new MyRunalbe();
        Thread thread = new Thread(runalbe);
        thread.start();

        log("main() end");

    }

    static class MyRunalbe implements Runnable {

        @Override
        public void run() {
            log("run()");
        }
    }
}
