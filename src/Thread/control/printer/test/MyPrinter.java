package Thread.control.printer.test;

import java.util.Queue;
import java.util.Scanner;
import java.util.concurrent.ConcurrentLinkedQueue;

import static util.MyLogger.log;
import static util.ThreadUtils.sleep;

public class MyPrinter {
    public static void main(String[] args) {
        Printer thread = new Printer();
        Thread print = new Thread(thread);
        print.start();
        System.out.println("프린트 입력 시작");
        Scanner useInput = new Scanner(System.in);
        while(true){
            String input = useInput.nextLine();
            if(useInput.equals("q")){
                print.interrupt();
                break;
            }
            thread.addJob(input);

        }

    }
    static class Printer implements Runnable {

        Queue<String> printQueue = new ConcurrentLinkedQueue<>();

        @Override
        public void run() {
            while (true) {
                if(!Thread.interrupted()) {
                    Thread.yield();
                    break;
                }
                try {
                    String print = printQueue.poll();
                    log("작업 시작");
                    sleep(3000);
                    log("작업: " +"작업" + print+ ", 대기 프린터: "+ printQueue);
                } catch (Exception e) {
                    log("인터럽트 발생");
                    log("");
                }
                log("프린트 종료");

            }

        }
        public void addJob(String job) {
            printQueue.add(job);
        }
    }
}
