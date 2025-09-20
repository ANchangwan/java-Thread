package Thread.start;

public class HelloBadThreadMain {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().getName() + ": main() start");
        HelloThread helloThread = new HelloThread();
        System.out.println(Thread.currentThread().getName() + ": main() 호출전");
        helloThread.run();
        System.out.println(Thread.currentThread().getName() + ": main() 호출 후");

        System.out.println(Thread.currentThread().getName() + ": main() end");
    }
}
