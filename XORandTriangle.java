import java.util.Scanner;
public class XORandTriangle {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        while(t-->0){
           int a=sc.nextInt();
           int ans=-1;
           for(int i=0;i<30;i++){
            for(int j=0;j<30;j++){
                int b= 1<<i | 1<<j;
                if (b < a && a + b > (a ^ b) && b + (a ^ b) > a) {
                    ans = b;  // Store valid b
                    break;
                }
            }
           }
           System.out.println(ans);
        }
            }
        
        
    
}
