package Thread.InnerRunnableThread;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class ThreadLamda {
    public static void main(String[] args) {
        log("thread start");
        Thread thread = new Thread(() -> {
            try{
                sleep(3000);
                log("thread end");
            }catch (Exception e){
                System.out.println(e.getMessage());
            }
        });
        thread.start();


        log("thread end");
    }
}
