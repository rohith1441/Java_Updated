package abdul_bari_java;

public class rectangle_class {
    public double length;
    public double breadth;
    public double area(){
        return length*breadth;
    }
    public double perimeter(){
        return 2*(length+breadth);
    }
    public boolean isSquare(){
        return length==breadth;
    }

    public static void main(String[] args) {
        rectangle_class rectangle = new rectangle_class();
        rectangle.length=5;
        rectangle.breadth=5;
        System.out.println(rectangle.area());
        System.out.println(rectangle.perimeter());
        System.out.println(rectangle.isSquare());
    }

    public void setLength(int i) {
    }
}
