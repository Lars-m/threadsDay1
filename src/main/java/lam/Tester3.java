
package lam;

/**
 *
 * @author lam
 */
public class Tester3 {
    public static void main(String[] args) throws InterruptedException {
        SharedCounter count = new SharedCounter();
        SharedCounterUser t1 = new SharedCounterUser(count);
        SharedCounterUser t2 = new SharedCounterUser(count);
        SharedCounterUser t3 = new SharedCounterUser(count);
        
        t1.start();
        t2.start();
        t3.start();
        
        t1.join();
        t2.join();
        t3.join();
        
        System.out.println("Total sum in shared counter: "+count.getCount());
        
    }
}
