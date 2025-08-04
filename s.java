import java.util.*;
public class s {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter traffic light: ");
        String n = sc.nextLine();
        if(n.equals("Green")){
            System.out.println("you will go");
        }
        else if(n.equals("Yellow")){
            System.out.println("will slow");
        }
        else{
            System.out.println("PLEASE STOP");
        }
    }
}
