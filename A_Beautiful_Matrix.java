import java.util.Scanner;

public class A_Beautiful_Matrix{
    
    public static void main(String[] args){
            int mat[][] = new int[5][5]; 
    Scanner ind = new Scanner(System.in);
    int cnt = 0;
    
    for(int i = 0;i<5;i++){
        for(int j = 0;j<5;j++){
            mat[i][j] = ind.nextInt();
        }
    }

    for(int i = 0;i<5;i++){
        for(int j = 0;j<5;j++){
            if(mat[i][j] == 1 ){
                if(i>2 && j>2 ){
                    cnt = i+j-4;
                }
                else if(i<2 && j>2){
                    cnt = j-i;
                }
                else if(i>2 && j<2){
                    cnt = i-j;
                }
                else if(i<2 && j<2){
                    cnt = 4-i-j;
                }
                else if(i == 2 && j>2){
                    cnt = j-2;
                }
                else if(i == 2 && j<2){
                    cnt = 2-j;
                }
                else if(j == 2 && i>2){
                    cnt = i-2;
                }
                else if(j == 2 && i<2){
                    cnt = 2-i;
                }
                else{
                    cnt = 0;
                }
            }
        }
    }

    System.out.print(cnt);

    }
} 
