package multithread;

public class TestSynchronized2 {
    public static void main(String[] args) {
        Table object=new Table();
        Thread thread1=new Thread(){
            @Override
            public void run() {
                object.printTable(5);
            }
        };
        Thread thread2=new Thread(){
            @Override
            public void run() {
                object.printTable(100);
            }
        };
        thread1.start();
        thread2.start();
    }
}
