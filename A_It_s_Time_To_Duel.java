import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;


public class A_It_s_Time_To_Duel{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);
        int ctc = obj.nextInt();
        
        int zcnt = 0;
        int wcnt = 0;

        
        while(ctc>0){
            
            int cnt = obj.nextInt();
            int[] arr2 = new int[cnt];

            for(int i = 0;i<cnt;i++){
               
                arr2[i] = obj.nextInt();

                if(arr2[i] == 0){
                    zcnt++;
                }

            }




            for(int i = 0;i<cnt-1;i++){
                if(arr2[i] == 0 && arr2[i+1]!=1 ){
                    wcnt++;
                }

            }

            if(wcnt>0){
                System.out.println("YES");
            }
            
            else if(zcnt==0){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }

            zcnt = 0;
            wcnt = 0;
            ctc--;

        }
    }
}