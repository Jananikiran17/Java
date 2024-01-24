import java.util.TreeSet;
public class Sor {
    public static void main(String ar[]){
        TreeSet <String> t=new TreeSet <String>();
        t.add("one");
        t.add("two");
        t.add("three");
        System.out.println("val added:" +t);
        t.remove("one");
        t.remove("three");
        System.out.println("val after:" +t);
    }
}
