package future;

import java.util.concurrent.*;

public class FutureTest {
    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executor = Executors.newCachedThreadPool();
        Task task = new Task();
        Future<Integer>result=executor.submit(task);
        executor.shutdown();
        System.out.println("主线程。。。。。。");
        Thread.sleep(5000);

        System.out.println("子线程执行结果。。。。。。");
        System.out.println(result.get());



    }
}


class Task implements Callable<Integer> {
    private int start=0;
    private int end=100;

    public Task(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public Task() {

    }

    public Integer call() throws Exception {
        System.out.println("子线程执行任务");
        Thread.sleep(5000);
        int sum = 0;
        for (int i = start; i < end; i++) sum += i;
        return sum;
    }
}


class Do implements Runnable{

    public void run() {

    }
}
