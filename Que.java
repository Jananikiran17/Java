import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

public class Que {
    public static void main(String ar[]) {
        Queue<String> q = new PriorityQueue<String>();
        q.add("one");
        q.add("two");
        q.poll("three");
        q.peek();
        System.out.println("value added" +q);
        q.isEmpty();


    }
}