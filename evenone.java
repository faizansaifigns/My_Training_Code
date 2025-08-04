
import java.util.Scanner;


public class evenone {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=n;
        int count=0;
        String bi="";
        while(n!=0){
            int rem=n%2;
            bi=rem+bi;
            if(rem==1){
                count++;
        }
        n=n/2;
    }
    System.out.println(bi);
    if(count%2==0){
    System.out.println("evil number ");
    }
    else{
        System.out.println("not evil num");
    }
    
}
}

// import java.util.Scanner;
// public class evenone {
//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int n=sc.nextInt();
//         String bi=Integer.toBinaryString(n);
//         int count=0;
//         for(char c:bi.toCharArray()){
//             if(c=='1'){
//                 count++;
//         }
//     }
// if(count%2==0){
//     System.out.println("evil number ");
// }
// else{
//     System.out.println("not evil num");
// }
//     }
// }
