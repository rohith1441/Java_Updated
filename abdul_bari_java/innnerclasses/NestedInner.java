package abdul_bari_java.innnerclasses;

class Outer {
    int x = 10;

    class Inner {
        int y = 20;

        public void innerDisplay() {
            System.out.println(x + " " + y);
        }
    }

    void outerDisplay() {
        Inner i = new Inner();
        System.out.println(x + " " + i.y);
    }
}
    public class NestedInner{
        public static void main(String[] args) {
            Outer outer = new Outer();
            outer.outerDisplay();
            Outer.Inner i = new Outer().new Inner();
            i.innerDisplay();
        }
    }
