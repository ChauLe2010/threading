package multithread;

public class MyThread2 extends Thread{
    Table table;

    public MyThread2(Table table) {
        this.table = table;
    }

    @Override
    public void run() {
        table.printTable(100);
    }
}
