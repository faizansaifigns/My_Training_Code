import java.util.*;
public class frequencyarr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s=sc.next();

        int[] freq=new int[26];
        int total_sum=0;
        for(char ch:s.toCharArray()){
            freq[ch-'a']++;
        }
        for(int i=0;i<26;i++){
            if(freq[i]>0){
                total_sum+=freq[i]*(i+1);
            }
            }
            System.out.println(total_sum);
        }
    
}

