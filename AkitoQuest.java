import java.util.Scanner;

public class AkitoQuest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt(); 
            int k = sc.nextInt(); 
            int p = sc.nextInt(); 
        
        
            k=Math.abs(k);
            int m=(k+p-1)/p;
            if(m>n){
                System.out.println("-1");
            }
            else{
                System.out.println(m);
            }
        }
           
    }
}
