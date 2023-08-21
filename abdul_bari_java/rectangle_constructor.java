package abdul_bari_java;

public class rectangle_constructor {
    private double length;
    private double breadth;

    public rectangle_constructor(){
        length=1;
        breadth=2;
    }
    public rectangle_constructor(double l, double b){
        //this.breadth=breadth;
        //this.length=length;  //OR
        setLength(l);
        setBreadth(b);
    }

    public void setLength(double l){
        if(l>0) {
            length=l;
        }
        else
            length=0;
    }
    public void setBreadth(double b) {
        if(b>0) {
            breadth=b;
        }
        else
            breadth=0;
    }

    public double getLength() {
        return length;
    }

    public double getBreadth() {
        return breadth;
    }

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
        rectangle_constructor rectangleConstructor= new rectangle_constructor();
        System.out.println(rectangleConstructor.area());
        rectangle_constructor rectangleConstructor1= new rectangle_constructor(22,12);
        System.out.println(rectangleConstructor1.getLength());
        System.out.println(rectangleConstructor1.getBreadth());
        System.out.println(rectangleConstructor1.area());

    }


}
