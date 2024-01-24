import java.util.Vector;

public class Vec {
    public static void main (String ar[]){
        Vector <String> v=new Vector<String>();
        v.add("abc");
        v.add("hello");
        System.out.println("val added:" +v);
        v.remove("abc");
        v.add("123");
        System.out.println("val after:" +v);

    }
}
