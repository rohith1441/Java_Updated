package abdul_bari_java;

public class reverse_override extends reverse_overload{
    public void reverse(int z){
        int r = 0;
        int rem =0;
        while(z>0){
            rem = z%10;
            r = r*10+rem;
            z = z/10;

        }
        System.out.println(r);
    }
    public void name(){
        System.out.println("sappi");
    }

    public static void main(String[] args) {
        reverse_override override = new reverse_override();
        override.reverse(433);
        int[] arr={12,34,55,6,7467,3,4556,345};
        override.reverse(arr);
        override.name();
    }

}
