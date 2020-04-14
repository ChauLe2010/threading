package thread;

public class Main {
    public static void main(String[] args) {
        ThreadA test=new ThreadA();
        Thread threadA=new Thread(test);
        ThreadB threadB=new ThreadB();
        threadA.start();
        try {
            threadA.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        threadB.start();
    }
}
