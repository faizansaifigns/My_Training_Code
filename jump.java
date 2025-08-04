public class jump {
    public static void main(String[] args) {
        int[] points={1,2,3,5,1,1,10};
        int n=points.length;
        int i=0,total=0;
        while(i<n){
            total+=points[i];
            if(i+3>=n) break;
            int maxjump=i+1;
            for(int j=i+1;j<=i+3 && j<n ;j++){
                if(points[j]>points[maxjump])
                maxjump=j;
            }
            i=maxjump;
        }
        while(i<n){
            total+=points[i];
            i+=3;

        }
        System.out.println("Max points: "+total);
    
}
}
