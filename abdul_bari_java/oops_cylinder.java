package abdul_bari_java;

public class oops_cylinder {
    private int height;
    private int radius;

    public oops_cylinder(){

    }
    public oops_cylinder(int height){
        this.height = height;
    }

    public oops_cylinder(int height, int radius){
        this.height = height;
        this.radius = radius;
    }

    public void setHeight(int height){
        this.height = height;
    }
    public void setRadius(int Radius){
        radius = Radius;
    }
    public void setDimensions(int h, int r){
        height = h;
        radius = r;
    }

    public int getHeight(){
        return height;
    }

    public int getRadius() {
        return radius;
    }

    public static void main(String[] args) {
        oops_cylinder cylinder = new oops_cylinder();
        oops_cylinder cylinder1 = new oops_cylinder(25);
        oops_cylinder cylinder2 = new oops_cylinder(23,5);
        //cylinder.height=24;
        //System.out.println(cylinder.setRadius(33));
        cylinder1.setHeight(22);
        cylinder2.setHeight(54);
        cylinder2.setRadius(22);
        cylinder2.setDimensions(14,5);
        System.out.println(cylinder1.getHeight());
        System.out.println(cylinder2.getHeight());
        System.out.println(cylinder2.getRadius());

    }
}
