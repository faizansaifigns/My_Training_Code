
import java.util.Arrays;

public class railwaysystem {
    public static void main(String[] args) {
        int[] arrival={900,940,950,110,1500,1800};
        int[] departure={910,1200,1120,1130,1900,2000};
        int n=arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        int platformNeede=1;
        int maxplatforms=1;
        int i=1;
        int j=0;
        while(i<n&&j<n){
            if(arrival[i]<=departure[j]){
                platformNeede++;
                i++;
            }
            else{
                platformNeede--;
                j++;
            }
        }
        maxplatforms=Math.max(maxplatforms,platformNeede);
        System.out.println(maxplatforms);
        
    
    }
}
