package Thread.start.runable;

public class HelloRunableMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");

        HelloRunalbe helloRunalbe = new HelloRunalbe();
        Thread thread = new Thread(helloRunalbe);
        thread.start();

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
