import java.util.*;

public class A_Fox_And_Snake{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int n = obj.nextInt();
        int m = obj.nextInt();

        

        String[][] mat = new String[n][m];
        
        int prev = 0;
        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                
                if(i%2==0){
                    mat[i][j] = "#";
                }

                if(i%2!=0){
                    if(prev == 0){
                        mat[i][m-1] = "#";
                        prev = i;
                        break;
                    }
                    
                    if(mat[prev][m-1] == "#"){
                        mat[i][0] = "#";
                        prev = i;
                        break;
                    }
                    else{
                        mat[i][m-1] = "#";
                        prev = i;
                        break;
                    }
                }
            }
        }

        for(int i = 0;i<n;i++){
            for(int j = 0;j<m;j++){
                if(mat[i][j] == null){
                    System.out.print(".");
                }
                else{
                    System.out.print(mat[i][j]);
                }

            }
            System.out.println();
        }


    }
}