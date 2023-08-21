package abdul_bari_java;public class data_hiding {
    private double length;
    private double breadth;

    public void setLength(double length) {
        if(length>0)
            this.length = length;
        else
            this.length=0;
    }

    public void setBreadth(double breadth) {
        this.breadth = breadth;
    }

    public double getLength(){
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
        data_hiding rectangle = new data_hiding();
        rectangle.setLength(10);
        rectangle.setBreadth(2);
        System.out.println("area: "+rectangle.area());
        System.out.println("perimeter: "+rectangle.perimeter());
        System.out.println(rectangle.isSquare());
    }
}
