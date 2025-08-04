import java.util.*;
public class array{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<n;i++)
{
    int a = sc.nextInt();
    arr.add(a);

}

int l=0;
int r=n-1;

while(l<r){
    int sum=arr.get(l)+arr.get(r);
    l++;
    r--;
    result.add(sum);
}
if(l==r){
    result.add(arr.get(l));
}

System.out.println(result);

}
}