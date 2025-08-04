import java.util.*;
public class harsadnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum=0;
        int temp=n;
        while(n>0){
            int rem=n%10;
            sum+=rem;
            n=n/10;
        }
        if(temp%sum==0){
            System.out.println("harshad number");
            }
            else{
                System.out.println("not a harshad number");
                }
                }
    
}
