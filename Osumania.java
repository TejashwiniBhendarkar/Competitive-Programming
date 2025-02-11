
import java.util.*;
public class Osumania {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        sc.nextLine();
        while(t-->0){
            int n=sc.nextInt();
            sc.nextLine();
            int ans[]=new int[n];
            for(int i=0;i<n;i++){
                String row=sc.nextLine();
                for(int j=0;j<4;j++){
                    if(row.charAt(j)=='#'){
                        ans[i]=j+1;
                        break;
                    }
                }
            }
            for(int i=n-1;i>=0;i--){
                System.out.print(ans[i]+" ");
            }
            System.out.println();
        }
    }
}

