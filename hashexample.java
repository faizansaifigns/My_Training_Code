
import java.util.HashMap;
import java.util.Scanner;

public class hashexample {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String,Integer> map = new HashMap<>();
        map.put("apple",22);
        map.put("banana",21);
        map.put("mango", 22);
        System.out.print(map.keySet()+" ");
        System.out.println();
        System.out.print(map.values()+" ");
        System.out.println();
        System.out.print(map.entrySet()+" ");
        System.out.println(map.get("mango"));
    
}
}
