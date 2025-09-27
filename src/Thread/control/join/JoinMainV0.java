package Thread.control.join;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class JoinMainV0 {
    public static void main(String[] args) {
        log("start");
        Thread thread1 = new Thread(new job(), "Thread1");
        Thread thread2 = new Thread(new job(), "Thread2");


        thread1.start();
        thread2.start();
        log("end");
    }

    static class job implements Runnable {
        @Override
        public void run() {
            log("작업시작");
            sleep(2000);
            log("end");
        }
    }
}
