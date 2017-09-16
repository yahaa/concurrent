package simpleHttpServer;

public class Main {
    public static void main(String[]args) throws Exception {
        SimpleHttpServer.setBasePath("/home/zihua/test");
        SimpleHttpServer.start();
    }
}
