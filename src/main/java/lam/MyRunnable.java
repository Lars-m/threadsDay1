
package lam;


public class MyRunnable implements Runnable {
    int count;

    public MyRunnable(int count) {
        this.count = count;
    }
     @Override
    public void run(){
        int counter = 0;
        while(counter < count ){
            System.out.println("Hello from: " +Thread.currentThread().getName());
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.out.println("uppppS");
            }
            counter++;
        }
        
    }
   
    
}
