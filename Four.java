
import java.util.Arrays;
import java.util.LinkedHashSet;
public class Four {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 1, 2, 3};
        int[] newArr = removeDuplicates(arr);
        System.out.println(Arrays.toString(newArr));
    }

    public static int[] removeDuplicates(int[] arr) {
        LinkedHashSet<Integer> set = new LinkedHashSet<>();
        for (int i : arr) {
            set.add(i);
        }
        int[] newArr = new int[set.size()];
        int i = 0;
        for (int num : set) {
            newArr[i++] = num;
        }
        return newArr;
    }
}

