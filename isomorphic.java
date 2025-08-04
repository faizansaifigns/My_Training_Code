
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class isomorphic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str1=sc.next();
        String str2=sc.next();
        char[] arr=str1.toCharArray();
        HashMap<Character,Integer> map1=new HashMap<>();
        for(char ch:arr){
            map1.put(ch,map1.getOrDefault(ch, 0)+1);
        }
        List<Map.Entry<Character, Integer>> list1 = new ArrayList<>(map1.entrySet());
        list1.sort((a, b) -> b.getValue() - a.getValue());
//for string 2
         char[] arr2=str2.toCharArray();
        HashMap<Character,Integer> map2=new HashMap<>();
        for(char ch:arr2){
            map2.put(ch,map2.getOrDefault(ch, 0)+1);
        }
        List<Map.Entry<Character, Integer>> list2 = new ArrayList<>(map2.entrySet());
        list2.sort((a, b) -> b.getValue() - a.getValue());
        boolean isomorphic=true;
        for(int i=0;i<list1.size();i++){
            if(list1.get(i).getValue()!=list2.get(i).getValue()){
                isomorphic=false;
            }
        }
        if(isomorphic){
            System.out.println("isomorphic ");
        }
        else{
            System.out.println("not isomorphic:");
        }


        }
        }
        
    

    

