package thread;

public class ThreadB extends Thread{
    @Override
    public void run() {
        for(int i=0;i<10;i++){
            System.out.println("B "+i);
            try {
                Thread.sleep(300);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
