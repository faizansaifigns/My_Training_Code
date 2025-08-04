
import java.util.ArrayList;
import java.util.Scanner;

public class removeduplicate {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    String s=sc.nextLine();
    String[] str=s.split(" ");
    ArrayList<Integer> arr=new ArrayList<>();
    for(int i=0;i<str.length;i++){
        arr.add(Integer.parseInt(str[i]));
    }
    ArrayList<Integer> result=new ArrayList<>();
    for(int i=0;i<arr.size();i++){
        int curr=arr.get(i);
        boolean f=false;
        for(int j=0;j<result.size();j++){
            if(result.get(j)==curr){
                f=true;
                break;
            }
            
        }
        if(!f){
            result.add(arr.get(i));
        }
        
    }
    System.out.println(result);

    

}
    
}
