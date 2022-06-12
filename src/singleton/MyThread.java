package singleton;

public class MyThread implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread Nr: " + Thread.currentThread().getId() + " started...");
        System.out.println(SingleTonLazyInit.getInstance().hashCode());
    }
}
