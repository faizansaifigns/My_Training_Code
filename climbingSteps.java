public class climbingSteps {
    public static int climbStairs(int n) {
        if(n==0){
            return n;
        }
        else if (n==1) {
            return n;
        }
        else if(n==2){
            return n;
        }
         return climbStairs(n-1)+climbStairs(n-2);
        
}
public static int newclstep(int n){
    if(n<=1){
        return 1;
    }
    int[] cs=new int[n+1];
    cs[0]=1;
    cs[1]=1;
    for(int i=2;i<=n;i++){
        cs[i]=cs[i-1]+cs[i-2];
    }
    return cs[n];

}

public static void main(String[] args) {
  //  System.out.println(climbStairs(5));
    System.out.println(newclstep(70));

}
}


