import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class knapsack {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();          
        int w = sc.nextInt();          

        int[][] arr = new int[n][2];   
        for (int i = 0; i < n; i++) {
            arr[i][0] = sc.nextInt();  
            arr[i][1] = sc.nextInt();  
        }
       
        Arrays.sort(arr, (a, b) -> Double.compare((double)b[0]/b[1], (double)a[0]/a[1]));

        ArrayList<Integer> dp = new ArrayList<>();
        int totalValue = 0;

        for (int i = 0; i < n; i++) {
            if (w >= arr[i][1]) {
                dp.add(arr[i][0]);
                totalValue += arr[i][0];
                w -= arr[i][1];
            }
        }

        System.out.println(totalValue);  
}
}
