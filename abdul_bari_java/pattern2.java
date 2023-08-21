package abdul_bari_java;

public class pattern2 {
    public static void main(String[] args) {
        int count=0;

        for (int i = 5; i >= 0; i--) {
            for (int j = 1; j <=i; j++){
                count++;
                //System.out.println(j+" ");
                //System.out.print(count+" ");
                //System.out.print(j+" ");
                System.out.format("%02d ",count);
            }
            System.out.println("");

        }

    }
}