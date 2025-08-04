
import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         System.out.println("enter n:");
        int n = sc.nextInt();
        int[] fib = new int[n];
        fib[0] = 0;
        fib[1] = 1;
        for (int i = 2; i<n;i++){
        fib[i] = fib[i - 1] + fib[i - 2];
        }
        for (int i = 0; i<fib.length;i++){
                    System.out.print(fib[i]+" ");
        }
        System.out.println();
        System.out.println("enter nth number:");
       
        int n1 = sc.nextInt();
        System.out.println("fibonacci of "+n1+" is "+fib[n1]);
        
        }
        
    public static int fib(int n) {
        if (n <= 0) return 0;
        if (n == 1) return 1;

        int a = 0, b = 1;
        for (int i = 2; i <= n; i++) {
            int temp = a + b;
            a = b;
            b = temp;
        }
        return b;
    }
    
}
