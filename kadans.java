public class kadans {
    public static int maxsub(int [] arr){
        int currmax=arr[0];
        int maxsofar=arr[0];
        for(int i=1;i<arr.length;i++){
            currmax=Math.max(arr[i],currmax+arr[i]);
            maxsofar=Math.max(maxsofar,currmax);
        }
        return maxsofar;

    }
    public static void main(String[] args) {
        int [] arr={-2,1,-3,4,-1,2,1,-4};
        System.out.println(maxsub(arr));
        }
    
}
