package task1;

import java.util.Random;

public class Fill {
    public void run() {
        int n=10;
        int[] arr = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            arr[i]=random.nextInt(100);
        }
    }
}
  