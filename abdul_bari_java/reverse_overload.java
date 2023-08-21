package abdul_bari_java;

public class reverse_overload {
    public void reverse(int x){
        int r = 0;
        int rem =0;
        while(x>0){
            rem = x%10;
            r = r*10+rem;
            x = x/10;

        }
        System.out.println(r);
    }
    public void reverse(int[] arr){
        int[] arr1= new int[arr.length];
        for(int i=0,j=arr.length-1;i<arr.length;i++,j--){
            arr1[j]=arr[i];
        }
        for(int e:arr1){
            System.out.print(e+" ");
        }
    }

    public static void main(String[] args) {
        reverse_overload reversed = new reverse_overload();
        reversed.reverse(1231);
        int[] arr={12,34,55,6,7467,3};
        reversed.reverse(arr);
    }
}
