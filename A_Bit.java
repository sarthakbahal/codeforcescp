import java.util.Scanner;

public class A_Bit{
    public static void main(String[] args){
        Scanner myobj  = new Scanner(System.in);
        int num = myobj.nextInt();
        int x = 0;

        for(int i = 0;i<num;i++){
            String stat = myobj.next();
            switch (stat){
                case "++X":
                case "X++":
                    x++;
                    break;
                case "X--":
                case "--X":
                    x--;
                    break;
            }
            
        }

        System.out.print(x);
    }
    
    
}

