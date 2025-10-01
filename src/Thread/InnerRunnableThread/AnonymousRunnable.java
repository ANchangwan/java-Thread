package Thread.InnerRunnableThread;

import static util.MyLogger.log;

public class AnonymousRunnable {
    public static void main(String[] args) {
        log("run start");
        Runnable run = new Runnable() {
            @Override
            public void run() {
                log("run thread");
            }
        };
        Thread thread = new Thread(run);
        thread.start();
        log("run end");
    }
}
