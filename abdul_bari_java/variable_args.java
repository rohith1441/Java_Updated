package abdul_bari_java;

public class variable_args {
    static void show(int ...z){
        for(int x:z){
            System.out.println(x);
        }
    }
    static void showList(int start,String ...s){
        for(int i=0;i<s.length;i++){
            System.out.println(start+". "+s[i]);
            start++;
        }
    }

    public static void main(String[] args) {
        show();
        show(10,20,30);
        show(new int[]{1,23,45,234,235,2});
        showList(5,"john","smith");
    }
}
