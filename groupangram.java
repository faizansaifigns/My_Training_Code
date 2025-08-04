
import java.util.ArrayList;
import java.util.Arrays;

public class groupangram {
    public static void main(String[] args) {
    String[] str={"eat","tea","tan","ate","nat","bat"};
    ArrayList<String> lists=new ArrayList<>();
    for(int i=0;i<str.length-1;i++){
        ArrayList<String> list=new ArrayList<>();
        for(int j=i+1;j<str.length;j++){
        if(isAnagram(str[i],str[j])){
            list.add(str[i]);
            list.add(str[j]);
        }
           lists.addAll(list);
        
    }
    System.out.println(lists);
}
}
public static boolean isAnagram(String s1, String s2) {
    if(s1.length()!=s2.length()){
        return false;
        }
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        for(int i=0;i<arr1.length;i++){
            if(arr1[i]!=arr2[i]){
                return false;
            }
        }
        return true;
    }
}