import java.util.Scanner;
import java.lang.Math;
public class Circle extends Shape {
public Circle(double y) { 
    width_circle = y*y*Math.PI;
}
 public double area_circle(){
     return width_circle;
 }
public int area(){
    return 0;
}
} //s