package semaphore;

import java.sql.Timestamp;
import java.util.concurrent.Semaphore;

public class Service {
    private Semaphore semaphore = new Semaphore(1);

    public void testMethod() {
        try {
            semaphore.acquireUninterruptibly();
            System.out.println(Thread.currentThread().getName() + " begin timer=" + currTime());
            Thread.sleep(5000);
            System.out.println(Thread.currentThread().getName() + " end timer=" + currTime());
            semaphore.release();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public Timestamp currTime(){
        return new Timestamp(System.currentTimeMillis());
    }
}
