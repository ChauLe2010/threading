package multithread;

public class Table {
    synchronized public void printTable(int n){
       System.out.println("Chạy từng luồng:");

             for(int i=1;i<=5;i++){
                 System.out.println(n*i);
                 try{
                     Thread.sleep(300);
                 } catch (InterruptedException e) {
                     System.out.println(e);
                 }
             }

       }

}
