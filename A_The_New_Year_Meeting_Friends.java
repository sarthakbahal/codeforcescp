import java.util.Scanner;

public class A_The_New_Year_Meeting_Friends{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int[] arr = new int[3];
        int max = 0;
        int min = 0;

        for(int i = 0;i<3;i++){
            arr[i] = obj.nextInt();
            if(arr[i]>max){
                max = arr[i];
            }
        }

        min = arr[0];

        int ans = 0;

        for(int i = 0;i<3;i++){
            if(arr[i]<min){
                min = arr[i];
            }

            
        }

        for(int i = 0;i<3;i++){
            
            int mid = 0;
            if(arr[i] < max && arr[i] > min){
                mid = arr[i];
            }

            ans = (arr[i] - min) + (max-arr[i]);

            
        }

        System.out.println(ans);

    }
}