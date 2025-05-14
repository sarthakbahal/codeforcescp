import java.util.Scanner;

public class A_Soft_Drinking{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[8];
        
        for(int i = 0;i<8;i++){
            arr[i] = obj.nextInt();
        }

        int d = arr[1]*arr[2];
        int dt = d/arr[6];
        int l = arr[3]*arr[4];
        int st = arr[5]/arr[7];

        int tnum = (Math.min(dt, Math.min(l, st)))/arr[0];

        System.out.println(tnum);
    }
}