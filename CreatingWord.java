
import java.util.Scanner;
public class CreatingWord {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
       while(t-->0){
            String str1=sc.next();
            String str2=sc.next();
            String nstr1=str2.charAt(0)+str1.substring(1);
            String nstr2=str1.charAt(0)+str2.substring(1);
            
        System.out.println(nstr1+" "+nstr2);

        }
    
    }
}
