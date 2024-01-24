import java.util.Arrays;
import java.util.HashMap;

public class Has {
    public static void main (String ar []){
        HashMap <String,Integer> h=new HashMap <String,Integer>();
        h.put("hi",0);
        h.put("bye",1);
        h.put("xyz",2);
        System.out.println("val added:" +h);
        h.remove("hi");
        System.out.println("val after:" +h);


    }
}
