package Thread.start.runable;

public class HelloRunalbe implements Runnable {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + ": run()");
    }
}
