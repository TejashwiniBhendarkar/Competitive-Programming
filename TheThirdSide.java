import java.util.Scanner;
public class TheThirdSide {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        long t=sc.nextLong();
        while(t-->0){
            int n=sc.nextInt();
            int arr[]=new int[n];
            int sum=0;
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();
                sum+=arr[i];
            }
            System.out.println(sum-n+1);
        }
    }
}
