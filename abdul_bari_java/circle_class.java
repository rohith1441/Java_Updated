package abdul_bari_java;

import java.time.chrono.JapaneseEra;

public class circle_class {
    public double radius;
    public double area(double radius){
        this.radius = radius;
        double area = 3.14*radius*radius;
        return area;
    }
    public double perimeter(double radius) {
        this.radius = radius;
        double perimeter = 2 * 3.14 * radius;
        return perimeter;
    }

    public static void main(String[] args) {
        circle_class circle = new circle_class();
        System.out.println(circle.area(5.5));
        System.out.println(circle.perimeter(5.5));
    }
}
