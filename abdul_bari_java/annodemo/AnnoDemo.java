package abdul_bari_java.annodemo;

import java.util.List;

/*abstract  class Parent{
    abstract public void display();
}

class Child extends Parent{
    @Override
    public void display() {

    }
}*/
/*class Oldcalss{
    public void display(){
        System.out.println("hello");
    }
    @Deprecated
    public void show()
    {
        System.out.println("Hi");
    }}*/

/*class My<T>{
    @SafeVarargs
    private void show(T...arg){
        for(T x:arg){
            System.out.println(x);
        }
    }
}*/
@FunctionalInterface
interface My{
    public void show();
}
public class AnnoDemo {
   // static List l;
   // @SuppressWarnings("unchecked")
    public static void main(String[] args) {
       // l.add(10);
        /*Oldcalss oldcalss = new Oldcalss();
        oldcalss.display();
        oldcalss.show();*/
    }

}
