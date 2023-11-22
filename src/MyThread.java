import java.util.Random;

public class MyThread {
    public void run() {
        int n=10;
        int[] array = new int[n];
        Random random = new Random();
        for(int i=0;i<n;i++){
            array[i]=random.nextInt(100);
        }
    }
}
  