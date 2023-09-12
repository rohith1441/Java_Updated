package abdul_bari_java.langdemo;

public class WrapperDemo {
    public static void main(String[] args) {
        Integer i = new Integer(10);
        Integer a = Integer.valueOf(10);
        Integer b=10;

        int m=10;
        Integer n=m;
        int p=n;

        int m1=15; //primitive type
        Integer m2=m1; //number class object will be created
        Integer m3=15;
        Integer m4=Integer.valueOf("1010",2);
        System.out.println(m2.equals(m3));
        System.out.println(m4);
        Integer m5= Integer.decode("0xA7");
        System.out.println(m5);


        float f1 = 12.5f;
        Float f2=12.5f/0;
        System.out.println(f1==f2);
        System.out.println(f2.isInfinite());
        System.out.println(f2==Float.POSITIVE_INFINITY);
        System.out.println(f2==Float.NEGATIVE_INFINITY);
        Float f3=(float)Math.sqrt(-1);
        System.out.println(f3.isNaN());
        System.out.println(f3!=Float.NaN);




        Character c = 'A';
        c.charValue();

    }
}
