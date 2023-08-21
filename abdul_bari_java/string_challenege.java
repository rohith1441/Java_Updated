package abdul_bari_java;

public class string_challenege {
    public static void main(String[] args) {
        String str = "programmer@gmail.com";
        int i = str.indexOf('@');
        String name = str.substring(0,i);
        String domain = str.substring(i+1);
        System.out.println(name);
        System.out.println(domain);
        int j = domain.indexOf('.');
        String domain_name = domain.substring(0,j);
        System.out.println(domain_name);
        System.out.println(domain_name.equals("gmail"));

    }
}
