import java.util.*;
public class diffevenodd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int result=0;
        for(int i=0;i<n;i++){
            if(i%2==0){
                result+=arr[i];
            }
            else{
                result=Math.abs(result-arr[i]);
            }
        }
        System.out.println(result);
    
}
}
