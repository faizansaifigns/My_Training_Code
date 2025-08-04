
import java.lang.reflect.Array;
import java.util.Arrays;

public class fractionknapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("number of items");
        int n = sc.nextInt();
        int[] w = new int[n];
        int[] v = new int[n];
        for (int i = 0; i<n;i++){
            System.out.println("enter the weight of item "+(i+1));
            w[i] = sc.nextInt();
            System.out.println("enter the value of item "+(i+1));
            v[i] = sc.nextInt();
        }
        System.out.println("enter capacity:");
        int c = sc.nextInt();
        int[] farr=new int[n];
        for(int i=0;i<n;i++){
            farr[i]=v[i]/w[i];
        }
        Arrays.sort(farr);

    
}
}