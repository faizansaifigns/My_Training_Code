import java.util.*;
public class happy{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a=sc.next();
        int l=a.length();
        if(l%2!=0){
            System.out.println("NOt tech number ");
            
        }
        
            int p1=Integer.parseInt(a.substring(0, l/2));
            int p2=Integer.parseInt(a.substring(l/2, l));
            int sum=p1+p2;
            if(sum*sum==Integer.parseInt(a)){
                System.out.println("Tech number");
            }
            else
        {
            System.out.println("Not tech number");
        }

        
    

}
}