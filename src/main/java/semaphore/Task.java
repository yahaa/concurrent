package semaphore;

public class Task extends Thread {
    private Service service;

    public Task(Service service) {
        super();
        this.service = service;
    }

    @Override
    public void run(){
        service.testMethod();
    }
}
