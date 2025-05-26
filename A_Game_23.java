import java.util.*;

public class A_Game_23{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int num = obj.nextInt();
        int req = obj.nextInt();

        int tmov = 0;
        int d = -1;
        int cnt = 0;

        if(num == req || req<num) {
            System.out.println(0);
        }
        else{
            d = req/num;
            if(req%num != 0){
                System.out.println(-1);
            }
            else{
                while(d%2==0){
                    cnt++;
                    d = d/2;

                }
                while(d%3==0){
                    cnt++;
                    d = d/3;
                }

                if(d != 1){
                    System.out.println(-1);
                }
                else{
                    System.out.println(cnt);
                }
            }
        }
    }
}