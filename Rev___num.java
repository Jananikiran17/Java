import java.util.*;
public class Rev___num {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        int n=input.nextInt();
        int rev=0;
        while(n!=0)
        {
            int rema=n%10;
            rev=rev*10+rema;
            n=n/10;
        }
        System.out.println(rev);
    }
}
