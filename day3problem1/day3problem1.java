package day3problem1;
import java.util.Scanner;
import java.text.DecimalFormat;
public class day3problem1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat decform = new DecimalFormat("0.##");

        double x1 = 0;
        double x2 = 0;
        double y1 = 0;
        double y2 = 0;
        double length = 0;
        x1 = sc.nextInt();
        System.out.println("x1");
        x2 = sc.nextInt();
        System.out.println("x2");
        y1 = sc.nextInt();
        System.out.println("y1");
        y2 = sc.nextInt();
        System.out.println("y2");

        length = Math.sqrt(Math.pow(x2 - x1 ,2)  + (Math.pow(y2 - y1 ,2)));
        System.out.println("length" + decform.format(length));
    }
}