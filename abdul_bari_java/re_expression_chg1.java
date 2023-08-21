package abdul_bari_java;

public class re_expression_chg1 {
    public static void main(String[] args) {
        // binary numbers checking
        int b = 100101001;
        String str = b+"";
        System.out.println(str.matches("[01]+"));
        // Hexadecimal or not
        String str1 = "1AF";
        System.out.println(str1.matches("[0-9A-F]+"));
        //date format
        String date = "01/12/2000";
        System.out.println(date.matches("[0-3][0-9]/[01][0-2]/[0-9]{4}"));
    }
}
