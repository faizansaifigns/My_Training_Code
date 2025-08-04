
import java.util.Scanner;

public class armstrongno {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String sq=String.valueOf(n);
        int sum = 0;
        int temp = n;
        int count = sq.length();
        while (temp != 0) {
            int rem = temp % 10;
            sum = sum + (int) Math.pow(rem, count);
            temp = temp / 10;;
            }
            if (n == sum) {
                System.out.println(n + " is an Armstrong number");
                } else {
                    System.out.println(n + " is not an Armstrong number");
                    }
                    }
                
}
