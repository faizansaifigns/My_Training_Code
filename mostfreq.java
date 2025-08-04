
import java.util.*;

public class mostfreq {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int k=sc.nextInt();
        HashMap<Integer,Integer> freq=new HashMap<>();
        for(int nums:arr){
            freq.put(nums,freq.getOrDefault(nums, 0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(freq.entrySet());
        list.sort((a, b) -> b.getValue() - a.getValue());

        
        
        for(int i = 0; i < k ; i++) {
            System.out.print(list.get(i).getKey()+" ");
        

    }
    
}
}
