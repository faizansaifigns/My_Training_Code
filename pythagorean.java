
import java.util.Scanner;

public class pythagorean {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number:");
        int a = sc.nextInt();
        System.out.println("Enter the second number:");
        int b = sc.nextInt();
        System.out.println("Enter the third number:");
        int c = sc.nextInt();
        if (a * a + b * b == c * c || a*a+c*c==b*b || b*b + c*c==a*a ){
            System.out.println("'YES' Pythagorean triplet");
        }
        else{
            System.out.println("'NO' Pythagorean triplet");
        }
        boolmetod();
    }
    public static void boolmetod(){
        int a=13,b=5,c=12;
        boolean istrplet=a*a+b*b==c*c||b*b+c*c==a*a||a*a+c*c==b*b;
        System.out.println(istrplet ? "yes": "no");
    }
       
    
}
