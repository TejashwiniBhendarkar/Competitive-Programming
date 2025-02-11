
import java.util.*;
 
public class SatyamAndCounting {
 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a[][] = new int[n + 5][2];
 
            for (int i = 0; i < n; i++) {
                int x = sc.nextInt();
                int y = sc.nextInt();
                a[x][y]++;
            }
 
            long ans = 0;
            for (int i = 0; i <= n; i++) {
                if (a[i][0] > 0 && a[i][1] > 0) {
                    ans += n - 2;
                }
            }
 
            for (int i = 0; i <= n; i++) {
                if (a[i][0] > 0 && a[i + 2][0] > 0 && a[i + 1][1] > 0)
                    ans++;
                if (a[i][1] > 0 && a[i + 2][1] > 0 && a[i + 1][0] > 0)
                    ans++;
            }
 
            System.out.println(ans);
        }
 
    }
}
