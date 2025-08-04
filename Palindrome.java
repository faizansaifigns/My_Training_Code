import java.util.*;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
boolean samechar=true;
        for(int i=1;i<word.length();i++){
            if(word.charAt(i)!=word.charAt(0)){
                samechar=false;
                break;
            }
        }
        if(samechar==true){
            System.out.println("word contain only one charater");
            System.out.println("longest non palindromic substring :"+word.substring(0,word.length()-1));
            return;
        }
        int left = 0;
        int right = word.length() - 1;
        boolean isPalindrome = true;
        while (left < right) {
            if (word.charAt(left) != word.charAt(right)) {
                isPalindrome = false;
                break;
            }
            left++;
            right--;
        }
        if (isPalindrome) {
            System.out.println(word + " is a palindrome.");
        } else {
            System.out.println(word + " is not a palindrome.");
            System.out.println("longest non palindromic substring :"+word.substring(0,word.length()-1));
            return;
        }
        
        System.out.println("longest non palindromic substring :"+word.substring(0,word.length()-1));
    }
}
