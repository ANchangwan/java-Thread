package Thread.start;

import Thread.start.runable.HelloRunalbe;

import static util.MyLogger.log;

public class innerRunneableMainV2 {
    public static void main(String[] args) {
        log("main() start");

        HelloRunalbe runalbe = new HelloRunalbe() {

            @Override
            public void run() {
                log("run()");
            }
        };
        Thread thread = new Thread(runalbe);
        thread.start();

        log("main() end");

    }


}
