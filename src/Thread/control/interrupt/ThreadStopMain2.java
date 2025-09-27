
package Thread.control.interrupt;

import java.util.logging.Logger;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;


public class ThreadStopMain2 {
    public static void main(String[] args) {
        MyTask task = new MyTask();
        Thread thread = new Thread(task, "work");
        thread.start();

        sleep(2000);
        log("작업 중단 지시 thread.interrupt()");
        thread.interrupt();
        log("work 스레드 인터럽트 상태1=" + thread.isInterrupted());
    }
    static class MyTask implements Runnable {
        volatile boolean runFlag = true;
        @Override
        public void run() {
            try {
                while(true) {
                    log("작업 중");
                    Thread.sleep(3000);
                }
            } catch (InterruptedException e) {
                log("wokr 스레드 인터럽트 상태2 = "+ Thread.currentThread().isInterrupted());
                log("interrupt message=" + e.getMessage());
                log("start="+Thread.currentThread().getState());
            }

            log("자원 정리");
            log("자원 종료");
        }
    }
}
