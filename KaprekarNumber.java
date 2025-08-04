import java.util.Scanner;

public class KaprekarNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number:");
        String n = scanner.next();
        int num = Integer.parseInt(n);
        int sq = num * num;
        String sqStr = String.valueOf(sq);
        int len = sqStr.length();
        String leftPart = sqStr.substring(0, len / 2);
        String rightPart = sqStr.substring(len / 2);
        int leftNum = (leftPart.equals("")) ? 0 : Integer.parseInt(leftPart);
        int rightNum = Integer.parseInt(rightPart);
        int sum = leftNum + rightNum;

        if (sum == num) {
            System.out.println(num + " is a Kaprekar number.");
        } else {
            System.out.println(num + " is not a Kaprekar number.");
        }
    }
}
