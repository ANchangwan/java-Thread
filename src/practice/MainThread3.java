package practice;

import static util.MyLogger.log;

public class MainThread3 {
    public static void main(String[] args) {
        Runnable thread = new Runnable(){
            @Override
            public void run() {
                for(int i =1; i <= 5; i++){
                    log("values: "+ i);
                    try{
                        Thread.sleep(1000);
                    }catch(InterruptedException e){
                        throw new RuntimeException(e);
                    }
                }
            }
        };
        new Thread(thread).start();
    }
}
