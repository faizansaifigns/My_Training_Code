import java.util.Scanner;

public class clockangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int m = sc.nextInt();
        h = h % 12;
        double hourAngle = 30 * h + 0.5 * m;
        double minuteAngle = 6 * m;
        double angle = Math.abs(hourAngle - minuteAngle);
       // angle = Math.min(angle, 360 - angle);
        System.out.println( angle);
    }
}
