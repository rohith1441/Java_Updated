package abdul_bari_java;

public class stringpractice {
    public static void main(String[] args) {
        String str1 = "a5";
        //shows weather the given expresiion matches or not and gives boolean as output
        boolean ans = str1.matches("[a-z][0-9]");
        System.out.println(ans);
    }
}
