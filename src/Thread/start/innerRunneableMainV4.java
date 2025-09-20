package Thread.start;

import Thread.start.runable.HelloRunalbe;

import static util.MyLogger.log;

public class innerRunneableMainV4 {
    public static void main(String[] args) {
        log("main() start");

        Thread thread = new Thread(() -> log("run()"));
        //commnad + option + n inline 단축키
        thread.start();

        log("main() end");

    }


}
