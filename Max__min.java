import java.util.*;
public class Max__min {
    public static void main(String[] args){
        System.out.println("enter the array");
        Scanner n=new Scanner(System.in);
        int size=n.nextInt();
        int[] arr=new int[size];
        System.out.println(size);

        int[] ar={1,2,3,4,5,6,7,8,},j;
        int maxValue=ar[0];
        for(int[] i=1;i<ar.length;i++);{
            if(ar[j]>maxValue){
                maxValue=arr[j];
                System.out.println("max val:" +maxValue);
            }
        }

    }
}


