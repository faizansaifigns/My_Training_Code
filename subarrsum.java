public class subarrsum {
    public static void main(String[] args) {
        
        int arr[] = {1, 6, 3, 4, 5};
        int win=3;
        int n = arr.length;
        
        int maxsum = Integer.MIN_VALUE;
        for(int i=0;i<=n-win;i++){
            int max=0;
            for(int j=i;j<i+win;j++){
                max+=arr[j];
                if(max>maxsum){
                    maxsum=max;
                }
            }
        }
        System.out.println("Max_Sum of subarrays of size "+win+" is "+maxsum);
    }
}
