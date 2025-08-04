import java.util.*;
public class digitspsum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] arr=new String[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.next();
        }
        int result=0;
        for(int i=0;i<n;i++){
            int first=Integer.parseInt(arr[i].substring(0,1));
            int last=Integer.parseInt(arr[i].substring(arr[i].length()-1));
            int diff=Math.abs(first-last);
            result=result+diff;
        }
        System.out.println(result);
        
    
}
}
