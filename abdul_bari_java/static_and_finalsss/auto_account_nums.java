package abdul_bari_java.static_and_finalsss;

import java.util.Date;

class account{
    private String accountNum;
    private static int count=100;
    account(){
        accountNum = getAccoutNum();
    }
    private String getAccoutNum(){
        Date d = new Date();
        String acc;
        acc = "SBI-"+(d.getYear()+1900)+"-"+count;
        count++;
        return acc;
    }
    public String getaccount(){
        return accountNum;
    }
}
public class auto_account_nums {
    public static void main(String[] args) {
        int i =0;
        while(i<4){
            account account1=new account();
            System.out.println(account1.getaccount());
            i++;
        }
    }
}
