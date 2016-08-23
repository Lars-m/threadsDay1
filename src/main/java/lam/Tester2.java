
package lam;

public class Tester2 {
    
    public static void main(String[] args) throws InterruptedException {
        MyRunnable r1 = new MyRunnable(4);
        Thread t1 = new Thread(r1);
        Thread t2 = new Thread(new MyRunnable(6));
        Thread t3 = new Thread(new MyRunnable(3));
        
         t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("All thread are done");
    }
}
