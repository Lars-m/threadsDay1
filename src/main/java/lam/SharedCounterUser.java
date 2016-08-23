
package lam;

public class SharedCounterUser extends Thread{
    SharedCounter counter ;
    public static int TIMES = 100;
    
    public SharedCounterUser(SharedCounter counter) {
        
        this.counter = counter;
    }
       
    @Override
    public void run(){
        int x = 0;
        while(x < TIMES)
        {
            counter.increment(1);
            x++;
        }
    }
            
}
