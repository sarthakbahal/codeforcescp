import java.util.*;

public class A_Square_Year{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ctc = obj.nextInt();

        while(ctc>0){
            ctc--;
            String q = obj.next();
            int num = Integer.parseInt(q);

            

            boolean f = false;

            for(int i = 0;i<=100;i++){
                for(int j = 0;j<=100;j++){
                    if((i+j)*(i+j) == num){
                        System.out.println(i + " " + j);
                        f = true;
                        i = 101;
                        break;
                    }
                }
            }

            if(!f){
                System.out.println(-1);
            }
        
            

            
        }
    }
}