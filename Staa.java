import java.util.Stack;

public class Staa {
    public static void main(String ar []){
        Stack <String> s=new Stack<String>();
        s.push("one");
        s.push("two");
        s.push("three");
        s.push("four");
        System.out.println("val added:" +s);
        s.pop();
        s.pop();
        System.out.println("val after:" +s);


    }
}
