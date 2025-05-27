import java.util.Scanner;

public class B_Not_Quite_a_Palindromic_String {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ctc = obj.nextInt();
        while (ctc > 0) {
            ctc--;
            int n = obj.nextInt();
            int k = obj.nextInt();
            String s = obj.next();
            
            int cnt0 = 0;
            for (char c : s.toCharArray()) {
                if (c == '0'){
                    cnt0++;
                } 
            }
            int cnt1 = n - cnt0;
            
            int res = cnt1 - cnt0;
            int tm = k -  (res / 2);
            
            if (tm % 2 != 0) {
                System.out.println("NO");
            } else {
                int num1 = tm / 2;
                int num2 = (k +  (res / 2)) / 2;
                
                if (num1 >= 0 && num2 >= 0 && 2 * num1 <= cnt0 && 2 * num2 <= cnt1) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
            }
        }
    }
}