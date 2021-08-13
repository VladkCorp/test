import java.util.Scanner;
import java.lang.Math.*;

public class Program {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        double y = sc.nextInt();
        Square a = new Square(x);
        Circle b = new Circle(y);

        a.area();

        System.out.println("HELLO");
        b.area_circle();
System.out.println("area of Square is " + a.area());
System.out.println("area of Circle is " + b.area_circle());
    }
}