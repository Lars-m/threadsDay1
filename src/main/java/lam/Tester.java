
package lam;


public class Tester {
    
    public static void main(String[] args) throws InterruptedException {
        Thread1 t1 = new Thread1(4);
        Thread1 t2 = new Thread1(6);
        Thread1 t3 = new Thread1(3);
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("All thread are done");
        
    }
}
