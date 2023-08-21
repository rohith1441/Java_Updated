package abdul_bari_java.innnerclasses;
class outerrrrr{
    int x =10;
    static int y=20;
    public void display(){
        class Inner{
            public void show(){
                System.out.println("Hello");
            }
        }
        Inner inner = new Inner();
        inner.show();
    }
    static class my{
        public void showed(){
            System.out.println(" "+y);
        }
    }


}

public class clasesslersINnersadf {
    public static void main(String[] args) {
        outerrrrr o = new outerrrrr();
        o.display();
        outerrrrr.my m = new outerrrrr.my();
        m.showed();
    }
}

