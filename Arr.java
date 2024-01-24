import java.util.ArrayList;

public class Arr {
    public static void main(String ar[]){
        ArrayList <String> a =new ArrayList<String>();
        a.add("123");
        a.add("567");
        a.add(1,"abc");
        System.out.println("value added" +a);
        a.remove("567");
        a.addFirst("987");
        System.out.println("value after" +a);

    }
}
