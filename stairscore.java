import java.util.*;
public class stairscore {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
         int score1=0;
         int score2=0;
         for(int i=0;i<n;i++){
            if(i%2!=0){
                score1+=arr[i];
            }
            else{
                score2+=arr[i];
            }
         }
         int finalscore=Math.min(score1, score2);
         System.out.println(finalscore);

        }
    
}
