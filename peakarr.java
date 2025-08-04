import java.util.*;
public class peakarr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        int a=sc.nextInt();
        int b[]=new int[a];
        int peak=0;
        int velly=0;
        for(int i=0;i<a;i++){
            b[i]=sc.nextInt();
        }
        for(int j=1;j<a-1;j++){
            if(b[j]>b[j-1] && b[j]>b[j+1]){
                peak+=b[j];
            }
            else if(b[j]<b[j-1] && b[j]<b[j+1]){
                velly+=b[j];
            }
        }
        System.out.println("sum of peak "+peak);
        System.out.println("sum of valley "+velly);
    }
    
}
