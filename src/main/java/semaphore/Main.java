package semaphore;

public class Main {
    public static void main(String[] args) {
        Service service = new Service();

        Task a = new Task(service);
        a.setName("A");
        Task b = new Task(service);
        b.setName("B");
        Task c = new Task(service);
        c.setName("C");
        a.start();
        b.start();
        c.start();
        b.interrupt();
    }

}
