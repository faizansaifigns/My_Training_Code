
import java.util.Arrays;

public class stringsort {
    public static void main(String[] args) {
        String[] arr = {"apple", "banana", "cherry", "date", "elder"};
        Arrays.sort(arr,(a,b)-> Integer.compare(b.length(),a.length()));
        System.out.println(Arrays.toString(arr));
        Arrays.sort(arr,(a,b)->a.compareTo(b));
        System.out.println(Arrays.toString(arr));
    }
}
