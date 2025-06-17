import java.util.*;

public class B_Above_the_Clouds {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int ctc = obj.nextInt();
        while (ctc> 0) {
            ctc--;
            int n = obj.nextInt();
            String s = obj.next();
            boolean found = false;
            for (int i = 1; i < n - 1; i++) {
                char b = s.charAt(i);
                if (s.substring(0, i).indexOf(b) != -1) {
                    found = true;
                    break;
                }
                
                if (s.substring(i + 1).indexOf(b) != -1) {
                    found = true;
                    break;
                }
            }
            if(found) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}