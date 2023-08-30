package abdul_bari_java.static_and_finalsss;

public class demo_for_sinle {
    public static void main(String[] args) {
                coffeday m1 = coffeday.getInstance();
                coffeday m2 = coffeday.getInstance();
                coffeday m3 = coffeday.getInstance();
                if(m1==m2 && m1==m3){
                    System.out.println("same");
                }
            }
        }

