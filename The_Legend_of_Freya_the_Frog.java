import java.util.*;
public class The_Legend_of_Freya_the_Frog {
    public static void main(String[] args) {
        
       Scanner sc=new Scanner(System.in);
       int t=sc.nextInt();
       sc.nextLine();
       while(t-->0){
          int x=sc.nextInt();
          int y=sc.nextInt();
          int k=sc.nextInt();
          int xMoves=(x+k-1)/k;
          int yMoves=(y+k-1)/k;
          int ans=2*Math.max(xMoves,yMoves);
          if(x>y){
            ans--;
          }
          System.out.println(ans);
       }
}
}
