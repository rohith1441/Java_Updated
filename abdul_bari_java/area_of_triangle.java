package abdul_bari_java;

public class area_of_triangle {
    public float area(int breadth,int height){
        float area;
        area = (breadth*height)/2;
        return area;

    }
    public float area(int a,int b,int c){
        float area;
        float S;
        S = (a+b+c)/2;
        area = S*(S-a)*(S-b)*(S-c);
        float Area = (float) Math.sqrt(area);
        return Area;

    }

    public static void main(String[] args) {
        area_of_triangle area1 = new area_of_triangle();
        System.out.println(area1.area(2,4));
        System.out.println(area1.area(5,6,7));
    }
}
