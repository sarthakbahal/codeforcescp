import java.util.*;

public class A_Sum_of_Round_Numbers{
    public static void main(String[] args){
        Scanner obj = new Scanner(System.in);

        int ctc = obj.nextInt();

        while(ctc>0){
            

            String num = obj.next();
            char[] arr = num.toCharArray();

            ArrayList<Integer> numarr = new ArrayList<>();

            for(int i = 0;i<arr.length;i++){    
                int digit = arr[i] - '0';
                if(digit != 0){
                    numarr.add(digit*(int)Math.pow(10, arr.length - i - 1));
                    
                }
            }

            System.out.println(numarr.size());

            for(int i = 0;i<numarr.size();i++){
                System.out.print(numarr.get(i)+" ");
            }

            System.out.println();

            ctc--;
            
        }
    }
}