import java.util.*;

public class A_Letter_Home {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ctc = obj.nextInt();

        while(ctc>0){
            ctc--;
            int n = obj.nextInt();
            int s = obj.nextInt();

            int[] arr = new int[n];
            int min = 101;
            int max = -1;


            for(int i = 0; i < n; i++) {
                arr[i] = obj.nextInt();
                min = Math.min(min, arr[i]);
                max = Math.max(max, arr[i]);
                
            }

            int steps = (max - min) + Math.min(Math.abs(s - min), Math.abs(s - max));
           

            System.out.println(steps);
        }
    }
}