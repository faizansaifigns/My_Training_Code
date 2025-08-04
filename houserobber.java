import java.util.*;
public class houserobber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] price = new int[n];
        for (int i = 0; i<n;i++){
            price[i] = sc.nextInt();
        }

        
        //int maxloot=houserob(price);
        //System.out.println(maxloot);
        // int loot1=circulerloot(price, 0, price.length-2);
        // int loot2=circulerloot(price, 1, price.length-1);
        // System.out.println(Math.max(loot1,loot2));
        System.out.println(robnew(price));
        
        

}
public static int robnew(int[] price){
    int n=price.length;
    if(n==0) return 0;
    if(n==1) return price[0];
    int[] dp=new int[n];
    dp[1]=price[1];
    for(int i=2;i<n;i++){
        dp[i]=Math.max(dp[i-1],dp[i-2]+price[i]);
    }
    int[] dp2=new int[n];
    dp2[0]=0;
    for(int i=1;i<n-1;i++){
        dp2[i]=Math.max(dp2[i-1],(i-2 >=0 ? dp2[i-2] : 0) + price[i]);
    }
    return Math.max(dp[n-1],dp2[n-2]);
}
public static int circulerloot(int[] price,int start,int end){
    int pre1=0;
    int pre2=0;
    for(int i=start;i<=end;i++){
        
        int temp=pre1;
        pre1=Math.max(pre2+price[i],pre1);
        pre2=temp;
    }
    return pre1;
}
public static int houserob(int[] price){
    int n=price.length;
    int[] dp=new int[n];
     if(n==0){
        return price[0];
    }
    dp[0]=price[0];
     if(n==0){
        return price[0];
    }
    if(n==1){
        return dp[0];
    }
    dp[1]=Math.max(price[0], price[1]);
    
    for(int i=2;i<n;i++){
        dp[i]=Math.max(dp[i-1],dp[i-2]+price[i]); 
    }
    return dp[n-1];
}
}

