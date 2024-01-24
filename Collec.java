import java.util.*;

public class Collec {
    public static void main (String ar[]){
        LinkedList <String> L=new LinkedList <String>();
        L.add("abc");
        L.add("cde");
        L.offerFirst("xyz");
        System.out.println("value added" +L);
        L.remove("xyz");
        System.out.println("values after"+L);
    }
}
