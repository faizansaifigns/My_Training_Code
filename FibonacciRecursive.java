

public class FibonacciRecursive {
    public static int fibo(int n){
        if(n<0){
            return -1;
        }
        else if(n==1||n==0){
            return n;
        }
        else{
            return  fibo(n-1)+fibo(n-2);
        }
    }
    public static int newfibo(int n){
        if(n<0){
            return -1;
        }
        if (n == 0) return 0;
        if (n == 1) return 1;

        int[] fi=new int[n+1];
        fi[0]=0;
        fi[1]=1;
        for(int i=2;i<=n;i++){
            fi[i]=fi[i-1]+fi[i-2];

        }
        return fi[n];
    }
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number:");
        // int n = sc.nextInt();
       // System.out.println(fibo(n));
        // for(int i=0;i<=n;i++){
        //     System.out.print(fibo(i)+" ");
        // }
        System.out.println(newfibo(70));
}
}


   
