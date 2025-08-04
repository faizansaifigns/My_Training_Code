
import java.util.Scanner;

public class catfoood {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
         for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter no. of rats");
        int r=sc.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum>=2*r){
                System.out.println("rats are full now !");
                System.out.println("only "+(i+1)+" houses are needed!");
                break;
            }
        }
        if(arr==null){
            System.out.println("-1");
            return;
        }
        if(sum<2*r){
            System.out.println("0");
            return;
        }    
    }

    
}
