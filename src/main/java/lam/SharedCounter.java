
package lam;


public class SharedCounter {
    
    int count;
    
    public void increment(int x){
        int temp = count;
        temp += x;
        count = temp;
    }

    public int getCount() {
        return count;
    }
    
    
}
