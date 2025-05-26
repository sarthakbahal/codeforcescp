import java.util.*;

public class A_Anton_and_Polyhedrons{
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        int cnt = obj.nextInt();
        int tots = 0;

        for(int i = 0;i<cnt;i++){
            String polyh = obj.next();
            switch (polyh) {
                case "Tetrahedron" :
                    tots += 4;
                    break;
                
                case "Cube":
                    tots += 6;
                    break;
                case "Dodecahedron":
                    tots += 12;
                    break;
                case "Octahedron":
                    tots += 8;
                    break;
                case "Icosahedron":
                    tots += 20;
                    break;
            
                default:
                    break;
            }
        }

        System.out.println(tots);
    }
}