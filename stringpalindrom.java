import java.util.*;
public class stringpalindrom {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");  
        String str = sc.next();
        int l=0;
        int r=str.length()-1;
        int sum=0;
        boolean ispalindrom=true;
        while(l<r){
            if(str.charAt(l)!=str.charAt(r)){
                ispalindrom=false;
        }
        l++;
        r--;
                                }
                                for(int i=0;i<str.length();i++){
                                    char ch=str.charAt(i);
                                    sum+=(int)ch;
                                }
                                if(ispalindrom==true){
                                    System.out.println("The string is a palindrome");
                                    System.out.println("ASCII VALUE :"+sum);

                                }
                                else{
                                    System.out.println("The string is not a palindrome: -1");
                                }
                                sc.close();
                            }
                            
    
}
